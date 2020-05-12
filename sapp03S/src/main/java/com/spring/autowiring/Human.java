package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	private Heart heart;     // Heart is byType and heart is byName
	                         //autowire = "constructor"  if we have constructor injection
     @Autowired
     @Qualifier("octopousHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void heartPumping() {
		if(heart != null) {
		heart.pump();
		System.out.println("Name of animal is: "+heart.getNameOfAnimal());
		System.out.println("No. of heart is: "+heart.getNoOfHearts());
		}
		else {
			System.out.println("You Are Dead....");
		}
	}

}
