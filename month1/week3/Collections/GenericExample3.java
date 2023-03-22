package GenericsPractice;

class Generic<T>{
	 T obj;
	Generic(T obj) {
		 this.obj = obj;
	 }
	void add(T obj) {
		this.obj = obj;
	}
	public T get() {
		 return obj;
	 }
}
public class GenericExample3{
 public static void main(String[] args) {
	 Generic<Integer> a = new Generic<Integer>(5);
	 //a.add(10);
	 System.out.println(a.get());
 }
}
