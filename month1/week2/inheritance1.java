package inheritance_practice;

class Pclass{
	
	public void add(int a, int b) {
		
		System.out.println(a+b);
	}
}

class Cclass extends Pclass{
	
	public void mul(int a, int b) {
		
		System.out.println(a*b);
	}
	
	public void task(int a, int b) {
		
	  int c = a*a;
	  int d = b*b;
	  System.out.println(c+d);
		
	}
}
public class inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cclass b = new Cclass();
        b.add(5, 5);
        b.mul(5, 5);
        b.task(5,5);
	}

}
