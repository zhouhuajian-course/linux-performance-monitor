package simple.web.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import simple.web.server.pojo.Response;

@RestController
@RequestMapping("/user")
public class UserController {

    // http://localhost:8080/user/login?user=zhouhuajian&pwd=123456
    @RequestMapping("/login")
    public Response login(@RequestParam("user") String user, @RequestParam("pwd") String pwd) {
        // System.out.println(user);
        // System.out.println(pwd);
        return Response.success("登录成功", null);
    }

}
