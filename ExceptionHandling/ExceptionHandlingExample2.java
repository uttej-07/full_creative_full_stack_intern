package ExceptionHandling_practice;

public class ExceptionHandlingExample2 {
      public static void main(String[] args) {
    	  
    	 try {
    		 System.out.println(10/0);
    	 }catch(ArithmeticException e) {
    		 e.printStackTrace();
    		 System.out.println(10/2);
    	 }
      }
}
