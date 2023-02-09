class Ex9{
  String name;
  int id;
   public void disp(int i,String n){ 
     this.id = i;
     this.name = n;
      System.out.println("Name of the employee: "+name+" Employee id: "+id);
        }
      }
class Var3{
   public static void main(String[] args){
      Ex9 v = new Ex9();
      v.disp(1,"madhav");
        }
       }

     