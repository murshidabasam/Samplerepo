package collection;

import java.util.HashSet;
import java.util.Set;

public class ForeachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set  s= new HashSet ();
		s.add("morning");
		s.add("afternoon");
		s.add("evening");
		s.add("night");
		s.add("midnight");
		
		for(Object b: s)
		{
			System.out.println(b);
		}

	}

}
