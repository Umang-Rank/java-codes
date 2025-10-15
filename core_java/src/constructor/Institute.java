package constructor;

public class Institute {
	
	public void courseDetails(Course c) {
		System.out.println("Course Details : ");
		System.out.println(c.id+"\t"+c.name+"\t"+c.duration+"\t"+c.fees);
	}
	public static void main(String[] args) {
		Course c1 = new Course(182,"full stack java","5 months",23000);
		Institute i = new Institute();
		i.courseDetails(c1);
	}
}
