package Fcator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number : ");
		int num= sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				list.add(i);
			}
		}
		if(list.isEmpty()) {
			System.out.println("Factor of "+num+" (excluding 1 and "+num+" ) are : "
					+ "none (the number is prime or has no factor other than 1 and itself)");
		}
		else {
			System.out.println("Factor of "+num+" (excluding 1 and "+num+" ) are :");
			for(Integer i:list) {
				System.out.print(i);
			}
		}
	}

}
