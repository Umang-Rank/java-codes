package abstraction;

public class Truck extends Vehical2{
	
	public void start() {
		System.out.println("truck is started...");
	}
	
	public void stop() {
		System.out.println("truck is stoped....");
	}
	
	public static void main(String[] args) {
		Vehical2 car=new Car();
		Vehical2 truck=new Truck();
		
		car.start();
		car.stop();
		
		System.out.println();
		
		truck.start();
		truck.stop();
	}

}
