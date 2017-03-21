/**
 * BankLoan.
 * Activity_07A.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 3/20/2017
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
   /**
    * @param amount the amount.
    * @return true if amount is greater than or equal to 0.
    */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   /**
    * @param customerNameIn the name of customer.
    * @param interestRateIn the interest rate.
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   /**
    * @param amount the amount.
    * @return wasLoanMade.
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   /**
    * @param amountPaid the paid amount.
    * @return the absolute value of balance.
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   /**
    * @return balance.
    */
   public double getBalance() {
      return balance;
   }
   /**
    * @param loan the bank loan.
    * @return true if loan is greater than 0.
    */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   /**
    * @param interestRateIn the interest rate.
    * @return a boolean.
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
    * @return interest rate.
    */
   public double getInterestRate() {
      return interestRate;
   }
   /**
    * @return created loans.
    */
   public static int getLoansCreated() {
      return loansCreated;
   }
   /**
    * Reset the created loans.
    */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
   /**
    * Calculate the balance.
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   /**
    * @return the output.
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
}