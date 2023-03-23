package InnerClassPractice;

class InterfacePractice{
	interface message{
		void msg();
	}
}
public class InnerClassExample7 implements InterfacePractice.message{
	
	public void msg() {
		System.out.println("Hello nested Interface");
	}
	
	public static void main(String[] args) {
		InterfacePractice.message obj = new InnerClassExample7();
		obj.msg();
	}

}
