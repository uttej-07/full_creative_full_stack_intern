interface A{
 void add();
}

interface B{
 void sub();
}

class C implements A,B
{
  int a=10, b=5;
  public void add(){
   System.out.println(a+b);
  }
  public void sub(){
   System.out.println(a-b);
  }
}
public class M1{
 public static void main(String[] args){
  C m = new C();
   m.add();
   m.sub();
  }
}