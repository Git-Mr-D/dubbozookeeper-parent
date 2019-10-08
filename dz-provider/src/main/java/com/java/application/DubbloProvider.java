package com.java.application;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class DubbloProvider {
    public static void main(String[] args) {
        SpringApplication.run(DubbloProvider.class,args);
    }
}
