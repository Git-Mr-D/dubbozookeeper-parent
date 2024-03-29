package com.java.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.java.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Reference(version = "dz")
    private HelloService helloService;

    @RequestMapping("/getHello.do")
    public @ResponseBody String getHello(){
        return helloService.findHelloAll();
    }
}
