package com.zjw.spring.demo;

public class UserInstanceFactory {

    public User getUser(){
        User user = new User();
        user.setName("小丽");
        user.setAge(25);
        user.setSex("女");
        return user;
    }
}
