package MovieVerseProject.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import MovieVerseProject.model.Movie;
import MovieVerseProject.model.Snack;
import MovieVerseProject.model.User;
import MovieVerseProject.service.BookingDesk;

public class Test {
	
	public static void showMainMenu() {
		System.out.println("\n===============User Menu================");
		System.out.println("1) Signup");
		System.out.println("2) Login");
		System.out.println("3) Exit");
	}
	
	public static void showUserMenu() {
		System.out.println("\n===============BookMyShow================");
		System.out.println("1) Book Movie Ticket");
		System.out.println("2) Add Meal");
		System.out.println("3) Print Details");
		System.out.println("4) Logout");
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		User u=new User();
		boolean flag=true;
		int ch;
		BookingDesk bk= new BookingDesk();
		List<Movie> mv=new ArrayList<Movie>();
		List<Snack> sn= new ArrayList<Snack>();
		
		Movie m1= new Movie(101,"Dangal",199,8.8f,"Sports Drama");
		Movie m2= new Movie(102,"Sholey",149,7.3f,"Action");
		Movie m3= new Movie(103,"3 Idiots",239,9.0f,"Comedy");
		Movie m4= new Movie(104,"Andhadhun",176,7.9f,"Thriller");
		Movie m5= new Movie(105,"Barfi",99,7.4f,"Romentic Comedy");
		Movie m6= new Movie(106,"Swades",139,8.3f,"Social Issues");
		
		mv.add(m1);
		mv.add(m2);
		mv.add(m3);
		mv.add(m4);
		mv.add(m5);
		mv.add(m6);
		
		Snack s1= new Snack(201, "Samosa", "A fried pastry with a potatoes and peas", 80);
		Snack s2= new Snack(202, "Aloo Tikki", "A spiced potatp patty with varity of chatnies", 120);
		Snack s3= new Snack(203, "Kachori", "A fried pastry filled with lenties or peas", 80);
		Snack s4=new Snack(204, "Pizza", "A bread based topped with tomato sause,cheese,and various toppings",249 );
		Snack s5= new Snack(205, "Popcorn", "A snack made from dried corn kernels", 109);
		Snack s6 = new Snack(206, "Nachos", "A tortilla chips topped with meltrd cheese and various toppings", 167);
		
		sn.add(s1);
		sn.add(s2);
		sn.add(s3);
		sn.add(s4);
		sn.add(s5);
		sn.add(s6);
		List<Movie> ml= new ArrayList<Movie>();
		List<Snack> sl=new ArrayList<Snack>();
		Map<Integer,List<?>> map=new HashMap<>();
		
		
		while(flag) {
			if(u.getLogUser()==null) {
				Test.showMainMenu();
				System.out.println("Enter your choice :");
				ch=sc.nextInt();
				
				switch(ch) {
				case 1 :  if(u.getUsername()==null) {
					u=bk.signup();
				}else {
					System.out.println("Already signin!!!");
				}
					
				break;
				
				case 2 : bk.login(u);
				break;
				
				case 3 : flag=false;
				System.out.println("Exiting.....");
				break;
				
				default : System.out.println("Enter valid choice!!!");
				}
			}else {
				Test.showUserMenu();
				
				System.out.println("Enter your choice : ");
				ch=sc.nextInt();
				
				switch(ch) {
				case 1 : Movie m=bk.bookTicket(mv);
						ml.add(m);
				break;
				
				case 2 : sl=bk.addMeal(sn);
				break;
				
				case 3 : System.out.println("Are you sure you don't want to add anything else? (y for yes, n for no): ");
					    String c = sc.next();
					    if (c.equals("y")) {
					        map.put(1, ml);  // 1 = movies
					        map.put(2, sl);  // 2 = snacks
					        bk.printDetails(map);
					    } else {
					        System.out.println("Continue adding items...");
					    }
				break;
				
				case 4 : bk.logout();
						flag=false;
				break;
				
				default : System.out.println("enter valid choice!!!");
				}
			}
		}
		
		
	}

}
