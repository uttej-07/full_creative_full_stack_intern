class A{  
void msg(){System.out.println("Hello");}  
}  
class B{  
void disp(){System.out.println("Welcome");}  
}  
class MultipleInheritance1 extends A,B{//suppose if it were  
   
 public static void main(String args[]){  
   C obj=new C();  
   obj.msg();//Now which msg() method would be invoked?  
}  
}  
