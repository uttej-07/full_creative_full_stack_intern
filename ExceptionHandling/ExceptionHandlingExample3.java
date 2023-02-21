package ExceptionHandling_practice;

class NotEligibleException extends Exception{
	
	NotEligibleException(){
		System.out.println("You are not eligible to vote");
	}
}
public class ExceptionHandlingExample3 {

	 public static void main(String[] args) {
		 
		 try {
			 vote(12);
		 }catch(NotEligibleException e) {
			 e.printStackTrace();
		 }
	 }
	 
	 public static void vote(int age) throws NotEligibleException {
		  if(age<18) {
		   throw new NotEligibleException();
          }else {
        	   System.out.println("You are eligible to vote");
          }
    }
}