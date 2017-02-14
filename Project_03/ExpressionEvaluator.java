import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * A program that calculates an expression.
 *
 * Project_03.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 2/4/2017
 */
public class ExpressionEvaluator {
   /**
    * An expression evaluator.
    * @param args Commandline arguments - not used.
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x, a, b, c, d, e, result;
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      a = ((Math.pow(x, 5)) * 3) - ((Math.pow(x, 3)) * 2);
      b = Math.pow(a, 2);
      c = (Math.pow(x, 7)) * 16;
      d = Math.abs(c);
      e = Math.sqrt(d) + 1;
      result = b / e;
      System.out.println("Result: " + result);
      String result2 = Double.toString(result);
      System.out.println("# digits to left of decimal point: "
         + result2.indexOf("."));
      System.out.println("# digits to right of decimal point: "
            + (result2.length() - result2.indexOf(".") - 1));
      DecimalFormat fmt = new DecimalFormat("#,##0.0####");
      double val = result;
      System.out.println("Formatted Result: " + fmt.format(val));
   }
}