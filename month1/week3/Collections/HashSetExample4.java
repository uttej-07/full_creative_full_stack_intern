package SetPractice;

import java.util.HashSet;
import java.util.Iterator;

class Student{
	String name;
	int rollNo;
	String department;
	
	public Student(String name, int rollNo, String department) {
		this.rollNo=rollNo;
		this.name=name;
		this.department=department;
	}
	
	@Override
	public int hashCode() {
		return rollNo;
	}
	
	@Override
	public boolean equals(Object obj){
		Student student = (Student) obj;
		return(rollNo==student.rollNo);
	}
	
	@Override
	public String toString() {
		return rollNo+", "+name+", "+department;
	}
}
public class HashSetExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HashSet<Student> set = new HashSet<Student>();
		 
	        //Adding elements to HashSet
	 
	        set.add(new Student("Uttej", 510, "CSE"));
	 
	        set.add(new Student("Bhavana", 514, "CSE"));
	 
	        set.add(new Student("Goutham", 546, "CSE"));
	 
	        set.add(new Student("Sujith", 518, "CSE"));
	 
	        set.add(new Student("Gowrav", 550, "CSE"));
	 
	        set.add(new Student("Bharat", 301, "IT"));
	 
	        set.add(new Student("Amit", 301, "IT"));           //duplicate element
	 
	        set.add(new Student("Bhavya", 872, "ECE"));
	 
	        set.add(new Student("Naman", 301, "CS"));        //duplicate element
	 
	        set.add(new Student("Samson", 565, "Civil"));
	 
	        //Iterating through HashSet
	 
	        Iterator<Student> it = set.iterator();
	 
	        while (it.hasNext())
	        {
	            Student student = (Student) it.next();
	 
	            System.out.println(student);
	        }
	}

}
