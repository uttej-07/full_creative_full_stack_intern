interface A1{
public void B1();
public void C1();
}

abstract class D1 implements A1{
  public void B1(){
  System.out.println("My name is Uttej");
}
}
class E1  extends D1{ 
  public void C1(){
  System.out.println("I am from Hyderabad and I am doing internship in Full-Creative");
  }
}
public class Demo1{
 public static void main(String[] args){
 E1 x = new E1();
  x.B1();
  x.C1();
 }
}

 