package If_else;

import java.util.Scanner;

public class Voting {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter birth year :");
		int year=sc.nextInt();
		
		if(2025-year>18) {
			System.out.println("you can vot !!!");
		}else {
			System.out.println("you can't vot !!!");
		}
		sc.close();
	}
}
