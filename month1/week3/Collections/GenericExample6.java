package GenericsPractice;

public class GenericExample6 {

	static <T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName()+" = "+element);
	}
	
	public static void main(String[] args) {
		
		//Calling generic method with Integer Argument
		genericDisplay(10);
		
		//Calling generic method with String Argument
		genericDisplay("Uttej");
		
		//Calling generic method with Double Argument
		genericDisplay(14.3);
		
		//Calling generic method with Boolean Argument
		genericDisplay(true);
	}
}
