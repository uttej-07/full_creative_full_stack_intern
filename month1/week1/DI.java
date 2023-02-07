interface A{
  void add();
}

interface B{
 void add();
}

class C implements A,B{
  int a,b;
  public void add(){
   a=5;b=5;
   System.out.println(a+b);
 }
}

class DI{
  public static void main(String[] args){
    C mi = new C();
     mi.add();
  }
}
