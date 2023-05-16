package GenericsPractice;

//Wild with UpperBound

class Bound <T extends A>
{
	private T objRef;
	
	public Bound(T obj) {
		this.objRef = obj;
	}
	
	public void doRunTest() {
		this.objRef.displayClass();
	}
}

class A{
	
	public void displayClass() {
		System.out.println("Inside super class A");
	}
}

class B extends A{
	
	public void displayClass() {
		System.out.println("Inside super class B");
	}
}

class C extends A{
	
	public void displayClass() {
		System.out.println("Inside super class C");
	}
}
public class GenericExample8 {

	public static void main(String[] args) {
		//Creating object of subclass C and
		//passing to to Bound as a type parameter.
		Bound<C> bec = new Bound<C>(new C());
		bec.doRunTest();
		
		//Creating object of subclass B and
		//passing to to Bound as a type parameter.
		Bound<B> beb = new Bound<B>(new B());
		beb.doRunTest();
		
		//Creating object of subclass A and
		//passing to to Bound as a type parameter.
		Bound<A> bea = new Bound<A>(new A());
		bea.doRunTest();
		
	}
}
