package LinkedListPractice;

import java.util.Arrays;
//import java.util.LinkedList;
import java.util.List;

class Student{
	private int std_id;
	private String name;
	
	public Student(int id,String name) {
		this.std_id = id;
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	public int getStd_id() {
		return std_id;
	}
	
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
public class LinkedListExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> s1 = Arrays.asList(new Student (1,"uttej"), new Student(2,"goutham"));
	    for(Student s:s1) {
		System.out.println(s.getStd_id()+" "+s.getName());
	}
}
}