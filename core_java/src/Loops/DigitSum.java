package Loops;

import java.util.Scanner;

public class DigitSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int num=sc.nextInt();
		int dg;
		int sum=0;
		while(num>0) {
			dg=num%10;
			sum=sum+dg;
			num=num/10;
		}
		System.out.println("sum of digit is : "+sum);
		sc.close();
	}
}
