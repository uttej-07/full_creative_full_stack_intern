//Java Member Inner Class

package InnerClassPractice;

public class InnerClassExample1 {

	private int data = 30;
	class Inner{
		void msg() {
			System.out.println("data is " + data);
		}
	}
	
	public static void main(String[] args) {
		InnerClassExample1 obj = new InnerClassExample1();
		InnerClassExample1.Inner in = obj.new Inner();
		in.msg();
	}
}
