package LinkedListPractice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {
    public static void main(String[] args) {
	
    List<Integer> num = new LinkedList<Integer>();
    num.add(100);
    num.add(400);
    num.add(300);
    System.out.println(num);
    List<String> names = new LinkedList<String>();
    names.add("Uttej");
    names.add("Goutham");
    names.add("Dheeraj");
    System.out.println(names);
    names.toArray();
    System.out.println(names);
    
 }
}
