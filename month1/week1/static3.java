class Ab{
    
   static{
  System.out.println("Static block has higher preference than main block");
 }
}
class static3{
 public static void main(String[] args){
 Ab m = new Ab();
 }
}
