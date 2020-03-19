class Demo1{
	int eid;
	int salary;
	static String ceo;
	static {                                        //Static block
		ceo="John";
		System.out.println("I'm in static block");
	}
	public Demo1() {
		eid=10;
		salary=30000;
		System.out.println("i'm in Constructor");
	}
	public void show() {
		System.out.println(eid +":"+salary+":"+ceo);
	}
}
public class NineteStatic {

	public static void main(String[] args) {
		Demo1 o=new Demo1();
		o.show();
	}
}                                                 // Output:: I'm in static block
                                                  //          i'm in Constructor
                                                  //          10:30000:John
