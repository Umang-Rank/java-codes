package polymorphism.overriding;

public class College  {
	
	int roll;
	String name;
	
	public College(int roll,String name) {
		this.roll=roll;
		this.name=name;
	}
	
	public String toString() {
		return "roll number : "+roll+" name : "+name;
		
	}

	
	public static void main(String[] args) {
		College mit=new College(101,"umang");
		System.out.println(mit);
		
	}
}
