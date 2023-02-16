package Array_practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeclarationandInitilisatio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration of Array
		int[] a= {1,2,3,4,5,6,7,8,9,0};;
		int b[];
			
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		b = new int[size];
		
		for(int i=0;i<size;i++) {
			b[i]=sc.nextInt();
		}
		
		System.out.println("Array elements of a");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println(Arrays.equals(a, b));
		
	}

}
