package simple.web.server;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import simple.web.server.Response;

@RestController
@RequestMapping("/user")
public class UserController {

    // http://localhost:8080/user/login?user=zhouhuajian&pwd=123456
    @RequestMapping("/login")
    public Response login(@RequestParam("user") String user, @RequestParam("pwd") String pwd) {
        return Response.success("登录成功", null);
    }

    // http://localhost:8080/user/test
    @RequestMapping(value = "/test", produces = "text/html")
    public String test() {
        return "<!DOCTYPE html>" +
                "<html><body>" +
                "<ul>" +
                "<li>1</li>" +
                "<li>2</li>" +
                "</ul>" +
                "</body></html>";
    }


    // http://localhost:8080/user/test2
    @RequestMapping(value = "/test2", produces = "text/html")
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public String test2() {
        return "<!DOCTYPE html>" +
                "<html><body>" +
                "<ul>" +
                "<li>1</li>" +
                "<li>2</li>" +
                "</ul>" +
                "</body></html>";
    }

}
