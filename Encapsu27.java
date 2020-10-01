class Student{
	private int rollno;   //Encapsulation
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {     //Getters and Setters
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Encapsu27 {
	public static void main(String[] args) {
		Student s=new Student();
		s.setRollno(2);
		s.setName("Naresh");
		System.out.println(s.getRollno());
		System.out.println(s.getName());
	}
}                                   //Output::  2
                                    //          Naresh
