//Write a Java program to remove a specific element from an array

package Array_practice;

import java.util.Arrays;

public class removeelement {
	
  public static void main(String[] args) {
	  
    int[] a = {6,5,9,23,76,89,45};
    
    System.out.println("Before element removed");
    
    for(int i=0;i<a.length;i++) {
    	System.out.print(a[i]+" ");
    }
    Arrays.sort(a);
    
    int b = 9;
    
    System.out.println();
    
    for(int i=0;i<a.length;i++) {
    	
    	if(b==a[i]) {
    	  continue;	
    	}
    	System.out.print(a[i]+ " ");
    }
  }
}
