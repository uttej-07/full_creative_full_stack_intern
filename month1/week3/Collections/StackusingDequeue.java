package QueuePractice;

import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;

public class StackusingDequeue {
		public static void main(String[] args) {
			//Creating Queue using the LinkedList class
			Queue<Integer> suq = new LinkedList<>();
			
			//enqueue
			//insert element at the rear of the queue
			
			suq.offer(1);
			suq.offer(2);
			suq.offer(3);
			
			Iterator<Integer> itr = suq.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next()+" ");
			}
			
			int removedNumber = suq.poll();
			
			System.out.println("Removed element: " + removedNumber);
			
			System.out.println("Queue after deletion: "+ suq);	
			
			System.out.println("Peek element: "+suq.peek());
		}
	}

