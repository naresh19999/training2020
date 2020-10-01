package com.selinium.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeatApp {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("/com/selinium/assignment/beans.xml");
		
		Airtel a = con.getBean("airtel",Airtel.class);
		a.activateService();

	}

}
