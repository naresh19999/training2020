class Outer{
	static int a;
	public static void show() {
		System.out.println("show method");  //Inner Classes
	}
	static class Inner{
		public void display() {
			System.out.println("display method");
		}
	}
}
public class TwentInnerClas {
	public static void main(String[] args) {
		Outer o=new Outer();
		o.show();
		Outer.Inner ob=new Outer.Inner();
		ob.display();
	}
}                                                  //Output::show method
                                                   //        display method

