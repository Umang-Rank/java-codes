package Loops;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int num=sc.nextInt();
		int digit=1;
		while(num>=10) {
			digit++;
			num=num/10;
		}
		System.out.println("total digit is : "+digit);
		sc.close();
	}
}
