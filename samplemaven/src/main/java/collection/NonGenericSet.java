package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set  a = new HashSet();
		Set  b = new HashSet();
		Set  c = new HashSet();
		a.add("equilibrium");
		a.add(9.8);
		a.add('g');
		a.add(9.8);
		a.add(3.14);
		
		b.add(0.5);
		b.add("Newton");
		System.out.println(a);
		
		System.out.println(b);
		a.addAll(b);
		System.out.println(a);
		System.out.println(b.contains(9.8));
		System.out.println(b.containsAll(b));
		System.out.println(c.isEmpty());
		a.remove(3.14);
		System.out.println(a);
		a.removeAll(b);
		System.out.println(a);
		System.out.println(a.size());
		a.clear();
		System.out.println(a);
		}

}
