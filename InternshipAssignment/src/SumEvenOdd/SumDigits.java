package SumEvenOdd;

import java.util.Scanner;

public class SumDigits {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int num=sc.nextInt();
		int digit;
		int sumEven=0;
		int sumOdd=0;
		
		while(num>0) {
			digit=num%10;
			if(digit%2==0) {
				sumEven+=digit;
			}else {
				sumOdd+=digit;
			}
			num=num/10;
		}
		
		System.out.print("Sum of Even digits :"+sumEven);
		System.out.println();
		System.out.print("Sum of Odd digits :"+sumOdd);
	}

}
