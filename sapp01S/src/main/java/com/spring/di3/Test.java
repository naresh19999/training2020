package com.spring.di3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("/com/spring/di3/di.xml");
		
		Student s1 = con.getBean("stu1",Student.class);
		s1.cheating();
		
		Student2 s2 = con.getBean("stu2",Student2.class);
		s2.startCheating();
		
		((AbstractApplicationContext) con).close();
		

	}

}
