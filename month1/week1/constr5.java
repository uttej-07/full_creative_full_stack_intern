class Ab{
  int i;
 String name;
  Ab(){
     System.out.println("Working!");
    }
 Ab(String name1){
   this.name = name1;
     System.out.println("name of the employee is: "+name);
   }
 Ab(int j,String name1){
   this.name = name1;
   this.i=j;
     System.out.println("name of the employee is: "+name+" and age of the employee: "+i);
   }
}
class constr5{
   public static void main(String[] args){
     Ab ex = new Ab();
     Ab ex1 = new Ab("uttej");
     Ab ex2 = new Ab(21,"uttej");
     }
}

