package abstraction;

public class HomeLoan extends Loan{
	
	public void setIntrestRate() {
		System.out.println("your home loan intrest is 8%");
	}
	
	public static void main(String[] args) {
		Loan l=new HomeLoan();
		l.setIntrestRate();
	}

}
