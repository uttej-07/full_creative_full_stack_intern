class outer{
    static class inner{
       int a;
       int b;
         inner(int x, int y){
           this.a=x;
           this.b=y;
          }
      public void add(){
        System.out.println("result: "+(a+b));
        }
     }
}
class static4{
   public static void main(String[] argss){
   outer.inner s4 = new outer.inner(5,5);
  s4.add();
  }
}