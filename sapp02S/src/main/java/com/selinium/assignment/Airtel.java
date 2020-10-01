package com.selinium.assignment;

public class Airtel {
	
	private Service s;

	public void setS(Service s) {
		this.s = s;
	}
	
	public void activateService() {
		s.service();
	}

}
