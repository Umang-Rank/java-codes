package abstraction;

public class EducationLoan extends Loan{
	
	public void setIntrestRate() {
		System.out.println("education loan intrest is 12%");
	}
	
	public static void main(String[] args) {
		Loan edu=new EducationLoan();
		edu.setIntrestRate();
	}

}
