package thisAndsuper;

public class C extends P{
	
	public C() {
		super();
		System.out.println("not parameterized constructor of child");
	}
	
	public C(long l) {
		this();
		System.out.println("constructor --- long of child");
	}
	
	public C(float f) {
		super("umang");
		System.out.println("constructor --- float of child");
	}
	
	public C(int i,long l) {
		System.out.println("constructor --- int --- long of child");
	}

	public static void main(String[] args) {
		C c = new C(1.2f);
	}
}
