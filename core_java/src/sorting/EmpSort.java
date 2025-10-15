package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpSort {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(2, "umang", 2900);
		Employee e2=new Employee(5, "rushab", 3400);
		Employee e3=new Employee(3, "ansh", 1000);
		Employee e4=new Employee(1, "parag", 3000);
		Employee e5=new Employee(4, "suraj", 2100);
		
		
		List<Employee> empList=new ArrayList<Employee>();
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		
		
		
		System.out.println(empList);
//		IdSort is = new IdSort();
//		NameSort ns = new NameSort();
//		SalarySort ss= new SalarySort();
		
		
//		Comparator<Employee> is=new Comparator<Employee>() {
//			
//			public int compare(Employee e1,Employee e2) {
//				return Integer.compare(e1.getId(), e2.getId());
//			}
//		};
//		
//		Comparator<Employee> ns=new Comparator<Employee>() {
//			
//			public int compare(Employee e1,Employee e2) {
//				return e1.getName().compareTo(e2.getName());
//			}
//		};
//		
//		Comparator<Employee> ss=new Comparator<Employee>() {
//			
//			public int compare(Employee e1,Employee e2) {
//				return Float.compare(e1.getSalary(), e2.getSalary());
//			}
//		};
		
		Comparator<Employee> is=(o1,o2)->{
			return Integer.compare(o1.getId(), o2.getId());
		};
		
		
		Collections.sort(empList,is);
		
		
		System.out.println(empList);
		
	}

}
