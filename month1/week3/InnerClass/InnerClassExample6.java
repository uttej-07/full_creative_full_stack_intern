package InnerClassPractice;

interface Showable{
	void show();
	interface Message{
		void msg();
	}
}

public class InnerClassExample6 implements Showable,Showable.Message{
	
	public void msg() {
		System.out.println("We have implemented the Interface which is inside an Interface ");
	}
	
	public void show() {
		System.out.println("Implemented the Inteface");
	}
	
	public static void main(String[] args) {
		Showable msg1 = new InnerClassExample6();
		Showable.Message msg = new InnerClassExample6();
		
		msg.msg();
	    msg1.show();
	}

}
