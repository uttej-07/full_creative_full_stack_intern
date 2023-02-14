class Example2{
  private int password = 658321;
  private int pw1;
  public int getPassword(){
   return pw1;
  }
  public void setPassword(int p){
    this.pw1=p;
   }
  public void verify(){
   if(password == pw1){
    System.out.println("Both are same. Verified!");
       }else{
    System.out.println("Password not matched");
      }
    }
  }
class EncapsulationExample2{
  public static void main(String[] args){
   Example2 e2 = new Example2();
   e2.setPassword(658322);
System.out.println(e2.getPassword());
e2.verify();
 }
}