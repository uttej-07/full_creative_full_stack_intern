package GenericsPractice;

class Bound1 <T extends A1 & B1>{
	private T objRef;
	
	public Bound1(T obj) {
		this.objRef = obj;
	}
	
	public void doRunTest() {
		this.objRef.displayClass();
	}
}

interface B1{
	public void displayClass();
}

class A1 implements B1{
	
	public void displayClass() {
		System.out.println("Inside super class A");
	}
}

public class GenericExample9 {

	public static void main(String[] args) {
		
		Bound1<A1> bea = new Bound1<A1>(new A1());
		bea.doRunTest();
		
	}
}
