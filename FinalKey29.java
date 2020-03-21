final class Aa{
	final int i=100;
	Aa(){                  //final keyword
		 int i=20;
	}
	public final void display() {
		System.out.println("In A class");
	}
}
class Bb extends Aa{
	public void display() {
		System.out.println("In B class");
	}
}
public class FinalKey29 {
	public static void main(String[] args) {
		Bb obj=new Bb();
		obj.display();
		System.out.println(obj.i);
	}
}
