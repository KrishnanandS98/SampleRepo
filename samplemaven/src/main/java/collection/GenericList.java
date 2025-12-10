package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <String> s = new ArrayList <String>();

s.add("apple");
s.add("orange");
s.add("kiwi");
s.add("grapes");
s.add("orange");
s.add("banana");
s.add("orange");
System.out.println(s);
System.out.println(s.get(0));
s.set(3,"abc");
System.out.println(s);
System.out.println(s.indexOf("orange"));
System.out.println(s.lastIndexOf("orange"));
s.remove(4);
System.out.println(s);
System.out.println(s.contains("abc"));
System.out.println(s.isEmpty());
System.out.println(s.size());
	}

}
