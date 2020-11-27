package com.tyb1222.demo;

import com.tyb1222.demo.server.ThriftServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean(initMethod = "start")
    public ThriftServer thriftServer() {
        ThriftServer thriftServer = new ThriftServer();
        return thriftServer;
    }

}
