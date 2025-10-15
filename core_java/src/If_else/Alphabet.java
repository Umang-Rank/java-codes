package If_else;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter anything ");
		char ch=sc.next().charAt(0);
		
		if (Character.isLetter(ch)) {
            System.out.println(ch + " is an alphabet.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a number.");
        } else {
            System.out.println(ch + " is a symbol.");
        }

        sc.close();
	}

}
