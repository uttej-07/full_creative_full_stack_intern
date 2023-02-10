import java.lang.String;
 class Ex2{
    static void show(String clg,String... name){
        for( String i:name){
             System.out.println("Name of the college: "+clg+"Name of the student: "+i);
                 }
              }
            }
   class Vargs2{
      public static void main(String[] args){
        Ex2 m = new Ex2();
           m.show("VJIT","uttej","bhavana");
                }
           }
