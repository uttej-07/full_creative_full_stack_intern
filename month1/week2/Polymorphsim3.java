package Polymorphism_practice;

class Example4{
	public void area(int l,int b) {
		System.out.println("Area :"+l*b);
	}
}
class Example5 extends Example4{
	public void area(int l,int b,int h) {
		System.out.println("Area: "+l*b*h);
	}
}
public class Polymorphsim3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Example5 c = new Example5();
		c.area(5, 6);
		c.area(5, 6, 7);
	}

}
