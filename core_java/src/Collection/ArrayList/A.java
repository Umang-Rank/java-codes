package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		
		List<Integer> l= new ArrayList<Integer>();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter 5 elements ");
		for(int i=0;i<5;i++) {
			l.add(sc.nextInt());
		}
		
		System.out.println("by using itrator ");
		Iterator<Integer> itr=l.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("by using for loop");
		
		for(int i: l) {
			System.out.println(i);
		}
	}

}
