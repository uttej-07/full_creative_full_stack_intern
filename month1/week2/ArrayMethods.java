package Array_practice;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4,5,6};
		
		int[] b = {1,2,3,4,5,6};
		
		System.out.println(Arrays.compare(a,b));
		
		int[] c = {4,6,2,8,1,9};
		
		//Arrays.compare()-It is used to compare the arrays and return whether they are same or not.
		System.out.println(Arrays.compare(a, c));
		
		//Arrays.sort-Sorts the array in ascending order
		Arrays.sort(c);
		
		//toString()-	It returns a string representation of the contents of this array.
		System.out.println("Intger array: "+Arrays.toString(c));
		
		int[] k = {96,27,70,274,57,28};
		
		Arrays.sort(k);
		
		int key = 28;
		
		System.out.println(key + "found at index = "+Arrays.binarySearch(k, key));
	}

}
