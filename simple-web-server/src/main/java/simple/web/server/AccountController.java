package simple.web.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    // http://localhost:8080/account/transfer?to=2&amount=100.00
    // {"code":0,"message":"转账成功","data":{"uid":1,"amount":100.0,"to":2}}
    @RequestMapping("/transfer")
    public Response transfer(@RequestParam int to, @RequestParam double amount) throws IOException {
        // 假设通过Session获取的当前登录的用户ID
        int uid = 1;

        if (accountService.transfer(uid, to, amount)) {
            Map<String, Object> data = new HashMap<>();
            data.put("uid", uid);
            data.put("to", to);
            data.put("amount", amount);
            return Response.success("转账成功", data);
        } else {
            return Response.error(100123, "转账失败");
        }


    }
}
