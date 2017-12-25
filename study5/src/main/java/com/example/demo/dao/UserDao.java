package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import java.util.List;

/**
 * @author :小虎
 * @date :2017/12/22
 */


public interface UserDao extends JpaRepository<User,Integer>,QueryDslPredicateExecutor {

    User findByName(String name);

    List<User> findByIdGreaterThan(int num);

    int countByName(String name);
}
