package ExceptionHandling_practice;

public class ExceptionHandlingExample5 {
      public static void main(String[] args) {
    	  try {
    		  String s = null;
    		  System.out.println(s.length());
    	  }catch(NullPointerException e) {
    		  e.printStackTrace();
    	  }
      }
	}
