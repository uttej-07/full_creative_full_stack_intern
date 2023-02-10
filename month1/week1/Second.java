class Second {
  public static void main(String[] args) {
    Main10 obj = new Main10(); 
    System.out.println("Name: " + obj.fname + " " + obj.lname);
    System.out.println("Email: " + obj.email);
    System.out.println("Age: " + obj.age);
    if(obj.age>18){
    System.out.println("Eligible to vote");
   }else{
    System.out.println("Not Eligible to vote");
  }
}
}