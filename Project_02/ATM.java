import java.util.Scanner;
   /**
    * A program for ATM department that allows the user to enter 
    * a value in whole dollars then displays the combination of twenties,
    * tens, fives, and ones.
    *
    * Project_02.
    * @author Zejian Zhong - COMP 1210 - 008
    * @version 1/25/2017
    */
public class ATM {
   /**
    * A program that display the combination of twenties, tens, fives 
    * and ones in dollar.
    * @param args Commandline arguments - not used.
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int amount = 0;
      int a = 0;
      int b = 0;
      int c = 0;
      int d = 0;
      System.out.print("Enter the amount: ");
      amount = userInput.nextInt();
      if (amount > 500) {
         System.out.print("Limit of $500 exceeded!");
      }
      else {
         a = amount / 20;
         b = (amount - a * 20) / 10;
         c = (amount - a * 20 - b * 10) / 5;
         d = (amount - a * 20 - b * 10 - c * 5) / 1;
         System.out.println("Bills by denomination: ");
         System.out.println("\t$20: " + a);
         System.out.println("\t$10: " + b);
         System.out.println("\t$5: " + c);
         System.out.println("\t$1: " + d);
         System.out.println("$" + amount + " = (" + a + " * $20) + (" + b
            + " * $10) + (" + c + " * $5) + (" + d + " * $1)");
      }
   }
}