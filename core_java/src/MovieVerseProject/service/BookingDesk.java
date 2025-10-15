package MovieVerseProject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import MovieVerseProject.model.*;

public class BookingDesk implements BookMyShow {
	
	Scanner sc= new Scanner(System.in);
	User u1= new User();
	
	public User signup() {
		
		System.out.println("===============Signup Page================");
		System.out.println("Enter Username : ");
		u1.setUsername(sc.next());
		System.out.println("Enter Password : ");
		u1.setPassword(sc.next());
		System.out.println("Enter Mobile Number : ");
		u1.setMobile(sc.nextLong());
		System.out.println("Enter Email : ");
		u1.setEmail(sc.next());
		
		return  u1;
		
					
	}
	public boolean login(User u) {
		
		System.out.println("===============Login Page================");
		System.out.println("Enter Username : ");
		String logUsername=sc.next()+sc.nextLine();
		System.out.println("Enter Password : ");
		String logPassword = sc.next()+sc.nextLine();
		
		try{
			if(u.getUsername().equals(logUsername) && u.getPassword().equals(logPassword)) {
				System.out.println("Login successfully");
				u.setLogUser(u.getUsername());
				u.setLogPass(u.getPassword());
			return true;
		}else {
			System.out.println("Incorrect Password or Username!!");
		}
		}catch(NullPointerException e) {
			System.out.println("Signup first and then login");
		}
		
		return false;
		
	}
	
	public Movie bookTicket(List<Movie> mv) {
		boolean flag=true;
		System.out.println("================Available Movies================");
		for(Movie m : mv) {
			System.out.println(m);
		}
		
		System.out.println("Enter movie id to book ticket : ");
		int ch=sc.nextInt();
		
		for(Movie m: mv) {
			if(m.getId()==ch) {
				System.out.println("Booked : "+m.getName());
				flag=false;
				return m;
			}
		}
		if(flag) {
			System.out.println("movie not available, please select from list only!!!!");
		}
		
		return null;
	}
	
	public List<Snack> addMeal(List<Snack> sn){
		
		boolean flag=true;
		List<Snack> l=new ArrayList<Snack>();
		String c="y";
		
		while(c.equals("y")) {
		System.out.println("================Available Snacks================");
		for(Snack s: sn) {
			System.out.println(s);
		}
		
		System.out.println("Enter snack id to add meal : ");
		int ch=sc.nextInt();
		
		for(Snack s: sn) {
			if(s.getId()==ch) {
				System.out.println("Added : "+s.getName());
				flag=false;
				l.add(s);
			}
		}
		if(flag) {
			System.out.println("Snack not available, please select from list only!!!");
		}
		flag=true;
		System.out.println();
		System.out.println("Do you want to add more meal (y for yes, n for no)");
		c=sc.next();
		}
		
		return l;
	}
	
	@Override
	public void printDetails(Map<Integer, List<?>> m) {
	    double total = 0;
	    System.out.println("\n============== Final Bill ==============");

	    for (Map.Entry<Integer, List<?>> entry : m.entrySet()) {
	        int key = entry.getKey();
	        List<?> list = entry.getValue();

	        if (key == 1) { // Movies
	            System.out.println("\nSelected Movies:");
	            for (Object obj : list) {
	                Movie mv = (Movie) obj;
	                System.out.println("Movie: " + mv.getName() + ", Price: ₹" + mv.getPrice());
	                total += mv.getPrice();
	            }
	        } else if (key == 2) { // Snacks
	            System.out.println("\nSelected Snacks:");
	            for (Object obj : list) {
	                Snack sn = (Snack) obj;
	                System.out.println("Snack: " + sn.getName() + ", Price: ₹" + sn.getPrice());
	                total += sn.getPrice();
	            }
	        }
	    }

	    System.out.println("\n----------------------------------------");
	    System.out.println("Total Amount: ₹" + total);
	    System.out.println("Thank you for booking with MovieVerse!");
	    System.out.println("========================================");
	}

	
	
	public void logout() {
		System.out.println("logout successfully");
	}
	
	

}
