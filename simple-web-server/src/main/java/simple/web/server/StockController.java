package simple.web.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/stock")
public class StockController {
    @RequestMapping("/decrease")
    public Object decrease() {
        return new HashMap<>();
    }
}
