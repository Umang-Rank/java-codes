package encapsulation;

import java.util.Scanner;

public class Details {
	Scanner sc=new Scanner(System.in);
	Student s=new Student();
	
	public void setData(int n) {
		for(int i=0;i<n;i++) {
			System.out.println("enter details of student "+(i+1));
		System.out.println("enter roll number");
		int roll=sc.nextInt();
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your fees");
		float fees=sc.nextFloat();
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.println("enter your mobile no");
		long mob=sc.nextLong();
		System.out.println("enter your address");
		String addr=sc.next()+sc.nextLine();
		
		s.setAddr(addr);
		s.setAge(age);
		s.setFees(fees);
		s.setMob(mob);
		s.setName(name);
		s.setRoll(roll);
		
		this.getData();
		}
	}
	
	public void getData() {
		System.out.println();
		System.out.println();
		System.out.println("Roll no : "+s.getRoll());
		System.out.println("Name : "+s.getName());
		System.out.println("Mobile no : "+s.getMob());
		System.out.println("Age : "+s.getAge());
		System.out.println("Fees : "+s.getFees());
		System.out.println("Address : "+s.getAddr());
	}
}
