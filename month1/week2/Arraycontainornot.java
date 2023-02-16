//Write a Java program to remove a specific element from an array.

package Array_practice;

import java.util.*;

public class Arraycontainornot {
	
	public void contains(int x[],int key) {
		 
		for(int i=0;i<x.length;i++) {
			if(key == x[i]) {
				System.out.println("Key element found at index: "+ i);
			}else {
				System.out.println("Key element not found at index: "+ i);
			}
		  }
		}
   
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		
		int r = sc.nextInt();
		
		int[] b = new int[r];
		
		for(int i=0;i<r;i++){
			
			b[i]=sc.nextInt();
			
		}
		
		int ele = 5;
		
		Arraycontainornot m = new Arraycontainornot();
		
		m.contains(b,ele);
		
	}
}
