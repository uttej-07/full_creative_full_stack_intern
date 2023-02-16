package Polymorphism_practice;

class Example1{
	
	//Method Overloading and Operator Overloading is involved in class Example1
	
	//Method Overloading- add function is overloaded
	
	//Internal Operator Overloading- "+" is used as addition and as concatenation
	
	public void add(int a, int b) {
		int c = a + b;
		 System.out.println("Result: "+ c);
	}
	
	public double add(int x, double y) {
		
		return (double) (x+y);
	}
	
	public float add(int x, double y, float z) {
	   
		return (float) (x+y+z);
	}
	
}
public class Polymorphism1 {

	 public static void main(String[] args) {
		 
		 Example1 p = new Example1();
		 
		 p.add(5, 5);
		 
		 System.out.println("Result is: " + p.add(10, 65.89));
		 
		 System.out.println("Result is: "+p.add(92,67.98,(float) 34.67));
	 }
}
