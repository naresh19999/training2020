class Super{
	public int add(int i,int j) {   //Inheritance concept
		return i+j;                                  //  Super class
	}
}
class Child extends Super{                           //Child Class
	public int sub(int i,int j) {
		return i-j;
	}
}
public class Inherit25 {
	public static void main(String[] args) {
		Child o=new Child();
		int res=o.add(100, 200);
		int res2=o.sub(200, 100);
		System.out.println(res);
		System.out.println(res2);
	}
}                                              //Output::  300
                                               //          100
