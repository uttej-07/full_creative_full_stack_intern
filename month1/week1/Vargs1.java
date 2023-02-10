 class Ab{
      public void b(int ... c){
          for(int i:c){
               System.out.println(i);
                }
           }
       }
   class Vargs1{
      public static void main(String[] args){
         Ab ex = new Ab(); 
           ex.b(1,2,3,4,5,6,7);
             }
         }