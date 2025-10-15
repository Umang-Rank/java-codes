package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddInEachElement {
	
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter size of a array list");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("element "+(i+1));
			l.add(sc.nextInt());
		}
		
		System.out.println("befor : "+l);
		
		for(int i=0;i<l.size();i++) {
			l.set(i, (l.get(i)+100));
		}
		
		sc.close();
		System.out.println("after : "+l);
	}

}
