package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;

/**
 * @author :小虎
 * @date :2017/12/25
 */


public interface UserDao {
    int add(User user);

    int delete(int id);

    int update(User user);

    User findUserById(int id);

    List<User> findUserList();
}
