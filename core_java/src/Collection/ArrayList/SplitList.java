package Collection.ArrayList;

import java.util.*;

public class SplitList {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> evenList = new ArrayList<Integer>();
		List<Integer> oddList = new ArrayList<Integer>();
		
		System.out.println("enter how many number you want");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=0;j<n;j++) {
			System.out.println("enter element "+(j+1));
			list.add(sc.nextInt());
		}
		
		for(Integer i: list) {
			if(i%2==0) {
				evenList.add(i);
			}else {
				oddList.add(i);
			}
		}
		
		System.out.println("even : "+evenList);
		System.out.println("odd : "+oddList);
		sc.close();
	}
}
