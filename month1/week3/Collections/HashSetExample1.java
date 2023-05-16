package SetPractice;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
  public static void main(String[] args) {
	  Set<Integer> number = new HashSet<>();
	  number.add(1);
	  number.add(2);
	  number.add(3);
	  Set<Integer> number2 = new HashSet<>();
	  number2.addAll(number);
	  System.out.println(number2);
  }
}
