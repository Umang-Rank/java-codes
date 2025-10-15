package synchronization;

public class Hello {
	
	public void display(String msg) {
		
		synchronized (Hello.class) {
			System.out.println("[");
			System.out.println(msg);
			System.out.println("]");
		}
	}
	
	

}
