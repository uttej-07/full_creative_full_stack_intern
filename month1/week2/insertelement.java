//Write a Java program to insert an element (specific position) into an array

package Array_practice;

import java.util.Scanner;
import java.util.Arrays;

public class insertelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Scanner sc = new Scanner(System.in);
	
		int[] a = {1,2,3,5,6,7,8,9,10,11};
		
		/*for(int i = 0;i < a.length;i++) {
			a[i]=sc.nextInt();
		}*/
		
		int ele = 4;
		int pos = 3;
		
		for(int i=a.length-1;i>pos;i--) {
			a[i]=a[i-1];
		}
		
		a[pos]=ele;
		
		System.out.println("New Array: "+Arrays.toString(a));
	}

}
