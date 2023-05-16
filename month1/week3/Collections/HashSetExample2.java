package SetPractice;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = {1,2,3,4,5};
		HashSet<Integer> num1 = new HashSet<>();
        for(int s:number) {
        	num1.add(s);
        }
        System.out.println(num1);
        
        String[] namelist = {"uttej","bhavana","goutham","gowrav","sujith"};
        HashSet<String> names = new HashSet<>(Arrays.asList(namelist));
        System.out.println(names);
	}
}
