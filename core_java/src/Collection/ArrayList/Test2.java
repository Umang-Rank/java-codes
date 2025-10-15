package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	
	public static void main(String[] args) {
		
		List<Integer> l= new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(100);
		l.add(300);
		l.add(null);
		System.out.println(l);
		System.out.println("size befor remove : "+l.size());
		l.remove(4);
		System.out.println("size after remove : "+l.size());
		//System.out.println(l.get(6));
		System.out.println(l);
		System.out.println(l.contains(300));
		System.out.println(l.get(2));
		System.out.println(l.indexOf(200));
		System.out.println(l.lastIndexOf(200));
		//l.clear();
		System.out.println(l.isEmpty());
		
	}

}
