package static_and_initilization_block;

class staticexample{

	static int j;
	
	static {
		int j = 10;
		System.out.println(j+" "+"is printed from static block");
	}
	
	public void display() {
		j = 6;
		System.out.println(j+" "+"is printed in non static method");
	}
	
	{
		System.out.println("initilization block");
	}

}
public class static_block1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        staticexample sb = new staticexample();
        sb.display();
	}

}
