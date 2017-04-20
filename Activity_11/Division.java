/**
 * Division class.
 *
 * Activity_11.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/19/2017
 */
public class Division {
   /**
    * @param numerator the number to be divided.
    * @param denominator the number dividing numerator.
    * @return returns the result.
    */
   public static int intDivide(int numerator, int denominator) {
      try {
         return numerator / denominator;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   /**
    * @param numerator the number to be divided.
    * @param denominator the number dividing numerator.
    * @return returns the result.
    */
   public static double decimalDivide(int numerator, int denominator) {
      if (denominator == 0) {
         throw new IllegalArgumentException("The denominator " 
            + "cannot be zero.");
      }
      return (double) numerator / denominator;
   }
}