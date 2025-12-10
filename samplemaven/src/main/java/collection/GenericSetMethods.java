package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> a = new HashSet <String>();
		a.add("Science");
		a.add("maths");
		a.add("eng");
		a.add("malayalam");
		a.add("Hindi");
		System.out.println(a);
		
		Set <String> b = new HashSet <String>();
		b.add("Sanskrit");
		b.add("Social");
		System.out.println(b);
		a.addAll(b);
		System.out.println(a);
		System.out.println(a.contains("Sanskrit"));
		System.out.println(a.containsAll(b));
		System.out.println(a.isEmpty());
		a.remove("eng");
		System.out.println(a);
		a.removeAll(b);
		System.out.println(a);
		System.out.println(a.size());
		b.clear();
		System.out.println(b);
		
		
		

	}

}
