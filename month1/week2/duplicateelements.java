package Array_practice;

//import java.util.Arrays;

public class duplicateelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4,4};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;i<a.length;i++) {
			if((a[i]==a[j]) && (i!=j)) {
	           System.out.println(a[j]);
			}
		}		
	}
		
 }
}
