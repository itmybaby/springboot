package com.example.demo.controller;

import com.example.demo.handler.MyException;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :小虎
 * @date :2017/12/22
 */


@RestController
public class HomeController {

    @RequestMapping("/")
    public Student home(ModelMap map){
        Student student = new Student(1,(String) map.get("author"),12);
        return student;
    }

    @RequestMapping("/zeroException")
    public int zeroException(){
        return 100/0;
    }

    @RequestMapping("/myException")
    public int myException(){
        throw  new MyException("100","codeError");
    }
}
