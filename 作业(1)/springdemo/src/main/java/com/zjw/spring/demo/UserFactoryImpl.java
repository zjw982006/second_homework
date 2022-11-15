package com.zjw.spring.demo;

import org.springframework.beans.factory.FactoryBean;

public class UserFactoryImpl implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setName("周杰伦");
        user.setAge(36);
        user.setSex("男");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
