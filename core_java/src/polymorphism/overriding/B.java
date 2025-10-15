package polymorphism.overriding;

public class B extends A{
	@Override
	public void m1() {
		System.out.println("m1 of B");
	}
	
	@Override
	public int m2(int j) {
		System.out.println("m2 of B"+j);
		return j;
	}
	
	@Override
	public B m3() {
		System.out.println("m3 of B");
		return new B();
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2(4);
		b.m3();
	}

}
