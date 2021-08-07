package com.alones.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 */
@RestController
public class TestController {

    @Value("${test.hello}")
    private String testHello;

    @RequestMapping("/hello")
    public String hello(){
        return "hello wordasd!"+testHello;
    }
}
