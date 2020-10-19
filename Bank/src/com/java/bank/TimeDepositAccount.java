package com.java.bank;

public class TimeDepositAccount extends SavingsAccount {
	/**
	 * Elapsed period of the account
	 */
	private int elapsedPeriods;
	/**
	 * Period of maturity of the account
	 */
	private int maturityPeriods;
	/**
	 * Penalty rate on the interest amount
	 */
	private double interestPenaltyRate;
	/**
	 * @param rate
	 * @param initialAmount
	 * @param maturityPeriods
	 * @param interestPenaltyRate
	 */
	public TimeDepositAccount(double rate, double initialAmount, int maturityPeriods, double interestPenaltyRate ) {
		super(rate, initialAmount);
		this.elapsedPeriods = 0;
		this.maturityPeriods = maturityPeriods;
		this.interestPenaltyRate = interestPenaltyRate;
	}
	@Override
	/**
	 * Adds Periodic interest to the account
	 */
	public void addPeriodicInterest() {
		// TODO Auto-generated method stub
		this.elapsedPeriods++;
		super.addPeriodicInterest();
	}
	@Override
	/**
	 * Withdraws the penalty rate from the account
	 */
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if (this.elapsedPeriods < this.maturityPeriods)
		      super.withdraw((this.interestPenaltyRate / 100) * this.elapsedPeriods * getBalance());
		super.withdraw(amount);
	}
	
	
}
