package Array_practice;

import java.util.*;
public class SortingofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		
		String[] b = new String[10];
		
		System.out.println("Enter values for int array: ");
		
		for(int i = 0; i < a.length; i++) {
			
			a[i] = sc.nextInt();
			
		}
		
		System.out.println("Enter values for String array");
		
		for(int i = 0; i < b.length; i++) {
			
			b[i] = sc.nextLine();
			
		}
		
		System.out.println("Before Sorting");
		
        for(int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+",");
			
		}
        System.out.println();
        Arrays.sort(a);
        
        System.out.println("After sorting");
        
        for(int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+",");			
		}

        System.out.println();
        
        System.out.println("Before Sorting");
        
        for(int i = 0; i < b.length; i++) {
			
   	     System.out.print(b[i]+",");
   			
   		}
        
        System.out.println();
        
        Arrays.sort(b);
        
        System.out.println("After sorting");
        
        for(int i = 0; i < b.length; i++) {
			
	     System.out.print(b[i]+",");
			
		}
	}
}
