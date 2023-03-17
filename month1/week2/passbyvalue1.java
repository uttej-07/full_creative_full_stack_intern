package Array_practice;

class Example1{
	   public int addition(int a, int b){
	      return a+b;
	       }
	   }
	 class passbyvalue1{
	   public static void main(String[] args){
	     Example1 ex = new Example1();
	     System.out.println(ex.addition(5,5));
	       }
	    }
