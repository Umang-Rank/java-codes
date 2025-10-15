package polymorphism.overriding;

public class A {
	
	public void m1() {
		System.out.println("m1 of A");
	}
	
	public int m2(int i) {
		System.out.println("m2 of A"+i);
		return i;
	}
	
	public A m3() {
		System.out.println("m3 of A");
		return new A();
	}
	
}
