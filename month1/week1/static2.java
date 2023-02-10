class college{
  int rollno;
  String name;
  static String clgname = "VJIT";
  
 college(int roll_no,String name1){
   this.rollno= roll_no;
   this.name=name1;
  }
 
public void show(){
  System.out.println("Name of the student: "+name+"Roll.no of the student: "+rollno+ "Name of the college: "+clgname);
 }
}
class static2{
  public static void main(String[] args){
  college uttej = new college(10,"uttej");
 college bhavana = new college(11,"bhavana");
uttej.show();
bhavana.show();
 }
}