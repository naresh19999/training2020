public class ExcepHan33 {
	public static void main(String[] args) {
		try {
		int a[]=null;
		a[2]=8;
		System.out.println(100/4);       //one TRY with multiple CATCH exceptions
		}
		catch(ArithmeticException e) {
			System.out.println("Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Stay in ur limit...");
		}
		catch(Exception e) {
			System.out.println("Something wrong..");
		}
		finally {
			System.out.println("Bye");
		}
	}                                 //Output::   Something wrong..
	                                  //           Bye

}
