package org.example;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

public class TestUser {
    @Test
    public void testUser(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        User user=(User) context.getBean("user");
        user.run();
    }
    @Test
    public void testUserobject() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz= Class.forName("org.example.User");
        User user=(User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }
}
