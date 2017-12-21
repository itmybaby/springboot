package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :小虎
 * @date :2017/12/21
 */

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "hello world";
    }
}
