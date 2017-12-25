package com.example.demo.dao.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author :小虎
 * @date :2017/12/25
 */

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(User user) {
        return jdbcTemplate.update("insert into user(name, money) values(?, ?)",
                user.getName(),user.getMoney());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("delete from user wehre id = ?",id);
    }

    @Override
    public int update(User user) {
        return jdbcTemplate.update("UPDATE  user SET NAME=? ,money=? WHERE id=?",
                user.getName(),user.getMoney(),user.getId());
    }

    @Override
    public User findUserById(int id) {
        List<User> list = jdbcTemplate.query("select * from USER where id = ?", new Object[]{id}, new BeanPropertyRowMapper(User.class));
        if(list!=null && list.size()>0){
            User user = list.get(0);
            return user;
        }else{
            return null;
        }
    }

    @Override
    public List<User> findUserList() {
        List<User> list = jdbcTemplate.query("select * from USER ", new Object[]{}, new BeanPropertyRowMapper(User.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }
}
