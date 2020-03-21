import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Collections40 {
	public static void main(String[] args) {     //Collection concept
		Collection a=new ArrayList();
		a.add(2);
		a.add(5);
		a.add(7);
		Iterator b=a.iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}
	}
}                                  //Output::  2
                                   //          5
                                   //          7
