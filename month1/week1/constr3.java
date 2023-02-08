class Ab{
  int i;
  String name;
   public void display(){
     System.out.println("name: "+name+"age: "+i);
    }
}
class constr3{
  public static void main(String[] args){
   Ab ex = new Ab();
   ex.display();
   }
}