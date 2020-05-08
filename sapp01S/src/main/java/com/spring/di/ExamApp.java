package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamApp {
	public static void main(String[] args)
	{
		ApplicationContext con = new ClassPathXmlApplicationContext("/com/spring/di/di.xml");
		Student s1 = (Student)con.getBean("student");
		s1.displayStudentInfo();
		
		System.out.println("..................................");
		
		Student s2 = (Student)con.getBean("student2");
		s2.displayStudentInfo();
				
	}

}
