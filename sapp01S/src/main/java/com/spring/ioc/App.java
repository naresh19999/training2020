package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con= new ClassPathXmlApplicationContext("/com/spring/ioc/beans.xml");
        Sim s = (Sim)con.getBean("sim");
        s.calling();
        s.data();
    }
}
