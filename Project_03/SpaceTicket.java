import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * A program that accept coded space ticket information.
 *
 * Project_03.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 2/4/2017
 */
public class SpaceTicket {
   static final double STUDENT_DISCOUNT = .25;
   static final double CHILD_DISCOUNT = .35;
      /**
       * Info of a space ticket.
       * @param args Commandline arguments - not used.
       */
   public static void main(String[] args) {
      System.out.print("Enter ticket code: ");
      Scanner userInput = new Scanner(System.in);
      String ticket = userInput.nextLine();
      ticket = ticket.trim();
      if (ticket.length() < 25) {
         System.out.print("\n*** Invalid ticket code ***" 
            + "\nTicket code must have at least 25 characters.");
      }
      else {
         System.out.print("\nSpace Ticket: " + ticket.substring(24));
         System.out.print("\nDate: " + ticket.substring(13, 15) + "/" 
            + ticket.substring(15, 17) + "/" + ticket.substring(17, 21));
         System.out.print("   Time: " + ticket.substring(9, 11) + ":" 
            + ticket.substring(11, 13));
         System.out.print("   Seat: " + ticket.substring(21, 24));
         DecimalFormat fmt = new DecimalFormat("$###,###.00");
         double price = Double.parseDouble(ticket.substring(0, 8));
         price = price / 100;
         System.out.print("\nPrice: " + fmt.format(price));
         char category = ticket.charAt(8);
         System.out.print("   Category: " + category);
         if (category == 's') {
            price = price * (1 - STUDENT_DISCOUNT);
            System.out.print("   Cost: " + fmt.format(price));
         }
         else if (category == 'c') {
            price = price * (1 - CHILD_DISCOUNT);
            System.out.print("   Cost: " + fmt.format(price));
         }
         else {
            System.out.print("   Cost: " + fmt.format(price));
         }
         int random = (int) (Math.random() * 999999 + 1);
         DecimalFormat fmt1 = new DecimalFormat("000000");
         System.out.print("\nPrize Number: " + fmt1.format(random));   
      }
   }
}