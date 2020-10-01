import java.util.*;
public class ElevenRevNo {
	public static void main(String[] args) {
		int s=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number!!");
		int n=sc.nextInt();
		while(n>0)
		{
		r=n%10;
		s=s*10+r;
		n=n/10;
		}
		System.out.println("the reverse number is  "+s);
	}
}                           //Output::  enter any number!!
                            //               6549
                            //          the reverse number is  9456  