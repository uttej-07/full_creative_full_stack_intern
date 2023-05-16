package InnerClassPractice;

public class InnerClassExample5 {

	static int data = 10;
	static class Inner{
		static void msg() {
			System.out.println("data is "+ data);
		}
	}
	public static void main(String[] args) {
		InnerClassExample5.Inner.msg();
	}
}
