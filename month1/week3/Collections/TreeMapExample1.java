package MapPractice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> student = new TreeMap<>();
		student.put(1, "uttej");
		student.put(2, "bhavana");
		student.put(3, "goutham");
		student.put(4, "Gowrav");
		student.put(5, "Bhanu");
        student.put(6, "sujith");
		student.putIfAbsent(7, "Krishna");
		
		   for(Map.Entry m:student.entrySet())  
		      {  
		          System.out.println(m.getKey()+" "+m.getValue());      
		      } 
		   System.out.println("descendingMap: "+student.descendingMap());
		   System.out.println("HeadMap: "+student.headMap(1,true));
		   System.out.println("TailMap: "+student.tailMap(2,true));
		   System.out.println("SubMap: "+student.subMap(1,false,2,true));
	}

}
