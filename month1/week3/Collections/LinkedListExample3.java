package LinkedListPractice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Integer[] numbers = {1,2,3,4,5};
		List<Integer> numberList = new LinkedList<>();
		for(Integer s: numbers) {
			numberList.add(s);
		}
		System.out.println(numberList);
	}
}
