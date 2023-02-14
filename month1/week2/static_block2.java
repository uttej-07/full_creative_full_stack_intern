package static_and_initilization_block;

import java.lang.Class;

class staticexample2{
	static int k;
	
	static {
		k = 20;
		System.out.println(k+"is printed in static block");
	}
	
	{
		System.out.println("Initilization block");
	}
	
	public void display() {
		k=10;
		System.out.println(k+"is prinited in display method");
	}
}
public class static_block2 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
          Class.forName("staticexample2");
	}

}
