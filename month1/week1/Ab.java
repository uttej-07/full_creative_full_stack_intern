abstract class Animal{
    abstract void walk();
}
class Horse extends Animal{
  public void walk(){
   System.out.println("Horse walks on 4 legs");
 }
}
class Chicken extends Animal{
  public void walk(){
   System.out.println("Chicken walks on 2 legs");
 }
}
public class Ab{
public static void main(String[] args){
Animal h = new Horse();
Animal c = new Chicken();
h.walk();
c.walk();

}
}
