import java.util.Scanner;
/**
 * A program that calculates a result for the indicated formula.
 *
 * Project_02.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 1/25/2017
 */
public class FormulaCalculator {
   /**
    * A formula calculator.
    * @param args Commandline arguments - not used.
    */
   public static void main(String[] args) {
      System.out.println("result = (2x - 7.4) (4y + 9.3) (6z - 11.2) / xyz");
      Scanner userInput = new Scanner(System.in);
      String name = "";
      double result = 0;
      double x = 0;
      double y = 0;
      double z = 0;
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
      if (x * y * z == 0) {
         System.out.print("result = 0.0");
      }
      else {
         result = (2 * x - 7.4) * (4 * y + 9.3) * (6 * z - 11.2) / (x * y * z);
         System.out.print("result = " + result);
      }
   }
}