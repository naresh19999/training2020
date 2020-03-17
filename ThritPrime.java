import java.util.*;
public class ThritPrime {
  public static void main(String[] args) {
	  int count=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter any number...!");
	  int n=sc.nextInt();
	  for(int i=2;i<=n;i++)
	  {
	  if(n%2==0)
	  {
	  count=count+1;
	  }
	  }
	  if(count==0)
	  System.out.println(n+" is prime number");
	  else
	  System.out.println(n+ "  is not prime");
	}
}                            //  Output::   enter any number...!
                             //                  19
                             //              19 is prime number