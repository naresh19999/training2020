class demo{
	void add(int i,int j) {
		System.out.println(i+j);     // Method Overloading Concept
	}
	void add(int i,int j,int k) {
		System.out.println(i+j+k);
	}
	void add(double a,double b) {
		System.out.println(a+b);
	}
}
public class EightenMtdOverL {
	public static void main(String[] args) {
		demo obj=new demo();
		obj.add(10, 20);
		obj.add(100,200,300);
		obj.add(16.5,20.5);
	}
}                                 //Output::  30
                                  //          600
                                  //          37.0