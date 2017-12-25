package com.example.demo.dao;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author :小虎
 * @date :2017/12/25
 */

@Mapper
public interface UserMapper {
    @Insert("insert into user(name, money) values(#{name}, #{money})")
    int add(@Param("name") String name, @Param("money") double money);

    @Update("update user set name = #{name}, money = #{money} where id = #{id}")
    int update(@Param("name") String name, @Param("money") double money, @Param("id") int  id);

    @Delete("delete from user where id = #{id}")
    int delete(int id);

    @Select("select id, name as name, money as money from user where id = #{id}")
    User findAccount(@Param("id") int id);

    @Select("select id, name as name, money as money from user")
    List<User> findAccountList();
}
