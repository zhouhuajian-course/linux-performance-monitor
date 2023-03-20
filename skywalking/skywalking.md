# SkyWalking

https://skywalking.apache.org/

https://archive.apache.org/dist/skywalking/8.9.1/apache-skywalking-apm-8.9.1.tar.gz

https://archive.apache.org/dist/skywalking/java-agent/8.8.0/apache-skywalking-java-agent-8.8.0.tgz


simple-web-server 启动三个服务

```text

订单系统
-javaagent:C:\Users\zhouh\Desktop\skywalking-agent\skywalking-agent.jar
-Dskywalking.agent.service_name=OrderSystem
-Dserver.port=8081

库存系统
-javaagent:C:\Users\zhouh\Desktop\skywalking-agent\skywalking-agent.jar
-Dskywalking.agent.service_name=StockSystem
-Dserver.port=8082

物流系统
-javaagent:C:\Users\zhouh\Desktop\skywalking-agent\skywalking-agent.jar
-Dskywalking.agent.service_name=LogisticsSystem
-Dserver.port=8083
```

![server-run-configuration.png](server-run-configuration.png)

![skywalking01.png](skywalking01.png)

![skywalking02.png](skywalking02.png)

![skywalking03.png](skywalking03.png)

