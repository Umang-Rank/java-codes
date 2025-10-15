package If_else;

import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		int length,bredth;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two side of a object ");
		length=sc.nextInt();
		bredth=sc.nextInt();
		
		if(length==bredth) {
			System.out.println("object is squre ");
		}else {
			System.out.println("object is rectangle ");
		}
		sc.close();
	}

}
