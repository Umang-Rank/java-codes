package Collection.Vector;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		
		for (int i = 0; i < 6; i++) {
			v.add(i+100);
			
		}
		
		System.out.println(v.size());
		Enumeration<Integer> enm=v.elements();
		
		while(enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
	}

}
