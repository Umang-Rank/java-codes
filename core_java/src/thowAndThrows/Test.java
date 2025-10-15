package thowAndThrows;

public class Test {
	
	public static void m1()  {
		System.out.println("m1 started");
		int i=10/10;
		int arr[]=null;
		System.out.println(arr.length);
		System.out.println(i);
		System.out.println("m1 ended");
	}

	public static void main(String[] args) {
		
		System.out.println("main started");
		try{
			m1();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("main ended");
		}
		
	}
}
