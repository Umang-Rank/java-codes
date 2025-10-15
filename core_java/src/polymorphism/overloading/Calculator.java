package polymorphism.overloading;

import java.util.Scanner;

public class Calculator {
	
	public void add(int a,int b) {
		System.out.println("addition with integer "+(a+b));
	}
	public void add(short a,short b) {
		System.out.println("addition with short type "+(short)(a+b));
	}
	public void add(float a,float b) {
		System.out.println("addition with float type "+(float)(a+b));
	}
	public void add(byte a,byte b) {
		System.out.println("addition with byte type "+(byte)(a+b));
	}
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("which type of number you want"
				+ "\n1- int"
				+ "\n2- short"
				+ "\n3- float"
				+ "\n4- byte");
		int ch=sc.nextInt();
		if(ch==1) {
			System.out.println("enter two integers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			c.add(a, b);
		}else if(ch==2) {
			System.out.println("enter two short numbers");
			short a=sc.nextShort();
			short b=sc.nextShort();
			c.add((short)a,(short) b);
		}else if(ch==3) {
			System.out.println("enter two float numbers");
			float a=sc.nextFloat();
			float b=sc.nextFloat();
			c.add((float)a,(float) b);
		}else {
			System.out.println("enter two byte numbers");
			byte a=sc.nextByte();
			byte b=sc.nextByte();
			c.add((byte)a,(byte) b);
			System.out.println();
		}
		sc.close();
	}
}
