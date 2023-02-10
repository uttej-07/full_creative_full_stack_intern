class Example{
    int a=1;
    String name="uttej";
    public void show(){
        System.out.println(a+" "+name);
    }
}
class Main2{
    public static void main(String[] args){
        Example x = new Example();
        x.show();
    }
}