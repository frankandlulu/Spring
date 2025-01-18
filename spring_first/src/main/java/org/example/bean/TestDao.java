package org.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {
     public static void main(String[] args) {
         ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
         UserDao Userdao=context.getBean(UserDao.class);
         System.out.println(Userdao);
         Userdao.run();
    }
}
