interface Writer{
	public void write();
}
class Pen implements Writer{    //Interface concept
	public void write() {
		System.out.println("I am Pen");
	}
}
class Pencil implements Writer{
	public void write() {
		System.out.println("I am Pencil");
	}
}
class Kit{
	public void doSomething(Writer p) {
		p.write();
	}
}
public class InterFa30 {
	public static void main(String[] args) {
		Kit k=new Kit();
		Writer p=new Pen();
		Writer pc=new Pencil();
		k.doSomething(pc);
	}
}                          //Output::  I am Pencil
