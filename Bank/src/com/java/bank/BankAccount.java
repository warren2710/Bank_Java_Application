package com.java.bank;

public class BankAccount {
	/**
	 * Balance amount in the account
	 */
	private double balance;
	/**
	 * BankAccount Constructor
	 */
	public BankAccount() {
		super();
	}
	/**
	 * Constructor with one parameter
	 * @param balance
	 */
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	/**
	 * Prints the string value
	 */
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
	/**
	 * Deposits the given amount in the account
	 * @param amount
	 */
	public void deposit(double amount) {
		this.balance += amount;
	}
	/**
	 * Withdraws the given amount from the account
	 * @param amount
	 */
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	/**
	 * Transfers the given amount in the given account
	 * @param other
	 * @param amount
	 */
	public void transfer(BankAccount other, double amount) {
		withdraw(amount);
		other.deposit(amount);
	}
	
}
