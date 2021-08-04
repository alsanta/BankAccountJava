package com.Santana.bankAccount;
import java.util.Random;

public class BankAccount {
//	Member Variables
	private double checkingBalance = 0;
	private double savingBalance = 0;
	private static int totalAccounts = 0;
	private static double totalMoneyStored = 0;
	private String accountNumber;
//	Constructor
	public BankAccount() {
		totalAccounts += 1;
		accountNumber = BankAccount.createAccountNumber();
	}
//	Randomly generate a string consisting of 10 numbers
	private static String createAccountNumber() {
		Random rand = new Random();
		String number = "";
		for (int x = 0; x<10;x++) {
			number += rand.nextInt(10);
		}
		return number;
	}
//	Get the users account number
	public void getAccountNumber() {
		System.out.println(this.accountNumber);
	}
	
//	Checking the balances
	public void getCheckingBalance() {
		System.out.println(this.checkingBalance);
	}
	public void getSavingBalance() {
		System.out.println(this.savingBalance);
	}
//	Deposit methods
	public void depositChecking(int value) {
		totalMoneyStored += value;
		this.checkingBalance += value;
		System.out.println("Your Checking balance is now " + this.checkingBalance);
	}
	public void depositSaving(int value) {
		totalMoneyStored += value;
		this.savingBalance += value;
		System.out.println("Your Savings balance is now " + this.savingBalance);
	}
//	Withdraw methods with overdraw check/protection
	public void withdrawChecking(int value) {
		if(this.checkingBalance < value) {
			System.out.println("Sorry insufficient funds");
		}
		else{
			totalMoneyStored -= value;
			this.checkingBalance -= value;
			System.out.println("Your Checking balance is now " + this.checkingBalance);
		}
	}
	public void withdrawSaving(int value) {
		if(this.savingBalance < value) {
			System.out.println("Sorry insufficient funds");
		}
		else{
			totalMoneyStored -= value;
			this.savingBalance -= value;
			System.out.println("Your Savings balance is now" + this.savingBalance);
		}
	}
//	Checking the total values
	public static void seeTotalAccounts() {
		System.out.println(BankAccount.totalAccounts);
	}
	public static void seeTotalMoney() {
		System.out.println(BankAccount.totalMoneyStored);
	}
}
