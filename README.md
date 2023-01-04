# Linux 性能监控工具

## 工具

+ top

+ htop

+ [nmon](nmon.md)

## 接口

+ http://192.168.1.103:8080/user/login?user=zhouhuajian&pwd=123456  
  {"code":0,"message":"登录成功","data":null}

## 备注

+ CentOS 安装文件上传下载工具   
  yum update  
  yum install lrzsz -y

+ Jmeter 样本结果默认编码改为UTF-8  
  jmeter.properties  
  ```properties
  # The encoding to be used if none is provided (default ISO-8859-1)
  #sampleresult.default.encoding=ISO-8859-1
  sampleresult.default.encoding=UTF-8
  ```

