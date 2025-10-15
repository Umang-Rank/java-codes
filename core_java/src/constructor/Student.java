package constructor;

public class Student {
	int roll;
	String name;
	
	public Student(int roll,String name) {
		this.roll=roll;
		this.name=name;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(101,"umang");
		System.out.println(s1.roll +"\n"+s1.name);
		Student s2 = new Student(102,"rushab");
		System.out.println(s2.roll+"\n"+s2.name);
		
	}
}
