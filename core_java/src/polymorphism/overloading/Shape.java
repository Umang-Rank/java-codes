package polymorphism.overloading;

import java.util.Scanner;

public class Shape {
	
	void area(float pi,int r) {
		System.err.println("area of circle is "+(pi*r*r));
	}
	
	void area(int a,int b) {
		System.out.println("area of rectangle is "+(a*b));
	}
	
	void area(int a) {
		System.out.println("area of square is "+(a*a));
	}
	
	public static void main(String[] args) {
		Shape s=new Shape();
		Scanner sc =new Scanner(System.in);
		
		System.out.print("enter your shape");
		String ch=sc.nextLine();
		
		if(ch.equals("circle")) {
			System.out.println("enter redius of circle ");
			int a=sc.nextInt();
			s.area(3.14f, a);
		}else if(ch.equals("rectangle")) {
			System.out.println("enter two side of rectangle");
			int a=sc.nextInt();
			int b= sc.nextInt();
			s.area(a, b);
		}else {
			System.out.println("enter side of square ");
			int a=sc.nextInt();
			s.area(a);
		}
		sc.close();
	}

}
