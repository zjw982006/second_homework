package com.zjw.spring.demo;

public class UserStaticFactory {

    public static User getUser(){
        User user = new User();
        user.setName("小红");
        user.setAge(18);
        user.setSex("女");
        return user;
    }
}
