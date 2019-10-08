package com.java.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.service.HelloService;

@Service(version = "dz")
public class HelloServiceImpl implements HelloService {

    @Override
    public String findHelloAll() {
        return "Hello分布式!!!";
    }
}
