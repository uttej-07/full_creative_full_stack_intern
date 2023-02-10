class Student7{  
    int i;  
    String name;  
    Student7(int j,String n){  
    i = j;  
    name = n;  
    }  
    Student7(){}  
    void display(){System.out.println(i+" "+name);}  
}
  class constr9{ 
    public static void main(String args[]){  
    Student7 s1 = new Student7(114990,"uttej");  
    Student7 s2 = new Student7();  
    s2.i=s1.i;  
    s2.name=s1.name;  
    s1.display();  
    s2.display();  
   }  
}  