abstract class vehicle{
 abstract void wheels();
}
class bike extends vehicle{
   public void wheels(){
  System.out.println("Bike has 2 wheels");
}
}
class car extends vehicle{
public void wheels(){
  System.out.println("Bike has 4 wheels");
}
}
class Demo{
public static void main(String[] args){
bike b = new bike();
car c = new car();
b.wheels();
c.wheels();
}
}
