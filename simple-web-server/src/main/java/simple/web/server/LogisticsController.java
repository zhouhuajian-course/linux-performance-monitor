package simple.web.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/logistics")
public class LogisticsController {
    @RequestMapping("/create")
    public Object create() {
        return new HashMap<>();
    }
}
