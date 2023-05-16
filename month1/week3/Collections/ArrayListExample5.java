package ArrayListPractice;

import java.util.ArrayList;

public class ArrayListExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Integer>> allist = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		allist.add(al);
		
	    ArrayList<Integer> a2 = new ArrayList<Integer>();
	    a2.add(5);
	    allist.add(a2);
	    
	    ArrayList<Integer> a3 = new ArrayList<Integer>();
	    a3.add(10);
	    a3.add(20);
	    a3.add(30);
	    allist.add(a3);
	    for(int i =0;i<allist.size();i++) {
	    	for(int j=0;j<allist.get(i).size();j++) {
	    		System.out.print(allist.get(i).get(j)+" ");
	    	}
	    	System.out.println();
	    }
	}

}
