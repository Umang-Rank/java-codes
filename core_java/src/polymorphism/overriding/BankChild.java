package polymorphism.overriding;

public class BankChild extends BankParent{

	public void accountCreate() {
		System.out.println("account created successfully");
	}
	
	public void deposit() {
		System.out.println("depostied successfully");
	}
	
	public void credit() {
		System.out.println("credited successfully");
	}
	
	public static void main(String[] args) {
		BankChild sbi=new BankChild();
		sbi.accountCreate();
		sbi.deposit();
		sbi.credit();
	}
}
