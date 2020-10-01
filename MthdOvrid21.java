class M1{
	void play() {
		System.out.println("I want to play");//Method Overriding
	}
}
class M2 extends M1{
	void play() {
		System.out.println("This is not the time to play");
	}
}
public class MthdOvrid21 {
	public static void main(String[] args) {
		M2 o= new M2();
		o.play();
	}
}                                  // Output::This is not the time to play
