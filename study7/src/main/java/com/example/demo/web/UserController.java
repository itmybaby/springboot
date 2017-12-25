package com.example.demo.web;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author :小虎
 * @date :2017/12/25
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public List<User> list(){
        return userService.findAccountList();
    }
}
