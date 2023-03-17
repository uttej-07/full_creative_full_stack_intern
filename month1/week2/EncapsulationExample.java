class Example{
	private int number;
	
	public int getNumber() {
		return number;
	}
	public int setNumber(int n) {
		return this.number=n;
	}
}

public class EncapsulationExample {
  public static void main(String[] args) {
	  Example ece = new Example();
	  ece.setNumber(10);
	  System.out.println(ece.getNumber());
  }
}
