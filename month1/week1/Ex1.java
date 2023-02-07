final class Ex{
 int a =1;
 public void show(){
     System.out.println("Final keyword is used");
  }
}
/*class a extends Ex{
  public void show(){
   System.out.println(a+" "+ "is printing");
  }
}*/
class Ex1{
  public static void main(String[] args){
     Ex a = new Ex();
     a.show();
    /* a b = new a();
     a.show();*/
}
}