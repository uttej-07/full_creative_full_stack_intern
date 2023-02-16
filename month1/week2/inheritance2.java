package inheritance_practice;

class A{
	
	protected String  name;
	
	public void eat() {
		System.out.println("My fav food is Biryani");
	}
}

class B extends A{
	
	public void name() {
		System.out.println("My name is : "+name);
	}
}

public class inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B m = new B();
		
		m.name = "uttej";
		m.name();
		m.eat();
	}

}
