package inheritance_practice;

class ParentClass{
	public void pdisplay() {
		System.out.println("This is parent class");
	}
}

class ChildClass extends ParentClass{
	public void cdisplay() {
		System.out.println("This is child class");
	}
}
public class inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClass pc =  new ParentClass();
		ChildClass cc = new ChildClass();
		
		//pc.pdisplay();
		cc.cdisplay();
		cc.pdisplay();
	}

}
