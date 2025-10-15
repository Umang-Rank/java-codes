package Collection.ArrayList;

import java.util.*;

public class Sort {
	
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		System.out.println("enter how many number you want");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=0;j<n;j++) {
			System.out.println("enter element "+(j+1));
			l.add(sc.nextInt());
		}
		System.out.println("before sorting : "+l);
		Collections.sort(l);
		System.out.println("after sorting : "+l);	
	}

}
