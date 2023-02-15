package typecasting_practice;

import java.util.*;
public class typecastingexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Widening Type casting
		
	
		int a = 10;
	
		//Converts the Integer type into long type
		long b = a;
		
		//Converts long type into double
		double c = b;
		
		System.out.println("The value at int datatype:"+a);
		
		System.out.println("The value at long datatype:"+b);
		
		System.out.println("The value at double datatype:"+c);
		
		
		//Narrowing Type Casting
		
		 double d = 267.98;
		 
		 //converting double to int
		 
		 int e = (int)d;
		 
		 //converting int to byte
		 
		 byte f=(byte)e;
		 
		 System.out.println("The value at double data type:"+d);
		 
		 System.out.println("The value at int data type:"+e);
		 
		 System.out.println("The value at byte data type:"+f);
	}

}
