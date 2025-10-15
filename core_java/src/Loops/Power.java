package Loops;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int num=sc.nextInt();
		System.out.println("enter power :");
		int pow=sc.nextInt();
		
		
		
		double result=1;
		int i=1;
		
		while(i<=pow) {
			result=result*num;
			i++;
		}
		System.out.println("result is : "+result);
		sc.close();
//		System.out.println(10.10/0);
	}
}
