package com.spring.di2;

public class Student {
	
	private int sid;
	private String studentName;
	
	
	public Student(int sid, String studentName) {
		this.sid = sid;
		this.studentName = studentName;
	}


	public void displayStudentInfo() {
		System.out.println("Student Id is : "+sid);
		System.out.println("Student Name is : "+studentName);
	}

}
