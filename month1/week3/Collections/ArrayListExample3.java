package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample3 {

		public static void main(String args[]){ 
			ArrayList al= new ArrayList();
			Object cloneList; // Creating an object of clone
			al.add("Edureka");
			al.add("Java");
			al.add("Arrays");
			System.out.println("Contents of ArrayList al:" +al);
			cloneList= al.clone(); //Clones the entire ArrayList
			System.out.println("Elements in the cloned list are:");
			System.out.println(cloneList);
		}
		}