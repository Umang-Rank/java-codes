package tasks;

import java.util.Scanner;

public class Celsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter celsius : ");
		float num=sc.nextFloat();
		
		double farn=(num*1.8)+32;
		System.out.println("Fahrenheit : "+farn);
		sc.close();
	}

}
