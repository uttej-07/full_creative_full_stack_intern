//Java Local Inner Class
package InnerClassPractice;

public class InnerClassExample3 {

	private int data = 10;
	void display() {
		class Local{
			int value = 50;
			void msg() {
				System.out.println(data);
				System.out.println(value);
			}
		}
		Local l = new Local();
		l.msg();
	}
	public static void main(String[] args) {
		InnerClassExample3 obj = new InnerClassExample3();
		obj.display();
	}
}
