package thisAndsuper;

public class P {
	
	public P() {
		System.out.println("not parameterized constructor of parent");
		
	}
	
	public P(int i) {
		System.out.println("constructor --- int of parent ");
	}
	
	public P(String str) {
		System.out.println("constructor --- string of parent");
	}
	
	public P(int i,String str) {
		System.out.println("constructor --- int --- string of parent");
	}

}
