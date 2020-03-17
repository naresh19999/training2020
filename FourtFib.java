import java.util.*;
public class FourtFib {
	public static void main(String[] args) {
		int a=0,b=1,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range...!");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
		a=b;
		b=c;
		c=a+b;
		System.out.println(+b);
		}
	}
}                    //Output::   enter the range...!
                     //                5
                     //       0 1 1 2 3 5       