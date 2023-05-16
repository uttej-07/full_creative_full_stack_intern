package ArrayListPractice;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		al.add(7);
		al.add("80");
		al.add(null);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		al.add(3, "80");
		System.out.println(al);//System.out.println(al.toString())
		al.add(true);
		al.add("A");
		System.out.println(al);
		al.clear();
		System.out.println(al);
	}

}
