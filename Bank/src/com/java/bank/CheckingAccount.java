package com.java.bank;

public class CheckingAccount extends BankAccount {
	/**
	 * No. of free transactions allowed for an account
	 */
	private static final int FREE_TRANSACTIONS = 3; 
	/**
	 * Fee for one transaction in an account
	 */
	private static final double TRANSACTION_FEE = 0.50;
	/**
	 * No. of transactions done in an account
	 */
	private int transactionCount; 
	/**
	 * Constructor with zero parameter
	 */
	public CheckingAccount() {
		super();
		this.transactionCount = 0;
	}
	/**
	 * @param transactionCount
	 */
	public CheckingAccount(double initialAmount) {
		super(initialAmount);
		this.transactionCount = 0;
	}
	@Override
	/**
	 * Deposits the given amount
	 */
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
		this.transactionCount++;
	}
	@Override
	/**
	 * Withdraws the given amount
	 */
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
		this.transactionCount++;
	}
	/**
	 * Deducts the transaction fee amount from the account balance
	 */
	public void deductFees() {
		if (transactionCount > FREE_TRANSACTIONS) {
		      double fee = TRANSACTION_FEE * (this.transactionCount - FREE_TRANSACTIONS);
		      super.withdraw(fee);
		}
		transactionCount = 0;
	}
	
}
