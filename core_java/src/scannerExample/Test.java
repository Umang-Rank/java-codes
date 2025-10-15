package scannerExample;
import java.util.Scanner;
public class Test {
	int id;
	String name;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test t = new Test();
		System.out.println("enter your id :");
		t.id=sc.nextInt();
		System.out.println("enter your name :");
		t.name=sc.next();
		
		System.out.println("id : "+t.id);
		System.out.println("name :"+t.name);
		sc.close();
	}
}
