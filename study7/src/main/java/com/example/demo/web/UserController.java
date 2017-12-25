package com.example.demo.web;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author :小虎
 * @date :2017/12/25
 */

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public List<User> list(){
        return userService.findAccountList();
    }

    /**
     * 返回html模板.
     */
    @RequestMapping("/hello")
    public  String hello(ModelMap map){
        map.put("hello","hello world");
        return "helloHtml";
    }

    /**
     * 返回Ftl模板.
     */
    @RequestMapping("/helloFtl")
    public String helloFtl(ModelMap map){
        map.put("hello","from TemplateController.helloFtl");
        return"/helloFtl";
    }
}
