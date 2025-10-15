package scannerExample;

import java.util.Scanner;

public class Details {
	int id;
	String nm;
	float perc;
	
	public Details(int id,String nm,float perc) {
		this.id=id;
		this.nm=nm;
		this.perc=perc;
	}
	
	public static void print(Details d) {
		System.out.println("---Student Details---");
		System.out.println(d.id+"\t"+d.nm+"\t"+d.perc);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your student id :");
		int id=sc.nextInt();
		System.out.println("enter your name : ");
		String nm=sc.next()+sc.nextLine();
		System.out.println("enter your percentage :");
		float perc=sc.nextFloat();
		
		Details d=new Details(id, nm, perc);
		print(d);
		
		sc.close();
		
		
	}
	
	
}
