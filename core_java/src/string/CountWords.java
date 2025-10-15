package string;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		String str=sc.nextLine();
		
		String[] arr=str.split(" ");
		System.out.println("total words "+arr.length);
	}

}