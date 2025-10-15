package abstraction;

public class CalculatorImp extends Calculator{
	
	public void sum() {
		System.out.println("sum is too be performed");
	}
	
	public void sub() {
		System.out.println("sub is too be performed");
	}

	public void mult() {
		System.out.println("mult is too be performed");
	}
	
	public void div() {
		System.out.println("div is too be performed");
	}
	
	public static void main(String[] args) {
		Calculator c=new CalculatorImp();
		c.sum();
		c.sub();
		c.mult();
		c.div();
	}
}
