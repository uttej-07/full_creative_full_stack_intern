package LinkedListPractice;

import java.util.LinkedList;
import java.util.Deque;

public class LinkedListExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque numbers = new LinkedList();
		numbers.add(2);
		numbers.addFirst(1);
		numbers.add(3);
		numbers.addLast(4);
		numbers.add(5);
		numbers.add(6);
		numbers.addFirst(0);
		System.out.println(numbers);
		System.out.println(numbers.size());
		numbers.removeFirst();
		numbers.removeLast();
		System.out.println(numbers);
		System.out.println(numbers.size());
	}
}
