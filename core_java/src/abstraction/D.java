package abstraction;

public class D extends C{
	
	public D() {
		System.out.println("constructor of D");
	}
	
	public static void main(String[] args) {
	
		C obj=new D();
		
	}

}
