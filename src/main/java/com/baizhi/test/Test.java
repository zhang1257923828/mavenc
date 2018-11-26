package com.baizhi.test;

import com.baizhi.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao=(UserDao)context.getBean("userDao");



    }
}
