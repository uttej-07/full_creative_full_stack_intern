package Polymorphism_practice;

class Example2{
	
	public void display() {
		 System.out.println("Main class Method is Displayed");
	}
}

class Subclass extends Example2{
	
	
	//In this program we have method overriding and polymorphic variable
        public void display() {
        	   super.display();
        	  System.out.println("Sub class Method is Displayed");
        }
}
public class Polymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example2 p;
		
//		p = new Example2();
//		
//		p.display();
		
		p = new Subclass();
		
		p.display();
		
	}
	
}
