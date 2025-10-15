package Collection.ArrayList;

import java.util.*;

public class Occurence {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List<Integer> l= new ArrayList<Integer>();
		
		System.out.println("enter length of arraylist");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("element : "+(i+1));
			l.add(sc.nextInt());
		}
		
		System.out.println("enter element to search occurence : ");
		int num=sc.nextInt();
		
		int flag=0;
		for(Integer i:l) {
			if(i==num) {
				flag++;
			}
		}
		
		System.out.println("your element is present "+flag+" times");
		
	}

}
