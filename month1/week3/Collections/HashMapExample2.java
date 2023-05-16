package MapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> student = new HashMap<Integer,String>();
		student.put(1, "uttej");
		student.put(2, "bhavana");
		student.put(3, "goutham");
		student.put(4, "Gowrav");
		student.put(5, "Bhanu");
		
		if(student.containsKey("bhavana")) {
			System.out.println(student.get("bhavana"));
		}
	
		Set<Integer> getkeys = student.keySet();
		System.out.println(getkeys);
		
		Collection<String> getvalues = student.values();
		System.out.println(getvalues);
		
		student.put(6, "sujith");
		
		student.putIfAbsent(7, "Krishna");
		
		System.out.println(student);
		
		student.remove(4);
		
		System.out.println(student);
		
		student.putIfAbsent(7, "Krishna");
		student.putIfAbsent(4, "Gowrav");
		
		System.out.println(student);
		
		
	}

}
