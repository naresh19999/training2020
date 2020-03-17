public class FiftArrAvg {
	public static void main(String[] args) {
		double count=0,avg;
		double[] a={1,2,3,4,5};     //Array Concept
		for(int i=0;i<a.length;i++)
		{
		count=count+a[i];
		}
		avg=count/a.length;
		System.out.println("The avg is "+avg);
	}
}                                //  Output::  The avg is 3.0
 