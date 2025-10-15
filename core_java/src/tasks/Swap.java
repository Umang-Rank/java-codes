package tasks;

import java.util.Scanner;

public class Swap {
	int a,b,c;
	
	public static void main(String[] args) {
		Swap s=new Swap();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		s.a=a1;
		s.b=a2;
		System.out.println("before swap : "+s.a+"\t"+s.b);
		
		s.c=s.a;
		s.a=s.b;
		s.b=s.c;
		
		System.out.println("after swap : "+s.a+"\t"+s.b);
		sc.close();
	}
}
