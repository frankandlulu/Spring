package org.example;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUser(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        User user=(User) context.getBean("user");
        user.add();
    }
}
