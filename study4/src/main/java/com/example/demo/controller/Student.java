package com.example.demo.controller;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author :小虎
 * @date :2017/12/22
 */


public class Student {
    @JSONField(serialize = false)
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
