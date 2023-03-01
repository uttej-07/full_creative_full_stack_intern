package SetPractice;

import java.util.*;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;

public class TreeSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> num = new ArrayList<>();
		num.add(2);
		num.add(3);
		num.add(4);
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(1);
		numbers.addAll(num);
		System.out.println(numbers);
		
	}

}
