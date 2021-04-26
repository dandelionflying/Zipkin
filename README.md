# Zipkin
Zipkin learning



自建zipkin server 遇到问题
解决：

```xml
<dependency>
    <groupId>io.zipkin</groupId>
    <artifactId>zipkin-server</artifactId>
    <version>2.22.1</version>
</dependency>
<dependency>
    <groupId>io.zipkin.java</groupId>
    <artifactId>zipkin-autoconfigure-ui</artifactId>
    <version>2.12.9</version>
</dependency>
```

将上述依赖替换为

```xml
<dependency>
    <groupId>io.zipkin</groupId>
    <artifactId>zipkin-server</artifactId>
    <version>2.22.1</version>
</dependency>
```

