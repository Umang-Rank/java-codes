package string;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		String str=sc.nextLine();
		
		 String rep=str.replace(' ', '@');
		 
		 System.out.println(rep);
		 
		 System.out.println("enter string ");
		 String str2=sc.nextLine();
		 
		 String rep2=str2.replace("java", "gujrati");
		 System.out.println(rep2);
	}

}
