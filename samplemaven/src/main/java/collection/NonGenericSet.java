package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSet {

	public static void main(String[] args) {
		Set s= new HashSet();
		s.add("q");
		s.add(2);
		s.add(5);
		s.add(7);
		s.add(2);
		System.out.println(s);
		Set s1 = new HashSet();
		s1.add(2);
		s1.add(3);
		s1.add("murshida");
		System.out.println(s1);
		s.addAll(s1);
		System.out.println(s);
		
		
		
		// TODO Auto-generated method stub

	}

}
