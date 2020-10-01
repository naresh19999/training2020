package com.spring.di2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamApp {
	public static void main(String[] args)
	{
		ApplicationContext con = new ClassPathXmlApplicationContext("/com/spring/di2/di.xml");
		Student s1 = (Student) con.getBean("student");
		s1.displayStudentInfo();
				
				
	}

}
