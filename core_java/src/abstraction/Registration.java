package abstraction;

public class Registration extends Vehical {
	
	public void registerVehical() {
		System.out.println("registration successfull.....");
	}
	
	public void displayVehical() {
		System.out.println("your vehical is activa...");
	}
	
	public static void main(String[] args) {
		Vehical activa=new Registration();
		activa.registerVehical();
		activa.displayVehical();
	}

}
