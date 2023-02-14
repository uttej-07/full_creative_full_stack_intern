class Parent{
   public void display(){
     System.out.println("Parent class");
        }
     }

class Child1 extends Parent{
   public void display1(){
      System.out.println("Child1 class");
          }
       }

class Child2 extends Child1{
    public void display2(){
      System.out.println("Child2 class");
        }
     }
class MultilevelInheritance1{
  public static void main(String[] args){
    Child2 c = new Child2();
     c.display();
     c.display1();
     c.display2();
     }
  }
