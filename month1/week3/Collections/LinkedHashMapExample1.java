package MapPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer,String> student = new LinkedHashMap<Integer,String>();
		student.put(1, "uttej");
		student.put(2, "bhavana");
		student.put(3, "goutham");
		student.put(4, "Gowrav");
		student.put(5, "Bhanu");
        student.put(6, "sujith");
		student.putIfAbsent(7, "Krishna");
		
		for(Map.Entry m:student.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		   System.out.println("Keys: "+student.keySet());  
	     
	       System.out.println("Values: "+student.values());  
	   
	       System.out.println("Key-Value pairs: "+student.entrySet()); 
	}

}
