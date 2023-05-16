package GenericsPractice;

import java.util.*;

class Generic4<U,B>{
	U obj1;
	B obj2;
	
	//Constructor
	Generic4(U obj1, B obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	//Print the values of U and B
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

public class GenericExample4 {

	public static void main(String[] args) {
		Generic4 <String,String> g4 = new Generic4<String,String>("Uttej", "5D0");
		g4.print();
	}
	
}
