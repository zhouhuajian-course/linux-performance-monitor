package simple.web.server;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {
    @RequestMapping("/create")
    public Object create() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        // 库存减1
        HttpPost httpPost = new HttpPost("http://localhost:8082/stock/decrease");
        CloseableHttpResponse response = httpClient.execute(httpPost);
        System.out.println(response);
        // 物流加1
        HttpPost httpPost2 = new HttpPost("http://localhost:8083/logistics/create");
        CloseableHttpResponse response2 = httpClient.execute(httpPost2);
        System.out.println(response2);
        return new HashMap<>();
    }
}
