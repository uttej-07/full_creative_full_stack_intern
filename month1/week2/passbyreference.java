package Array_practice;

class Example2{
	public int square(Integer p) {
		 return p*p;
	}
}

public class passbyreference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer s = 10;
		
		Example2 m = new Example2();
  		
		System.out.println("Area of a square: "+m.square(s));

	}

}
