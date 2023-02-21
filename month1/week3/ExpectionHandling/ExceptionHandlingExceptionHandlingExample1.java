package ExceptionHandling_practice;

public class ExceptionHandlingExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int[] a = new int[10];
			System.out.println(a[-1]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Exception Handled");
		}
	}
}
