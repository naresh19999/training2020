import java.util.*;
public class TwelPalin {
   public static void main(String[] args) {
		int t,r,s=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number....!");
		n=sc.nextInt();
		t=n;
		while(n>0)
		{
		r=n%10;
		n=n/10;
		s=r+s*10;
		}
		if(s==t)
		System.out.println("palindrome");
		else
		System.out.println("not palindrome");
	}
}                            //Output::   enter any number....!
                             //             123
                             //           not palindrome