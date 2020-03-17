import java.util.*;
public class NineRemQut {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number....!");
		int n=sc.nextInt();
		System.out.println("enter second number..!");
		int m=sc.nextInt();
		int a=n%m;
		System.out.println("the remainer is " +a);
		int b=n/m;
		System.out.println("the quotient is "+b);
	}                             //Output::enter first number....!
}                                              //20
	                               //        enter second number..!
	                                              //10
	                               //         the remainer is 0
                                   //         the quotient is 2
