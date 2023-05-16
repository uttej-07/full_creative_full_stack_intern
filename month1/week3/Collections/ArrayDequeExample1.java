package QueuePractice;

import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayDequeExample1 {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Ravi");
		deque.add("Vijay");
		deque.add("Ajay");
		
		for(String str: deque) {
			System.out.print(str+" ");
		}
		
		System.out.println();
		
		System.out.println(deque.contains("Ravi"));
		
		deque.offerFirst("Ramu");
		deque.offerLast("Shyamu");
		
		System.out.println(deque);
		
		System.out.println(deque.peek());
		System.out.println(deque.element());
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
		System.out.println(deque.pollFirst());
		System.out.println(deque.pollLast());
	}
}
