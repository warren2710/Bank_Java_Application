package com.java.bank;

public class AccountTest {

	public static void main(String[] args) {
	    BankAccount mySaving = new SavingsAccount(3.25);
	    BankAccount trip = new TimeDepositAccount(4.0, 10000.00, 3, 2.5);
	    BankAccount check = new CheckingAccount();

	    mySaving.deposit(10000.00);

	    mySaving.transfer(check, 2000);

	    check.withdraw(200);
	    check.deposit(300);
	    check.withdraw(80);
	    check.withdraw(400);

	    endOfMonth((SavingsAccount) mySaving);
	    endOfMonth((TimeDepositAccount) trip);
	    endOfMonth((CheckingAccount) check);
	    
	    check.withdraw(200);
	    check.withdraw(300);
	    check.deposit(80);
	    check.withdraw(400);
	    
	    endOfMonth((SavingsAccount) mySaving);
	    endOfMonth((TimeDepositAccount) trip);
	    endOfMonth((CheckingAccount) check);

	    
	    trip.transfer(check, 980);

	    System.out.println("Mom's savings. " + mySaving);
	    // (10000 - 2000) * .5 % interest = 8040
	    System.out.println("The college fund. " + trip);
	    // (10000 * 1% interest) * 0.5% penalty - 980 = 9069.50
	    System.out.println("Harry's checking. " + check);
	    // 2000 - 200 - 300 - 80 - 400 - 2 trans. fees + 980 = 1999
	  }


	  /** 
	   * @param savings
	   */
	  public static void endOfMonth(SavingsAccount savings) {
	    savings.addPeriodicInterest();
	  }

	  /** 
	   * @param checking
	   */
	  public static void endOfMonth(CheckingAccount checking) {
	    checking.deductFees();
	  }

}
