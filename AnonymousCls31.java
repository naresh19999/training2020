class Aaa{
	public void show() {
		System.out.println("In A show");
	}                                      //Anonymous Class
}
public class AnonymousCls31 {
	public static void main(String[] args) {
		Aaa o=new Aaa() {
			public void show() {
				System.out.println("Im the best");
			}
		};
		o.show();
	}
}                     //Output::  Im the best
