package org.example.DI;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void testSet(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Book book=(Book) context.getBean("book");
        System.out.println(book);
    }
    @Test
    public void testConstructor(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Book book=(Book) context.getBean("book");
        System.out.println(book);
    }

}
