package GenericsPractice;

import java.util.Arrays;
import java.util.List;

//WildCard with Lower Bound
public class GenericExample11 {

	public static void addNumbers(List<? super Integer> list) {
		
		for(Object n:list) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,2,3);
		System.out.println("displaying the Integer values");
		addNumbers(l1);
		
		List<Number> l2 = Arrays.asList(1.0,2.0,3.0);
		System.out.print("displaying the Number values");
		addNumbers(l2);
		
		//List<Double> l3 = Arrays.asList(2.3,5.3);
		//System.out.println("displaying the Double values");
		
		//Compile time error
		//The method addNumbers(List<? super Integer>) in the type
		//GenericExample11 is not applicable for the arguments 
		//(List<Double>)
		//addNumbers(l3);
	}
}