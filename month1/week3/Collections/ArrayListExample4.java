package ArrayListPractice;

import java.util.ArrayList;

public class ArrayListExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList al= new ArrayList();
//		al.add("Edureka");
//		al.add("Java");
//		al.add("Arrays");
//		System.out.println("Contents of ArrayList al:" +al);
//		Object[] objArray = al.toArray();
//		System.out.println("Elements in the array list are:");
//		for(int i=0; i<=objArray.length; i++)
//		System.out.println(objArray[i]);

		
		ArrayList<Integer> al = new ArrayList<Integer>(9);
		al.add(2);
		al.add(4);
		al.add(5);
		al.add(7);
		al.trimToSize();
		System.out.println("The List elements are:");
		for (Integer number : al) {
		System.out.println("Number =:" + number);
	}

}
}