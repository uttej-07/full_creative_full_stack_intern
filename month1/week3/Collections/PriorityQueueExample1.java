package QueuePractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;;
public class PriorityQueueExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> pqueue = new PriorityQueue<String>(); 
		
		pqueue.add("Uttej");
		pqueue.add("bhavana");
		
		List<String> plist = new ArrayList<String>();
		plist.add("goutham");
		plist.add("gowrav");
		
		pqueue.addAll(plist);
		
		Iterator<String> itr =  pqueue.iterator();
		
		
		
		pqueue.add("Sujith");
		pqueue.add("Ramu");
		pqueue.offer("Shamu");
		
		
	    System.out.println(pqueue.peek());
		System.out.println(pqueue.element());
		
//		while(itr.hasNext()) {
//			System.out.print(itr.next());
//			System.out.print(" , ");
//		}
		
		System.out.println("1 :"+pqueue);
		
		System.out.println("1.1: "+pqueue.poll());
		
		System.out.println("2: "+pqueue);
		
		System.out.println("3: "+pqueue.remove("Sujith"));
		System.out.println("4: "+pqueue);
		//System.out.println("5: "+pqueue.removeAll(pqueue));
		//System.out.println("6: "+pqueue);
		
		System.out.println("7: "+pqueue.contains("uttej"));
		
		System.out.println("8: "+pqueue.size());
		
		System.out.println("9: "+pqueue.toArray());
		
		System.out.println("10: "+pqueue.toString());
		
		System.out.println("11: "+pqueue.hashCode());
		
		System.out.println("12: "+pqueue.isEmpty());
		
		PriorityQueue<Integer> pqueueint = new PriorityQueue<Integer>(new CustomComparator());
		
		pqueueint.add(58);
		pqueueint.add(98);
		pqueueint.add(12);
		pqueueint.add(29);
		System.out.println("PriorityQueue of Integers: "+pqueueint);
		
		System.out.println(pqueueint.poll());
		
		
    }
}
class CustomComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		// TODO Auto-generated method stub
		int value = arg0.compareTo(arg1);
		if(value>0){
			return -1;
		}else if(value<0) {
			return 0;
		}else {
		return 0;
	    }
       }
	  }