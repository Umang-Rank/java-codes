package constructor;

public class Emp {
	int id;
	String name;
	String dept;
	float salary;
	static String com_name = "adhyayan";
	
	public Emp(int id,String name,String dept,float salary) {
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	
	public void print_details() {
		System.out.println(id +"\n"+name+"\n"+dept+"\n"+com_name+"\n");
	}
	
	public void sal_cal(int i) {
     float f1=(salary*i)/100;	
     salary = salary + f1;
     
	}
	
	public static void main(String[] args) {
		Emp e1 = new Emp(1,"umang","marketing",10000);
		Emp e2 = new Emp(2,"ansh","medical",12000);
		
		e1.print_details();
		e2.print_details();
		
		
	}

}
