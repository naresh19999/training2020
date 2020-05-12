package com.property.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/property/assignment/beans.xml");
        JdbcConnection jc = context.getBean("jdbc",JdbcConnection.class);
        jc.display();
        jc.getJdbcConnection();
    }
}
