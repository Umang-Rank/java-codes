package narrowing;

public class A {
	
	public void m1(Object obj) {
		System.out.println("m1-----object");
	}
	
	public void m1(String str) {
		System.out.println("m1-----string");
	}
	
	public void m1(A a) {
		System.out.println("m1----A");
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.m1((String)null);
	}

}
