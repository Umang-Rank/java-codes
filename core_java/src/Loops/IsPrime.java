package Loops;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number :");
		int num=sc.nextInt();
		int cnt=0;
		int i=1;
		
		while(i<=num) {
			if(num%i==0) {
				cnt++;
			}
			i++;
		}
		if(cnt==2) {
			System.out.println("prime ");
		}else {
			System.out.println("not prime ");
		}
		sc.close();
	}

}
