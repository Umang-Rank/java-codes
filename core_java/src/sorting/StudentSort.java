package sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentSort {
	
	public static void main(String[] args) {
		Student[] arr=new Student[10];
		
		List<Student> studentList = new ArrayList<Student>();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of Students : ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			arr[i] = new Student();
			System.out.println("Enter details of student "+(i+1));
			System.out.print("enter id : ");
			arr[i].setId(sc.nextInt());
			System.out.print("Enter name : ");
			arr[i].setName(sc.next());
			System.out.print("Enter mobile number : ");
			arr[i].setMobile(sc.nextLong());
			System.out.print("Enter percentage : ");
			arr[i].setPercentage(sc.nextFloat());
			System.out.println();
			
			studentList.add(arr[i]);
		}
		
		Comparator<Student> idSort=new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o1.getId(), o2.getId());
			}
		};
		
		Comparator<Student> nameSort=(o1,o2)->{
			return o1.getName().compareTo(o2.getName());
		};
		
		Comparator<Student> mobileSort=(o1,o2)->{
			return Long.compare(o2.getMobile(), o1.getMobile());
		};
		
		Comparator<Student> percentageSort = new Comparator<Student>(){
			
			public int compare(Student o1,Student o2) {
				return Float.compare(o1.getPercentage(), o2.getPercentage());
			}
		};
		
		boolean flag=true;
		
		while(flag) {
		System.out.println("----How you want to sort----\n1) Id\n2) Name\n3) Mobile Number\n4) Percentage\n5) Exit\nEnter your choice ");
		int ch=sc.nextInt();
		
		switch (ch){
		case 1: Collections.sort(studentList,idSort);
				System.out.println(studentList);
				break;
				
		case 2: Collections.sort(studentList,nameSort);
				System.out.println(studentList);
				break;
		case 3: Collections.sort(studentList,mobileSort);
				System.out.println(studentList);
				break;
		case 4: Collections.sort(studentList,percentageSort);
				System.out.println(studentList);
				break;
		case 5: flag=false;
				System.out.println("Exited!!!!");
				break;
		default : System.out.println("Enter valid choice!!!!");
		
		}
		}
	}

}
