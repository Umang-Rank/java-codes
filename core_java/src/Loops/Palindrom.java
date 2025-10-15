package Loops;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int num=sc.nextInt();
		int rev=0;
		int temp=num;
		int digit=0;
		while(num>0) {
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("number is palindrom");
		}else {
			System.out.println("number is not palindrom");
		}
		sc.close();
	}
}
