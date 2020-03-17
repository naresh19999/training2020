import java.util.*;
public class TenNoDig {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number...!");
		int n=sc.nextInt();
		while(n>0)
		{
		n=n/10;
		count=count+1;
		}
		System.out.println("the number of digits u entered is "+count);

	}

}                           //Output::enter any number...!
                            //         12345
                            //        the number of digits u entered is 5
