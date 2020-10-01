import java.util.*;
public class Collect41 {
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<>();      //LIST concept and GENERICS concept
		a.add(34);
		a.add(20);
		a.add(344);
		//a.add("hello");
		a.add(2,23);
		Collections.sort(a);
		//Collections.reverse(a);
		for(Object o:a) {
			System.out.println(o);
		}
	}
}                                     //Output:: 20
                                      //         23
                                      //         34
                                      //         344
                                    