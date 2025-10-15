package map;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
		
		Map<Integer,String> studMap = new HashMap<Integer, String>();
		studMap.put(101, "umang");
		studMap.put(102, "rushab");
		studMap.put(103, "ansh");
		studMap.put(104, "parag");
		studMap.putIfAbsent(105, "suraj");
		
		System.out.println(studMap.containsKey(101));
		System.out.println(studMap.containsValue("Umang"));
		
		studMap.remove(104);
		studMap.remove(101,"rushab");
		
		studMap.clear();
		
		System.out.println(studMap);
	}

}
