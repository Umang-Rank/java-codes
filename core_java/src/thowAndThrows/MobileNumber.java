package thowAndThrows;

import java.util.InputMismatchException;
import java.util.Scanner;

class Validate extends Exception{
	
	public Validate(String st) {
		super(st);
	}
}
public class MobileNumber {
	
	public static void number(long mob1) throws Validate {
		
		int i=0;
		while(mob1>0) {
			i++;
			mob1=mob1/10;
		}
		if(i==10) {
			System.out.println("Your number is valid..");
		}else {
			Validate v=new Validate("Invalid mobile number!!!");
			throw v;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter mobile number ");
		try{
			long mob=sc.nextLong();
			MobileNumber.number(mob);
		}catch(InputMismatchException e) {
			System.out.println("enter numbers only");
		}catch(Validate v) {
			System.out.println(v.getMessage());
		}
		
		sc.close();
		
	}

}
