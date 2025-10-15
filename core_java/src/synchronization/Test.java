package synchronization;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("main start..");
		Hello h=new Hello();
		Demo t1=new Demo("java", h);
		Demo t2=new Demo("python",h);
		
		t1.start();
		t2.start();
		
		System.out.println("main ended....");
	}

}
