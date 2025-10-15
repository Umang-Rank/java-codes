package tasks;

import java.util.Scanner;

public class Avg {
	
	float n1,n2,n3,n4,n5;
	
	public Avg(float n1,float n2,float n3,float n4,float n5) {
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
		this.n4=n4;
		this.n5=n5;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 5 numbers");
		float n1 = sc.nextInt();
		float n2=sc.nextInt();
		float n3=sc.nextInt();
		float n4=sc.nextInt();
		float n5=sc.nextInt();
		Avg a=new Avg(n1,n2,n3,n4,n5);
		float avg=(a.n1+a.n2+a.n3+a.n4+a.n5)/5;
		System.out.println("avg is : "+avg);
		
		sc.close();
	}
}
