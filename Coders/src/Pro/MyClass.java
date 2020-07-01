package Pro;
import java.util.*;

public class MyClass {
public static void main(String args[]) {
	
	ArrayList<Integer> Numbers=new ArrayList<Integer>();
	Numbers.add(15);
	Numbers.add(1);
	Numbers.add(23);
	Numbers.add(56);
	Numbers.add(49);
	Collections.sort(Numbers);
	
	for(int i:Numbers) {
		System.out.println(i);
	}
}
}
