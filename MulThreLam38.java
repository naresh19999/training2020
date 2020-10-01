public class MulThreLam38 {
	public static void main(String[] args) throws Exception {
	   Thread t1=new Thread(()->                 //Multithreading LAMBDA Expression
	   {
		   for(int i=1;i<=5;i++) {
				System.out.println("Hi");               
				try {Thread.sleep(1000); }catch(Exception e){}
			}
	   });
	   Thread t2=new Thread(()->
	   {
		   for(int i=1;i<=5;i++) {
				System.out.println("Hello");               
				try {Thread.sleep(1000); }catch(Exception e){}
			}
	   });
	   t1.start();
	   try {Thread.sleep(1000); }catch(Exception e){}
	   t2.start();                  
	   t1.join();                           //JOINS
	   t2.join();
	   System.out.println(t1.isAlive()); //ISALIVE  gives boolean(True or False) 
	   System.out.println("Bye");
	}
}                                           /* Output::      one SECOND gap
															Hi
															Hello
															Hello
															Hi
															Hello
															Hi
															Hi
															Hello
															false
															Bye
															*/













