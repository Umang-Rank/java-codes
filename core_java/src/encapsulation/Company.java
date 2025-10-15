package encapsulation;

public class Company {
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("umang");
		e1.setSalary(58000);
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
	}

}
