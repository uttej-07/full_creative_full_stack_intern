package QueuePractice;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample1 {

	public static void main(String[] args) {
		
		Queue<Integer> abq = new ArrayBlockingQueue<Integer>(5);
	
		abq.add(10);
		abq.add(20);
		abq.add(30);
		abq.add(40);
		abq.offer(50);
		/* If the queue is full then we ghet Illegal State Exception
		abq.add(60);
		*/
		
		//System.out.println(abq);
		
		System.out.println(abq.isEmpty());
		
		System.out.println(abq.peek());
		
		Iterator<Integer> itr = abq.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		abq.clear();
		
		System.out.println(abq);
		
	}
}
