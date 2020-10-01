package com.spring.looseCoupling;

public class Student {

	private Cheat c;

	public void setC(Cheat c) {
		this.c = c;
	}
	
	public void cheatingMethod() {
		c.cheat();
	}
}
