package LinkedListPractice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numberList = new LinkedList<>();
		
	numberList.add(1);
	numberList.add(2);
	numberList.add(3);
	numberList.add(4);
	numberList.add(5);
		
	//convert List to stream
	numberList.stream().forEach(System.out::println);

}
}
