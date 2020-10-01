package com.spring.di3;

public class Student2 {
	
	private MathCheat cheat;
		
	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}

	public void startCheating(){
		System.out.println("I'm Student2...");
		cheat.mathcheat();
	}

}
