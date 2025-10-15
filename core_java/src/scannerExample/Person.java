package scannerExample;
import java.util.Scanner;
public class Person {
	String name;
	String addr;
	long num;
	
	public Person(String name,String addr,long num) {
		this.name=name;
		this.addr=addr;
		this.num=num;
}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name :");
		String name=sc.nextLine();
		System.out.println("enter your mobile number :");
		long num=sc.nextLong();
		System.out.println("enter your address :");
		String addr=sc.next()+sc.nextLine();
		
		Person p=new Person(name, addr, num);
		System.out.println("name : "+p.name);
		System.out.println("number : "+p.num);
		System.out.println("address : "+p.addr);
		
		sc.close();
	}

}
