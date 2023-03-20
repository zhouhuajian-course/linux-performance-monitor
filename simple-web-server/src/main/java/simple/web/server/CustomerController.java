package simple.web.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

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
    public ResponseTest transfer(@RequestParam String name, @RequestParam String phone) {
        return new ResponseTest();
    }
}
