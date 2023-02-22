package simple.web.server;

import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class AccountService {
    public boolean transfer(int uid, int to, double amount) throws IOException {
        // 每秒记录转账日志 留痕
        // 用作性能测试，实际项目不会这样写日志
        Date dateNow = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyyMMdd-HHmm");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]");
        String filePath = System.getProperty("user.dir") + "/account-transfer-log-" + simpleDateFormat1.format(dateNow) + ".txt";
        // System.out.println(System.getProperty("user.dir"));

        try (FileWriter fw = new FileWriter(filePath, true)) {
            fw.write(simpleDateFormat2.format(dateNow) + " " + uid + " transfer " + amount + " to " + to + " \n");
        }
        return true;
    }
}
