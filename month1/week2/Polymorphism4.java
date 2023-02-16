package Polymorphism_practice;

class SingleMessageFunction{
	public void message(){
		System.out.println("You can send message only to a single person");
	}
}
class GroupMessageFunction extends SingleMessageFunction{
	@Override
	public void message() {
		System.out.println("You can send message to a group");
	}
}
class GMessageFunction extends GroupMessageFunction{
	@Override
	public void message() {
		System.out.println("You can send message to a group of poeple");
	}
}
public class Polymorphism4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleMessageFunction m;
		m = new SingleMessageFunction();
		m.message();
		m = new GroupMessageFunction();
		m.message();
		m= new GMessageFunction();
		m.message();
	}

}
