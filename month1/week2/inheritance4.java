package inheritance_practice;

class Shape{
	public void print() {
		System.out.println("This is a Shape");
	}
}
class Rectangle extends Shape{
	public void rprint() {
		System.out.println("This is rectangular shape");
	}
}
class Circle extends Shape{
	public void cprint() {
		System.out.println("This is Circular Shape");
	}
}
class Square extends Rectangle{
	public void sprint() {
		System.out.println("Square is a rectangle");
	}
}
public class inheritance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square s = new Square();
		s.print();
		s.rprint();
	}

}
