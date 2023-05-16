package ExceptionHandling_practice;

public class ExceptionHandlingExample4 {
  public static void main(String[] args) {
	  int a = 10;
	  int b = 0;
	  try {
		  System.out.println(a/b);
	  }catch(ArithmeticException e) {
		  e.printStackTrace();
	  }finally {
		  System.out.println("10/0 will display Arithmetic Exception");
	  }
  }
}
