package com.hlx.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class TestController {

    @RequestMapping("/test")
    public String testRtn(){
        System.out.println("123");
        return "123";
    }
}
