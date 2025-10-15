package exceptionHandling;

import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		System.out.println("main started ");
		Scanner sc=new Scanner(System.in);
		try {
			
			System.out.println("try started");
			int i=10/10;
			int arr[]=new int[2];
			System.out.println(arr[4]);
			System.out.println(i);
			System.out.println("try end");
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
			System.out.println("scanner class closed");
		}
		
		try {
			System.out.println("enter number");
			int num=sc.nextInt();
		}catch(IllegalStateException e) {
			System.out.println("scanner closed why");
		}
		
		System.out.println("main ended");
	}

}
