import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// USING SET TO FIND UNIQUE VALUES
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		
		Set<Integer> unique = new HashSet<>(list);
		
		System.out.println(list.toString());
		System.out.println(unique.toString());
		
		
		// EXAMPLE OF HASHMAP AND TREEMAP
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Test", 1);
		map.put("Hello", 2);
		map.put("World", 3);
		System.out.println("HashMap: \n");
		for(HashMap.Entry<String, Integer> entry: map.entrySet()) {  
		  
			System.out.println(entry.getKey() + " = " +entry.getValue());  
		}
		System.out.println();
		// EXAMPLE OF TREEMAP
		TreeMap<String, Integer> tree = new TreeMap<>(map);
		
		System.out.println("TreeMap: \n");
		for(Map.Entry<String, Integer> entry: tree.entrySet()) {  
			  
			System.out.println(entry.getKey() + " = " + entry.getValue());  
		}
		
		// TreeMap is a SortedList and sorts the values as it is updated
		// This differs from HashMap which is just a List and does not have the sorting feature
		
		// I would use TreeMap to guarentee the order of the key, value pairs
		

	}

}
