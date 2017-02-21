/**
 * Number operations.
 *
 * Activity_05.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 2/20/2017
 */
public class NumberOperations {
   private int number;
   /**
    * @param numberIn the input number.
    */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   /**
    * @return return the number.
    */
   public int getValue() {
      return number;
   }
   /**
    * @return return output for oddsUnder.
    */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   /**
    * @return return output for powersTwoUnder.
    */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t"; // concatenate to output
         powers = powers * 2; // get next power of 2
      }
      return output;
   }
   /**
    * @param compareNumber the compare number.
    * @return return something.
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   /**
    * @return return the string.
    */
   public String toString() {
      return number + "";
   }
}