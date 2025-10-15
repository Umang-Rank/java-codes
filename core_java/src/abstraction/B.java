package abstraction;

public class B extends A{

	@Override
	public void m2() {
		System.out.println("m2 of B");
	}
	
	public static void main(String[] args) {
		A obj=new B();
		obj.m1();
		obj.m2();
		
	}
}
