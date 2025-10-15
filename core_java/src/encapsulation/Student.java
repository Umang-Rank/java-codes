package encapsulation;

public class Student {
	
	private int roll;
	private String name;
	private float fees;
	private int age;
	private long mob;
	private String addr;

	
	public void setRoll(int roll) {
		this.roll=roll;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setFees(float fees) {
		this.fees=fees;
	}
	
	public float getFees() {
		return fees;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setMob(long mob) {
		this.mob=mob;
	}
	
	public long getMob() {
		return mob;
	}
	
	public void setAddr(String addr) {
		this.addr=addr;
	}
	
	public String getAddr() {
		return addr;
	}
}
