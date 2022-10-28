# 用logback把日志发送的ELK的示例代码
- new, 20221028, 2ltnqgc1@duck.com

启动项目，访问地址 localhost:8080/demo/testlog 即可触发日志。
然后去 ELK stack 的 kibana web 界面浏览查看日志。
## 说明
项目假设安装了 ELK stack 7.17.7，且在 172.16.12.17:4560 端口上监听 logback 的日志。
该监听对应的 logstash 的 pipeline 的 input 段配置如下
```conf
input {
  tcp {
    host => "0.0.0.0"
    port => "4560"
    mode => "server"
    codec => json_lines
  }
  stdin {}
}
# ...
```