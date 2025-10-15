package Collection.ArrayList;

import java.util.*;

public class ArrayListSum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List<Integer> l= new ArrayList<Integer>();
		
		System.out.println("enter length of arraylist");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("element : "+(i+1));
			l.add(sc.nextInt());
		}
		
		int sum=0;
		
		for(Integer j : l) {
			sum = sum + j;
		}
		
		System.out.println("sum of all elements in array list : "+sum);
		sc.close();
	}
}
