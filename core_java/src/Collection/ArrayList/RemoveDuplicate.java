package Collection.ArrayList;

import java.util.*;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		System.out.println("enter how many number you want");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=0;j<n;j++) {
			System.out.println("enter element "+(j+1));
			l.add(sc.nextInt());
		}
		
		for(int i=0;i<l.size();i++) {
			for(int j=i+1;j<l.size();j++) {
				if(l.get(i)==l.get(j)) {
					l.remove(j);
				}
			}
		}
		
		System.out.println(l);
		sc.close();
	}

}
