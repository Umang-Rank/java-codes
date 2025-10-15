package If_else;

import java.util.Scanner;

public class divisible {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("enter the number : ");
		a=sc.nextInt();
		
		if (a%5==0) {
			System.out.println("divisible by 5 ");
		} else {
			System.out.println("not divisible by 5 ");
		}
		
		sc.close();
	}

}
