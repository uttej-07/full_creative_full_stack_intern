//Anonymous Inner Class
package InnerClassPractice;

abstract class Person{
	abstract void walk();
}

interface Eatable{
	void eat();
}
public class InnerClassExample2 {

	public static void main(String[] args) {
		Person  p = new Person() {
		void walk() {
			System.out.println("A person can walk");
		}
	};
	    Eatable e = new Eatable() {
	    	public void eat() {
	    	System.out.println("Tasty food");	
	    	}
	    };
	    
		p.walk();
		e.eat();
}
}
