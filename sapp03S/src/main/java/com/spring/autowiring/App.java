package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new ClassPathXmlApplicationContext("/com/spring/autowiring/beans.xml");
        Human h = con.getBean("human",Human.class);
        h.heartPumping();
    }
}
