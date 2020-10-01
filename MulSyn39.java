class Counter{
	int count;
	public synchronized void increment() {     //Synchronization Concept
		count++;
	}
}
public class MulSyn39 {
	public static void main(String[] args) throws Exception {
		Counter o=new Counter();
		Thread t1=new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=1000;i++) {
				o.increment();
				}
			}
		});
		Thread t2=new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=1000;i++) {
				o.increment();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("count:"+o.count);
	}
}                                                   //Output::   count:2000
