interface A{
public void B();
public void C();
}
class D implements A{
  public void B(){
 System.out.println("Hello World!");
}
public void C(){
System.out.println("It is working!");
}
}
public class E1{
public static void main(String[] args){
D m = new D();
m.B();
m.C();
}
}
