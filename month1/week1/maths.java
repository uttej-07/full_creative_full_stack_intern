class Ex{
    int num1;
    int num2;
    int result;
     void add(){
         result = num1 + num2;
         System.out.println(result);
     }
     void sub(){
         result = num1 - num2;
         System.out.println(result);
     }
     void multiplication(){
         result = num1 * num2;
         System.out.println(result);
     }
     void divide(){
         result = num1 / num2;
         System.out.println(result);
     }
}
class maths{
    public static void main(String[] args){
        Ex a = new Ex();
        a.num1 = 10;
        a.num2 = 5;
        a.add();
        a.sub();
        a.multiplication();
        a.divide();
    }
}