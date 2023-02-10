abstract class A{
  }
class B extends A{
  public void show(){
    System.out.println("Hello World!");
    }
}
public class C{
public static void main(String[] args){
  B d = new B();
  d.show(); 
  }
}