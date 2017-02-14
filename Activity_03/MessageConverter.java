import java.util.Scanner;
   /**
    * A program that exchanges letters in a String to encode a message.
    *
    * Activity_03.
    * @author Zejian Zhong - COMP 1210 - 008
    * @version 1/30/2017
    */
public class MessageConverter {
   /**
    * A message converter.
    * @param args Commandline arguments - not used.
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String message = "";
      int outputType = 0;
      String result = "";
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      outputType = Integer.parseInt(userInput.nextLine());
      if (outputType == 0) {
         result = message;
      }
      else if (outputType == 1) {
         result = message.trim();
      }
      else if (outputType == 2) {
         result = message.toLowerCase();
      }
      else if (outputType == 3) {
         result = message.toUpperCase();
      }
      else if (outputType == 4) {
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      }
      else if (outputType == 5) {
         result = message.substring(1, message.length() - 1);
      }
      else {
         result = "Error: Invalid choice input.";
      }
      System.out.println("\n" + result);
   }
}