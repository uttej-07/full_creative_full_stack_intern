package QueuePractice;

import java.util.*;

class Book implements Comparable<Book>{
	int id;
	String name, author, publisher;
	int quantity;
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	public int compareTo(Book b) {
		if(id>b.id) {
			return 1;
		}else if(id<b.id) {
			return -1;
		}else {
			return 0;
		}
	}
}
public class PriorityQueueExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<Book> b1 = new PriorityQueue<Book>();
		
		Book b11 = new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
		
		Book b12 = new Book(233,"Operating System","Galvin","Wiley",6);
		
		Book b13 = new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		
		b1.add(b11);
		b1.add(b12);
		b1.add(b13);
		
		for(Book b: b1) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		System.out.println(b1.remove());
		
		System.out.println("After removing one record:");
		
		for(Book b:b1) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}
