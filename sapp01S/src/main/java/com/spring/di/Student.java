package com.spring.di;

public class Student {
	
	private int sid;
	private String studentName;
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void displayStudentInfo() {
		System.out.println("Student Id is : "+sid);
		System.out.println("Student Name is : "+studentName);
	}

}
