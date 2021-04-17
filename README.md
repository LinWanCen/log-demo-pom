# 日志配置 Log Configuration

## 配置文件 Configuration File

[log4j2.xml](log4j2-demo/src/main/resources/log4j2.xml)

[logback.xml](logback-demo/src/main/resources/logback.xml)


## 演示程序 Demo Program

[Log4j2Demo.java](log4j2-demo/src/main/java/io/github/linwancen/demo/log4j2/Log4j2Demo.java)

[LogbackDemo.java](logback-demo/src/main/java/io/github/linwancen/demo/logback/LogbackDemo.java)


## 依赖配置 Maven pom

[log4j2-demo/pom.xml](log4j2-demo/pom.xml)

[logback-demo/pom.xml](logback-demo/pom.xml)


## 官方文档参考 Documentation

[log4j2](http://logging.apache.org/log4j/2.x/manual/appenders.html)

[logback](http://logback.qos.ch/manual/appenders.html)

[slf4j](http://www.slf4j.org/faq.html#yet_another_facade)


## 说明 Note

下面的配置是无输出\
The following configuration is no output
```xml
    <AsyncLogger name="io.github.linwancen.demo" level="warn" additivity="false"/>
```


## 更新日志 Update log

2020-04-17 \
分环境打包举例 \
Example of env profile

2020-11-27 \
增加了在 IntelliJ IDEA 中显示链接的配置，用于演示程序 \
Add show link for demo


## 代码扫描 SonarCloud

指标  | 徽章
---   | ---
安全  | [![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=LinWanCen_log-demo-pom&metric=security_rating)](https://sonarcloud.io/dashboard?id=LinWanCen_log-demo-pom)
可维护| [![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=LinWanCen_log-demo-pom&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=LinWanCen_log-demo-pom)
可靠性| [![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=LinWanCen_log-demo-pom&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=LinWanCen_log-demo-pom)
错误  | [![Bugs](https://sonarcloud.io/api/project_badges/measure?project=LinWanCen_log-demo-pom&metric=bugs)](https://sonarcloud.io/dashboard?id=LinWanCen_log-demo-pom)
漏洞  | [![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=LinWanCen_log-demo-pom&metric=vulnerabilities)](https://sonarcloud.io/dashboard?id=LinWanCen_log-demo-pom)
代码行| [![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=LinWanCen_log-demo-pom&metric=ncloc)](https://sonarcloud.io/dashboard?id=LinWanCen_log-demo-pom)
