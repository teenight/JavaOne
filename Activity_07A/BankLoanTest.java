import org.junit.Assert;
import org.junit.Test;
/**
 * JUnit test of BankLoan.
 * Activity_07A.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 3/20/2017
 */
public class BankLoanTest {
   /** A test that always fails. **/
   @Test public void chargeIntrestTest() {
      BankLoan loan1 = new BankLoan("jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }
}