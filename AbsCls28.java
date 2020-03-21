abstract class Ab {
		public abstract void m1();       //Abstract class and Abstract Method
		public void m2() {
			System.out.println("This is method2");
		}
	}
class Abs extends Ab{
		public void m1(){
		System.out.println("This is method1");	
	}
}
class AbsCls28{		
		public static void main(String[] args) {
			Ab o=new Abs();
			o.m1();
			o.m2();		
		}
}                                     //Output::   This is method1
                                      //           This is method2