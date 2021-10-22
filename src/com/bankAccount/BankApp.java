package com.bankAccount;

public class BankApp {

	public static void main(String[] args) {
		
		System.out.println("_________________________Creating BankAccount: Person1_________________________");
		
		BankAccount Person1 = new BankAccount( );
		
		Person1.deposit( 1000, "savings" );
		Person1.deposit( 1000, "checking" );
		
		Person1.printAccounts();
		Person1.getChecking();
		Person1.getSavings();
		BankAccount.totalAmountStored();
		System.out.println( "Total accounts: " + BankAccount.howManyAccounts() );
		
		System.out.println("_______________________________Actions: Person1________________________________");
		
		Person1.withdraw(300, "savings");
		Person1.printAccounts();
		Person1.withdraw(20000, "savings");
		BankAccount.totalAmountStored();
		Person1.withdraw(500, "checking");
		Person1.printAccounts();
		Person1.withdraw(25000, "checking");
		BankAccount.totalAmountStored();
		
		System.out.println("_________________________Summary: Person1 BankAccounts_________________________");
		
		Person1.printAccounts();
		Person1.getChecking();
		Person1.getSavings();
		BankAccount.totalAmountStored();
		System.out.println( "Total accounts: " + BankAccount.howManyAccounts() );

		System.out.println("_________________________Creating BankAccount: Person2_________________________");
		
		BankAccount Person2 = new BankAccount( );
		Person2.deposit( 80000, "savings" );
		Person2.deposit( 75000, "checking" );
		
		Person2.printAccounts();
		Person2.getChecking();
		Person2.getSavings();
		BankAccount.totalAmountStored();
		System.out.println( "Total accounts: " + BankAccount.howManyAccounts() );
		
		System.out.println("_______________________________Actions: Person2________________________________");
		
		Person2.withdraw(1100, "savings");
		Person2.printAccounts();
		Person2.withdraw(90000, "savings");
		BankAccount.totalAmountStored();
		Person2.withdraw(18000, "checking");
		Person2.printAccounts();
		Person2.withdraw(95000, "checking");
		BankAccount.totalAmountStored();
		
		System.out.println("_________________________Summary: Person2 BankAccounts_________________________");
		
		Person2.printAccounts();
		Person2.getChecking();
		Person2.getSavings();
		BankAccount.totalAmountStored();
		System.out.println( "Total accounts: " + BankAccount.howManyAccounts() );
		
	}
	
	
}
