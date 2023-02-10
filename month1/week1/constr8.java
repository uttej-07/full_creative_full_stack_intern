class Student6{  
    int i;  
    String name;  
   
    Student6(int j,String n){  
    i = j;  
    name = n;  
    }  
    //constructor to initialize another object  
    Student6(Student6 s){  
    i = s.i;  
    name =s.name;  
    }  
    void display(){System.out.println(i+" "+name);}  
   }
class constr8{
    public static void main(String args[]){  
    Student6 s1 = new Student6(114990,"uttej");  
    Student6 s2 = new Student6(s1);  
    s1.display();  
    s2.display();  
   }  
}  