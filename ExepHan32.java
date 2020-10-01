public class ExepHan32 {
	public static void main(String[] args) {
		try {                             //Exception Handling
			int i=10;
			System.out.println(i/0);
		}
		catch(Exception e) {
			System.out.println(10/2);
		}
		finally {
			System.out.println("Welcome to Finally block");
		}
	}
}                             //Output::  5
                              //          Welcome to Finally block
