package ArrayListPractice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		LinkedList l2 = new LinkedList();
		System.out.println(al instanceof Serializable);
		System.out.println(l2 instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);
		System.out.println(l2 instanceof RandomAccess);
	}

}
