class example{
   example(){
     System.out.println("Constructor would be displayed first!");
      }
   public void show(){
     System.out.println("Method is execcuted");
      }
}
class constr2{
  public static void main(String[] args){
     example ex = new example();
    ex.show();
    }
}