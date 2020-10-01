 class Demo {
    int n1,n2,result;
    void perform() {
    	result=n1+n2;     // Class Declaration
    }
}
    public class SixtClasObj{
	public static void main(String[] args) {
		Demo obj=new Demo();   //Object Declaration
		obj.n1=10;
		obj.n2=20;
		obj.perform();        // Perform method calling
		System.out.println(obj.result);
	}
}
                                       //  Output::   30