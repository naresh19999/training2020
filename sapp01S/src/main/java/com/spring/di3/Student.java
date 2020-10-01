package com.spring.di3;

public class Student {
	private int id;
	private MathCheat mc;
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public void setMc(MathCheat mc) {
		this.mc = mc;
	}


	public void cheating() {
		System.out.println("I'm Student1....");
		mc.mathcheat();
		
	}
	

}
