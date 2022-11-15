package com.zjw.spring.demo;

import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

public class Test {

    private ClassPathXmlApplicationContext context = null;
    Logger log = Logger.getLogger("test");

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @org.junit.Test
    public void test1() {
        User user1 = (User) context.getBean("user1");
        log.info("set方式注入：" + user1);
    }

    @org.junit.Test
    public void test2() {
        User user2 = (User) context.getBean("user2");
        log.info("构造器方式注入：" + user2);
    }

    @org.junit.Test
    public void test3() {
        User user3 = (User) context.getBean("user3");
        log.info("静态工厂方式注入：" + user3);
    }

    @org.junit.Test
    public void test4() {
        User user4 = (User) context.getBean("user4");
        log.info("实例工厂方式注入：" + user4);
    }

    @org.junit.Test
    public void test5() {
        User user5 = (User) context.getBean("userFactory");
        log.info("FactoryBean接口方式注入：" + user5);
    }
}
