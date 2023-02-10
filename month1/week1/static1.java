class static1{
 static int fun(){
  static int a=10;
  System.out.println("hello world!");
  return a;
  }
public static void main(String[] args){
  System.out.println(fun());
 }
}