package com.example.demo.web;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author :小虎
 * @date :2017/12/22
 */


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> getUsers() {
        return userDao.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserDaoById(@PathVariable("id") int id) {
        return userDao.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateUserDao(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "money", required = true) double money) {
        User user = new User();
        user.setMoney(money);
        user.setName(name);
        user.setId(id);
        User user1 = userDao.saveAndFlush(user);
        return user1.toString();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postUserDao(@RequestParam(value = "name") String name,
                              @RequestParam(value = "money") double money) {
        User user = new User();
        user.setMoney(money);
        user.setName(name);
        User UserDao1 = userDao.save(user);
        return UserDao1.toString();

    }


}
