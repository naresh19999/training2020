class calc{
	public int add(int ... n) {  //Varialbe Length Argument
		int sum=0;
		for(int i:n) {
			sum=sum+i;
		}
	return sum;
	}
}
public class Vargs24 {
	public static void main(String[] args) {
		calc o=new calc();
		System.out.println(o.add(1,2,3,4,5,6,7));
	}
}                                //Output::   28
