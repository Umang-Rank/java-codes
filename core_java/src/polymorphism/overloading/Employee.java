package polymorphism.overloading;

import java.util.Scanner;

public class Employee {
	
	public void login(long mob) {
		System.out.println("login with mobile number "+mob);
	}
	public void login (String user,String pass) {
		System.out.println("login with user id and password "+user+pass);
	}
	public void login(String email) {
		System.out.println("login with email "+email);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1) login with mobile number\n2) login with email\n3) login with user id and password\nchooes any one of three");
		int ch=sc.nextInt();
		
		if(ch==1) {
			System.out.println("enter mobile number ");
			long mb=sc.nextLong();
			e.login(mb);
		}else if(ch==2) {
			System.out.println("enter email ");
			String em=sc.next();
			e.login(em);
		}else {
			System.out.println("enter user id and password ");
			String s1=sc.next();
			String s2=sc.next();
			e.login(s1,s2);
		}
		
		sc.close();
	}

}
