package QueuePractice;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.Queue;
public class PriorityBlockingQueueExample1 {

	public static void main(String[] args) {
		Queue<Integer> pbq = new PriorityBlockingQueue<Integer>();
		
		
		pbq.add(10);
		pbq.add(20);
		pbq.offer(30);
	
		System.out.println(pbq.isEmpty());
		
		System.out.println(pbq.peek());
		
		System.out.println(pbq.contains(20));
		
		System.out.println(pbq.remove(10));
		
		System.out.println(pbq);
		
		pbq.offer(40);
		
		for(Integer i:pbq) {
			System.out.println(i+" ");
		}
		
		System.out.println(pbq.element());
	}
}
