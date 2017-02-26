import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/**
 * The dodecahedron list app.
 *
 * Project_05.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 2/26/2017
 */
public class DodecahedronListApp {
   /**
    * The dodecahedron list app.
    * @param args the args.
    * @throws IOException the IOException.
    */
   public static void main(String[] args) throws IOException {
      ArrayList<Dodecahedron> myList = new ArrayList<Dodecahedron>();
      String dodecahedronListName = "";
      String label = "";
      String color = "";
      double edge = 0;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      System.out.println();
      Scanner scanFile = new Scanner(new File(fileName));
      dodecahedronListName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         color = scanFile.nextLine();
         edge = Double.parseDouble(scanFile.nextLine());
         Dodecahedron d = new Dodecahedron(label, color, edge);
         myList.add(d);
      }
      DodecahedronList myDList = new 
         DodecahedronList(dodecahedronListName, myList);
      System.out.println(myDList);
      System.out.println();
      System.out.println(myDList.summaryInfo());
   }
}