package Loops;

import java.util.Scanner;

public class Fibonaci {
	public static void main(String[] args) {
		int a=0,b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit of series ");
		int n=sc.nextInt();
		
		System.out.print(a+" "+b+" ");
		for(int i=2;i<n;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
