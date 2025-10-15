package Collection.LinkedList;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		
		LinkedList<Integer> l= new LinkedList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		
		System.out.println(l);
		l.addFirst(1);
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		System.out.println(l.get(3));
	}
}
