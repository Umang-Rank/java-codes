package string;

import java.util.Scanner;

public class Capital {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		String str=sc.nextLine();
		
		String[] arr=str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(Character.toUpperCase(arr[i].charAt(0))+arr[i].substring(1)+" ");
		}
	}

}
