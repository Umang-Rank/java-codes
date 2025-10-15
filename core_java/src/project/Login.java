package project;

import java.util.Scanner;

public class Login extends Registration{
	
	private String lusername;
	private String lpassword;
	
	public void setLusername(String lusername) {
		this.lusername=lusername;
	}
	
	public void setLpassword(String lpassword) {
		this.lpassword=lpassword;
	}
	
	public String getLusername() {
		return lusername;
	}
	
	public String getLpassword() {
		return lpassword;
	}
	Scanner sc = new Scanner(System.in);
	
	public void login() {
		
		try {
			
			System.out.println("enter your username : ");
			String lu=sc.next();
			System.out.println("enter your password : ");
			String lp=sc.next();
			
			if(getRegUsername().equals(lu) && getRegPassword().equals(lp)) {
				System.out.println("Successfull Login...");
				setLusername(lu);
				setLpassword(lp);
			}else {
				System.out.println("incorrect username or password");
			}
		
				
		} catch (Exception e) {
			System.out.println("Signup First and then Login");
			
		}
		
	}
	
	public void displayInformation() {
		System.out.println("----Account Information----");
		System.out.println("Username : "+getLusername());
		System.out.println("Password : "+getLpassword());
		System.out.println("Phone no. : "+getMobile());
		System.out.println("Email : "+ getEmail());
		System.out.println();
		
	}
	
	public void changePassword() {
		System.out.println("enter your old password : ");
		String oldPassword=sc.next();
		
		if(oldPassword.equals(getLpassword())) {
			System.out.println("enter your new password : ");
			String newPassword=sc.next();
			setLpassword(newPassword);
			setRegPassword(newPassword);
		}else{
			System.out.println("Incorrect Password....");
		}
	}
	
	public void logout() {
		System.out.println("Logout Successfully..");
	}
	
	public void deletAccount() {
		setRegUsername(null);
		setRegPassword(null);
		setEmail(null);
		setMobile(0);
		setLusername(null);
		setLpassword(null);
	}

}
