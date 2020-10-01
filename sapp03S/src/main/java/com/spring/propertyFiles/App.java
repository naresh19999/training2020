package com.spring.propertyFiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new ClassPathXmlApplicationContext("/com/spring/propertyFiles/beans.xml");
        Student s = con.getBean("student",Student.class);
        s.displayInfo();;
    }
}
