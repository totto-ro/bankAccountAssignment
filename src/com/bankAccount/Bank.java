package com.bankAccount;

public class Bank {
	
	private static int number0fAccounts = 0;
	//private static double totalMoney = 0

	private String accountNum;
	private double checking;
	private double savings;
	
	//Constructor
	public Bank() {
		number0fAccounts++;
		
		
		
	}
	
	public static int howManyAccounts() {
		 return number0fAccounts;
	 }
	
	//BankAccount.totalHoldings += amount;
	
	
	
}
