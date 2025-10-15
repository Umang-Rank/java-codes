package project;

import java.util.Scanner;

public class UserManagement extends Login {
	
	Scanner sc= new Scanner(System.in);
	
	
	
	
	
	public static void showMainMenu() {
        System.out.println("\n--- VaultAccess Manager ---");
        System.out.println("1. Login");
        System.out.println("2. Signup");
        System.out.println("3. Exit");
    }
	
	public static void showUserMenu() {
		System.out.println("--- Welcome Back ---");
		System.out.println("1. Display Information");
		System.out.println("2. Change Password");
		System.out.println("3. Delete Account");
		System.out.println("4. Logout");
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Login currentUser= new Login();
		boolean flag=true;
		
		
		while(flag) {
			
			if(currentUser.getLusername()==null ) {
				
				showMainMenu();
				System.out.println("enter your choice : ");
				int ch=sc.nextInt();
				
				switch(ch) {
				case 1 : currentUser.login();
				break;
				
				case 2 : currentUser.registration();
				break;
				
				case 3 : flag=false;
				System.out.println("Exiting...");
				break;
				
				default : System.out.println("Enter valid choice..");
				}
			}else {
				showUserMenu();
				System.out.println("enter your choice : ");
				int ch=sc.nextInt();
				
				switch(ch) {
				case 1 : currentUser.displayInformation();
				break;
				
				case 2 : currentUser.changePassword();
				break;
				
				case 3 : currentUser.deletAccount();
				System.out.println("Account Deleted Successfully\nLogouted");
				break;
				
				case 4 : currentUser.logout();
				flag=false;
				break;
				
				default : System.out.println("enter valid choice");
				
				}
			}
		}
		
	}
	
	

}
