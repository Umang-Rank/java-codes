package polymorphism.overriding;

public class CalculatorChild extends Calculatorparent{
	
	public void add(int a,int b) {
		System.out.println("addition is : "+(a+b));
	}
	
	public void sub(int a,int b) {
		System.out.println("subtraction is : "+(a-b));
	}
	
	public void multi(int a,int b) {
		System.out.println("multiplication is : "+(a*b));
	}
	
	public void div(float a,float b) {
		System.out.println("division is : "+(a/b));
	}
	
	public static void main(String[] args) {
		CalculatorChild cal=new CalculatorChild();
		cal.add(3, 19);
		cal.sub(172, 99);
		cal.multi(19, 2);
		cal.div(123, 88);
	}
	
}

