abstract class A{
  int a = 21;
  String name = "uttej";
}
class B extends A{
  void disp(){
   System.out.println("Name of the intern is: "+name+ "and age is: "+a);
  }
}
class Ex2{
  public static void main(String[] args){
   B a = new B();
   a.disp();
}
}