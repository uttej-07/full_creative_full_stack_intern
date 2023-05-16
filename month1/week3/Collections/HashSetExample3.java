package SetPractice;

import java.util.HashSet;

public class HashSetExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> list1 = new HashSet<Integer>();
		list1.add(1);
		list1.add(5);
		list1.add(7);
		list1.add(9);
		list1.add(11);
		list1.add(15);
		
		HashSet<Integer> list2 = new HashSet<>();
		list2.add(3);
		list2.add(5);
		list2.add(7);
		list2.add(9);
		list2.add(19);
		list2.add(17);
		
//		list2.retainAll(list1);
//		System.out.println(list2);
		
		list2.addAll(list1);
		System.out.println(list2);
		
//		list2.removeAll(list1);
//		System.out.println(list2);
		
	}

}
