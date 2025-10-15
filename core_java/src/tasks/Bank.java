package tasks;

import java.util.Scanner;

public class Bank {
	long accountNumber;
	String accountHolderName;
	int age;
	String panNumber;
	long adharNumber;
	double balance;
	
	public void createAcount(Scanner sc) {
		
		System.out.println("please provide folowing details ");
		System.out.print("enter your name :");
		sc.nextLine();
		accountHolderName=sc.nextLine();
		System.out.print("provide your sutaible account number :");
		accountNumber=sc.nextLong();
		System.out.print("enter your age :");
		age=sc.nextInt();
		System.out.print("provide your aadhar number :");
		adharNumber=sc.nextLong();
		System.out.print("provide your PAN number :");
		panNumber=sc.next();
		System.out.print("enter initial money :");
		balance=sc.nextDouble();
		System.out.println("Account Created Successfully!!!");
		
	}
	
	public void displayDetails() {
		System.out.println("----Account Details----");
		System.out.println("Account Number :"+accountNumber+"\nAccount Holder Name :"+accountHolderName+"\nAge :"+age+"\nAadhar Number :"+adharNumber+"\nPAN Number :"+panNumber);
	}
	
	public void depositMoney(Scanner sc) {
		
		System.out.println("How much you want to deposit :");
		double a=sc.nextDouble();
		balance=balance+a;
		System.out.println("total balance after deposit :"+balance);
		
	}
	
	public void withdrawMoney(Scanner sc) {
		
		System.out.println("How much you want to withdraw :");
		double a=sc.nextDouble();
		balance=balance-a;
		System.out.println("total balance after withdraw :"+balance);
		
	}
	
	public void balanceCheck() {
		System.out.println("Your current balance :"+balance);
	}
	
	public static void main(String[] args) {
		Bank b = new Bank();
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("\n\nEnter your choice :");
			System.out.println("1) account creation");
			System.out.println("2) display details");
			System.out.println("3) deposit money");
			System.out.println("4) withdraw money");
			System.out.println("5) check balance");
			System.out.println("6) Exit");
			System.out.print("Choice: ");
			
			ch = sc.nextInt();
			
			switch (ch) {
			case 1: b.createAcount(sc);
			break;
			case 2: b.displayDetails();
			break;
			case 3: b.depositMoney(sc);
			break;
			case 4: b.withdrawMoney(sc);
			break;
			case 5 : b.balanceCheck();
			break;
			default:
				System.out.println("enter valid choice!!");
			}
		}while(ch!=6);
		
	}
}


//package tasks;
//
//import java.util.Scanner;
//
//public class Bank {
//	long accountNumber;
//	String accountHolderName;
//	int age;
//	String panNumber;
//	long adharNumber;
//	double balance;
//
//	public void createAcount(Scanner sc) {
//		System.out.println("Please provide the following details ");
//		System.out.print("Enter your name: ");
//		sc.nextLine(); // Consume leftover newline
//		accountHolderName = sc.nextLine();
//		System.out.print("Provide your suitable account number: ");
//		accountNumber = sc.nextLong();
//		System.out.print("Enter your age: ");
//		age = sc.nextInt();
//		System.out.print("Provide your Aadhar number: ");
//		adharNumber = sc.nextLong();
//		System.out.print("Provide your PAN number: ");
//		panNumber = sc.next();
//		System.out.print("Enter initial money: ");
//		balance = sc.nextDouble();
//		System.out.println("Account Created Successfully!!!");
//	}
//
//	public void displayDetails() {
//		System.out.println("----Account Details----");
//		System.out.println("Account Number: " + accountNumber);
//		System.out.println("Account Holder Name: " + accountHolderName);
//		System.out.println("Age: " + age);
//		System.out.println("Aadhar Number: " + adharNumber);
//		System.out.println("PAN Number: " + panNumber);
//	}
//
//	public void depositMoney(Scanner sc) {
//		System.out.print("How much do you want to deposit: ");
//		double a = sc.nextDouble();
//		balance += a;
//		System.out.println("Total balance after deposit: " + balance);
//	}
//
//	public void withdrawMoney(Scanner sc) {
//		System.out.print("How much do you want to withdraw: ");
//		double a = sc.nextDouble();
//		if (a <= balance) {
//			balance -= a;
//			System.out.println("Total balance after withdrawal: " + balance);
//		} else {
//			System.out.println("Insufficient balance!");
//		}
//	}
//
//	public void balanceCheck() {
//		System.out.println("Your current balance: " + balance);
//	}
//
//	public static void main(String[] args) {
//		Bank b = new Bank();
//		Scanner sc = new Scanner(System.in);
//		int ch;
//
//		do {
//			System.out.println("\nEnter your choice:");
//			System.out.println("1) Account Creation");
//			System.out.println("2) Display Details");
//			System.out.println("3) Deposit Money");
//			System.out.println("4) Withdraw Money");
//			System.out.println("5) Check Balance");
//			System.out.println("6) Exit");
//			System.out.print("Choice: ");
//
//			ch = sc.nextInt();
//
//			switch (ch) {
//				case 1:
//					b.createAcount(sc);
//					break;
//				case 2:
//					b.displayDetails();
//					break;
//				case 3:
//					b.depositMoney(sc);
//					break;
//				case 4:
//					b.withdrawMoney(sc);
//					break;
//				case 5:
//					b.balanceCheck();
//					break;
//				case 6:
//					System.out.println("Exiting...");
//					break;
//				default:
//					System.out.println("Enter valid choice!!");
//			}
//		} while (ch != 6);
//
//		sc.close(); // Close scanner at the end only
//	}
//}

