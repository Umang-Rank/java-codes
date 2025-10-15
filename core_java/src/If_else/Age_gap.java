package If_else;

import java.util.Scanner;

public class Age_gap {
	
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two person's age :");
		a=sc.nextInt();
		b=sc.nextInt();
		int gap;
		if(a>b) {
			gap=a-b;
			System.out.println("first person is older than "
					+ "second person with age gap of : "+ gap);
		}else {
			gap=b-a;
			System.out.println("second person is older than "
					+ "first person with age gap of : "+ gap);
		}
		sc.close();
	}

}
