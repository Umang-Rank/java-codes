package ArrayList_Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		List<Student> list= new ArrayList<Student>();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter how many student you want :");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			Student s = new Student();
			
			System.out.println("enter roll number of student "+(i+1));
			s.setRoll(sc.nextInt());
			
			System.out.println("enter name of student "+(i+1));
			s.setName(sc.next()+sc.nextLine());
			
			System.out.println("enter marks of student "+(i+1));
			s.setMarks(sc.nextFloat());
			
			list.add(s);
			
		}
		
		Comparator<Student> roll_sort=(s1,s2)->{
			return Integer.compare(s2.getRoll(), s1.getRoll());
		};
		
		Comparator<Student> name_sort=(s1,s2)->{
			return s2.getName().compareTo(s1.getName());
		};
		
		Comparator<Student> marks_sort=(s1,s2)->{
			return Float.compare(s2.getMarks(), s1.getMarks());
		};
		
		System.out.println("Enter how you want to sort :\n1)roll number\n2)name\n3)marks");
		int num=sc.nextInt();
		
		if(num==1) {
			Collections.sort(list,roll_sort);
		}else if(num==2) {
			Collections.sort(list,name_sort);
		}else if(num==3) {
			Collections.sort(list,marks_sort);
		}else {
			System.out.println("enter valid choice");
		}
		
		for(Student s:list) {
			System.out.println(s);
		}
	}

}
