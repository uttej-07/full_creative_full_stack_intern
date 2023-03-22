package GenericsPractice;

import java.util.*;

public class GenericsExample1 {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("uttej");
		list.add("bhavana");

		//list.add(11); //Compile Time Error Because list can store String datatype values only.

		String s = list.get(1);
		System.out.println("element is: " + s);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
