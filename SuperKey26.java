class A{
	public A() {
		System.out.println("In A");  //Super Keyword
	}
	public A(int i) {
		System.out.println("in A int");
	}
}
class B extends A{
	public B() {
		super(5);
		System.out.println("In B");
	}
	public B(int i) {
		super(i);
		System.out.println("in B int");
		
	}
}
public class SuperKey26 {
	public static void main(String[] args) {
		B obj=new B(5);
	}
}                                      //Output::  in A int
                                       //          in B int
