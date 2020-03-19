
public class SeventenConstru {
	int i,j;
	public SeventenConstru() {
		System.out.println("I am in constructor"); // Constructor
	}
	public SeventenConstru(int i,int j) {
		this.i=i;
		this.j=j;
		System.out.println("The value of i is "+i);
		System.out.println("The value of j is "+j);
	}

	public static void main(String[] args) {
		SeventenConstru obj=new SeventenConstru();
		SeventenConstru obj2=new SeventenConstru(10,20);
	}
}                                       //Output::  I am in constructor
                                        //          The value of i is 10
                                        //          The value of j is 20