package simple.web.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/customer")
public class AccountController {

    class ResponseTest {
        private int code;
        private String message;
        ResponseTest() {
            code = 0;
            message = null;
        }
    }

    // http://localhost:8080/customer/add?name=joe&phone=13700000000
    // {"code":0,"message":null}
    @RequestMapping("/add")
    public ResponseTest transfer(@RequestParam Sting name, @RequestParam double amount) {
        return new ResponseTest();
    }
}
