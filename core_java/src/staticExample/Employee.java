package staticExample;

public class Employee {

	int id;
	String name;
	int salary;
	static final String cmp="meta";
	
	public Employee(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void p() {
		System.out.println(cmp);
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(101,"umang",12000);
		Employee e2=new Employee(102,"ansh",80000);
		
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		System.out.println(Employee.cmp);
		
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.salary);
		System.out.println(Employee.cmp);
		
		e1.p();
	}
}
