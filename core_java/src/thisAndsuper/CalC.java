package thisAndsuper;

public class CalC extends CalP{
	
	public void addition(int a, int b) {
		super.add();
		System.out.println((a+b));
		this.subtraction(a, b);
	}
	
	public void subtraction(int a,int b) {
		super.sub();
		System.out.println((a-b));
		this.multiplication(a, b);
	}
	
	public void multiplication(int a,int b) {
		super.mult();
		System.out.println((a*b));
		this.division(a, b);
	}
	
	public void division(int a,int b) {
		super.div();
		System.out.println((a/b));
	}
	
	public static void main(String[] args) {
		CalC cal=new CalC();
		cal.addition(10, 4);
		
	}

}
