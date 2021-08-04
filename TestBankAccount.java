package com.Santana.bankAccount;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount alex = new BankAccount();
		BankAccount greg = new BankAccount();
		alex.getCheckingBalance();
		BankAccount.seeTotalAccounts();
		alex.depositChecking(1000);
		greg.depositSaving(5000);
		BankAccount.seeTotalMoney();
		alex.withdrawChecking(600);
		alex.getCheckingBalance();
		BankAccount.seeTotalMoney();
		alex.withdrawChecking(1000);
		alex.getCheckingBalance();
		alex.getAccountNumber();
	}

}
