package scannerExample;
import java.util.Scanner;

public class Emp {
	int age;
	String name;
	String intrest;
	
	public static void main(String[] args) {
		Emp e1= new Emp();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name :");
		e1.name=sc.next();
		System.out.println("enter your age :");
		e1.age=sc.nextInt();
		System.out.println("enter your field of intrests : ");
		e1.intrest=sc.next()+sc.nextLine();
		
		System.out.println("name : "+e1.name);
		System.out.println("age : "+e1.age);
		System.out.println("intrests : "+e1.intrest);
	
		sc.close();
	}
}
