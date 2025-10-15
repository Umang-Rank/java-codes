package Loops;

import java.util.Scanner;

public class ChoiceTable {
	
	public static void table(int n) {
		for(int i=1;i<11;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number for table :");
		int num=sc.nextInt();
		table(num);
		sc.close();
	}

}
