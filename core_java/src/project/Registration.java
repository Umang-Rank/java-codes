package project;

import java.util.Scanner;

public class Registration {
	
	private String regUsername;
	private String regPassword;
	private long mobile;
	private String email;
	Scanner sc = new Scanner(System.in);
	
	public void setRegUsername(String regUsername) {
		this.regUsername=regUsername;
	}
	
	public void setRegPassword(String regPassword) {
		this.regPassword=regPassword;
	}
	
	public void setMobile(long mobile) {
		this.mobile=mobile;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getRegUsername() {
		return regUsername;
	}
	
	public String getRegPassword() {
		return regPassword;
	}
	
	public long getMobile() {
		return mobile;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void registration() {
		
		try {
			
			if(getRegUsername()==null) {
			
			System.out.println("enter your username : ");
			setRegUsername(sc.next());
			System.out.println("enter your password : ");
			setRegPassword(sc.next());
			System.out.println("enter your mobile no. : ");
			setMobile(sc.nextLong());
			System.out.println("enter your email : ");
			setEmail(sc.next());
			System.out.println("Account Created Successfully. You can Login Now..");
			}else{
				System.out.println("user register alredy. you have to login now or exit");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
