package GenericsPractice;
import java.util.*;

public class GenericsExample2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "uttej");
		map.put(2, "bhavana");
		map.put(3, "gowrav");
		
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> e = itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
