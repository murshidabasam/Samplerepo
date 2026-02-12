package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSet {

	public static void main(String[] args) {
		Set <String> s = new HashSet <String>();
		s.add("murshida");
		s.add("jayitha");
		s.add("sreevidya");
		Set <String> i = new HashSet <String>();
		i.add("gouri");
		i.add("haritha");
		i.add("priyanka");
		s.addAll(i);
		System.out.println(s);
		System.out.println(s.contains("priyanka"));
		System.out.println(i.containsAll(s));
		System.out.println(s.isEmpty());	
		s.remove("murshida");
		System.out.println(s);
		s.removeAll(i);
		System.out.println(s);
		System.out.println(s.size());
		s.clear();
		System.out.println(s);
		System.out.println(i);
		// TODO Auto-generated method stub

	}

}
