package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethod {

	public static void main(String[] args) {
		List <String> L = new ArrayList <String> ();
		L.add("Lemon");
		L.add("apple");
		L.add("Banana");
		System.out.println(L);
		System.out.println(L.get(2));
		L.set(1, "orange");
		System.out.println(L);
		System.out.println("Index of "+ L.indexOf("apple"));
		System.out.println("Last index of" +L.lastIndexOf("Banana"));
		System.out.println();// TODO Auto-generated method stub"

	}

}
