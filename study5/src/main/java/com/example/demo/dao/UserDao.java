package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author :小虎
 * @date :2017/12/22
 */


public interface UserDao extends JpaRepository<User,Integer> {
}
