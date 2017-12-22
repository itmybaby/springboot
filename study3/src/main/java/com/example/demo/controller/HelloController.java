package com.example.demo.controller;

import com.example.demo.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :小虎
 * @date :2017/12/22
 */


@RestController
public class HelloController {

    @Autowired
    private Config config;

    @Autowired
    private Environment environment;

    @Value("${my.name}")
    private String name;

    @RequestMapping("/")
    public String hello(){
        return config.toString();
    }
    @RequestMapping("/name")
    public String name(){
        return name;
    }
    @RequestMapping("/env")
    public String env(){
        return environment.getProperty("my.port");
    }
}
