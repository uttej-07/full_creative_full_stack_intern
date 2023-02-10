class con{
  int a;
  String name;
      private con(){
         a = 21; name = "uttej";
         System.out.println(a+" "+name);
        }
}
class constr7{
   public static void main(String[] args){
   con ex = new con();
   }
}