class Ab{
    int i;
    String name;
    int sal;
     Ab(){
        System.out.println("This constructor acts as no-args constructor");
}
   Ab(int j, String name1, int salary){
         this.i = j;
         this.name = name1;
         this.sal = salary;
       }
  public void show(){
    System.out.println("name of the employee: "+name+"Age of the employee: "+i+"Salary of the employee: "+sal);
   }
}
class constr4{
   public static void main(String[] args){
       Ab ex = new Ab(21,"uttej",400000);
       Ab ex1 = new Ab();
       ex.show();
       ex1.show();
   }
}