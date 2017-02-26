import java.util.Scanner;
/**
 * The information about dodecahedron.
 *
 * Project_04.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 2/12/2017
 */
public class DodecahedronApp {
/**
 * The dodecahedron app.
 * @param args Commandline arguments - not used.
 */
   public static void main(String[] args) {
      System.out.println("Enter label, color, and edge length for "
         + "a dodecahedron.");
      System.out.print("\tlabel: ");
      Scanner u = new Scanner(System.in);
      String label = u.nextLine();
      System.out.print("\tcolor: ");
      String color = u.nextLine();
      System.out.print("\tedge: ");
      double edge = u.nextDouble();
      if (edge > 0) {
         Dodecahedron a = new Dodecahedron(label, color, edge);
         System.out.print("\n" + a);
      }
      else {
         System.out.println("Error: edge must be greater than 0.");
      }
   }
}