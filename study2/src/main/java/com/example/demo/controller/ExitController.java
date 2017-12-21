package com.example.demo.controller;

import com.example.demo.Study2Application;
import com.example.demo.config.ExitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :小虎
 * @date :2017/12/21
 */


@RestController
public class ExitController extends ApplicationObjectSupport{

    @Autowired
    private ExitConfig exitConfig;

    @RequestMapping("/exit")
    public void exit(){
        SpringApplication.exit(super.getApplicationContext(),exitConfig);
    }
}
