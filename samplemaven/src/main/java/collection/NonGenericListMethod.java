package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethod {

	public static void main(String[] args) {
		List L = new ArrayList();
		L.add("murshida");
		L.add(2);
		L.add(4);
		L.add(2.5);
		L.add("khadeejath");
		System.out.println(L);
		System.out.println("The value of get "+L.get(2));
		System.out.println(L);
		L.set(3, "hadi");
		System.out.println(L);
		System.out.println("last index of "+L.indexOf(2));
		System.out.println("to remove" +L.remove(2));
		System.out.println(L.contains("murshida"));
		System.out.println(L.isEmpty());
		System.out.println(L.size());
		
		
		// TODO Auto-generated method stub

	}

}
