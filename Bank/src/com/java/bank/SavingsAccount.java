package com.java.bank;

public class SavingsAccount extends BankAccount {
	/**
	 * Rate of interest for the Savings Account
	 */
	private double interestRate;  
	/**
	 * Constructor 
	 */
	public SavingsAccount() {
		super();
	}
	/**
	 * COnstructor with one parameter
	 * @param rate
	 */
	public SavingsAccount(double rate) {
	    // Because no call to super is made in the first line, the default
	    // constructor for BankAccount is automatically called here.

	    this.interestRate = rate;
	 }
	/**
	 * @param interestRate
	 * @param balance
	 */
	public SavingsAccount(double interestRate, double balance) {
		super();
		this.interestRate = interestRate;
		super.setBalance(balance);
	}
	/**
	 * Adds the interest in the account for the given period
	 */
	public void addPeriodicInterest() {
		double interest = super.getBalance() * interestRate / 100;
		super.deposit(interest);
	}

	@Override
	/**
	 * Withdraws the amount from the account
	 */
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount>super.getBalance()) {
			
		}else {
			super.withdraw(amount);
		}
	}
	
}
