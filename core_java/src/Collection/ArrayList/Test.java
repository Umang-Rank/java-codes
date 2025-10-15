package Collection.ArrayList;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		
		List<Student> l=new ArrayList<Student>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of students");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			Student s=new Student();
			System.out.println("enter info of student "+(i+1));
			System.out.println("enter student id : ");
			s.setId(sc.nextInt());
			System.out.println("enter student name : ");
			s.setName(sc.next());
			
			l.add(s);
		}
		
		for(int i=0;i<l.size();i++) {
			System.out.println("student info : "+(i+1));
			System.out.println(l.get(i).toString());
		}
		
		
	}
	
	

}
