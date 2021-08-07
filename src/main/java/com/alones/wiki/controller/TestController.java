package com.alones.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello word!";
    }
}
