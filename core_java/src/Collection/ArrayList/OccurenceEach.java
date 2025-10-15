package Collection.ArrayList;

import java.util.*;

public class OccurenceEach {
	
	public static void main(String[] args) {

		List<Integer> l=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter length of arraylist");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("element : "+(i+1));
			l.add(sc.nextInt());
		}
		
		
		for(int i=0;i<l.size();i++) {
			int flag=1;
			for(int j=i+1;j<l.size();j++) {
				if(l.get(i)==l.get(j)) {
					flag++;
					l.remove(j);
					j--;
				}	
			}
			System.out.println("element "+l.get(i)+" is present "+flag+" times");
		}
		
	}

}
