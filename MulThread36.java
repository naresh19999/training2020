class Hi extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");               //Multithreading concept
			try {Thread.sleep(1000); }catch(Exception e){}
		}
	}
}
class Hello extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try {Thread.sleep(1000); }catch(Exception e){}
		}
	}
}
public class MulThread36 {
	public static void main(String[] args) {
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		obj1.start();
		obj2.start();
	}
}                                     /* Output::      one SECOND gap
													Hi
													Hello
													Hello
													Hi
													Hello
													Hi
													Hi
													Hello
                                            */
                                      
