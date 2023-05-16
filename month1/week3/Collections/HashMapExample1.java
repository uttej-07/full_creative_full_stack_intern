package MapPractice;

import java.util.HashMap;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> student = new HashMap<>();
		student.put(1, "uttej");
		student.put(2, "Bhavana");
		student.put(3, "goutham");
		student.put(4, "Gowrav");
		student.put(5, "Bhanu");
	
		HashMap<Integer,String> student1 = new HashMap<>();
		student1.putAll(student);

		System.out.println(student1);
		
		if(!student1.isEmpty()) {
			System.out.println("HashMap student isn't empty");
			
			System.out.println("Student  : "+student1.get(1));
			
			System.out.println(student1.size());
		}
	}

}
