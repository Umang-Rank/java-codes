package thisAndsuper;

public class B extends A{
	
	public B() {
		super(10);
		System.out.println("constructor of B.....");
	}
	
	public B(int i) {
		super(200);
		System.out.println("constructor---int");
	}
	
	public static void main(String[] args) {
		B obj = new B();
		
	}

}
