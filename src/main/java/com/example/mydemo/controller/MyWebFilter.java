package com.example.mydemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myfilter")
public class MyWebFilter {
    @RequestMapping("/sayHallo")
    public String testFilter(){
        System.out.println("执行接口controller");
        return "say hallo";
    }
}
