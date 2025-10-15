package constructor;


public class Course {
	
	int id;
	String name;
	float fees;
	String duration;
	
	public Course(int id,String name,String duration,float fees) {
		this.id=id;
		this.name=name;
		this.duration=duration;
		this.fees=fees;
	}
	

}
