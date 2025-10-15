package thisAndsuper;

public class Child extends Parent{

	int x=900;
	
	public void m1() {
		System.out.println("m1 of child...");
	}
	
	public void m2() {
		super.m1();
		this.m1();
		System.out.println(this.x);
		System.out.println(super.x);
		super.m1();
	}
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.m2();
	}
}
