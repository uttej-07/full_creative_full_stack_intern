package InnerClassPractice;

public class InnerClassExample4 {

	static int data = 30;
	static  class Inner{
		void msg() {
			System.out.println("data is "+data);
		}
	}
	public static void main(String[] args) {
		InnerClassExample4.Inner obj = new InnerClassExample4.Inner();
		obj.msg();
	}
}
