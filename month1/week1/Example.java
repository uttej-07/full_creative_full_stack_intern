 class Example{
    int a=1;
    String name="uttej";
    public void show(){
        System.out.println(a+" "+name);
    }
    public static void main(String[] args){
        Example r = new Example();
        r.show();
    }
}
/*Output: Error: Could not find or load main class Main
Caused by: java.lang.ClassNotFoundException: Main*/