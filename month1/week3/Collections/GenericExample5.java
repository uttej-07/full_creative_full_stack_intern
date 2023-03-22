package GenericsPractice;

public class GenericExample5 {
	public static <E> void printArray(E[] elements) {
		for(E element:elements) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		String[] strArray = {"Hello", "World","My", "Name","Is","Uttej"};
		
		System.out.println("Printing Integer Array");
		printArray(intArray);
		
		System.out.println("Printing String Array");
		printArray(strArray);
	}
}
