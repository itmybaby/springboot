package com.example.demo.service;

import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :小虎
 * @date :2017/12/25
 */

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> findAccountList() {
        return userMapper.findAccountList();
    }
}
