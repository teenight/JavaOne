import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Dodecahdedron list menu app.
 *
 * Project_06
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 3/6/2017
 */
public class DodecahedronListMenuApp {
   /**
    * @param args - is not used.
    * @throws IOException from scanning input file.
    */
   public static void main(String[] args) throws IOException {
      String dListName = "*** no list name assigned ***";
      ArrayList<Dodecahedron> myList = new ArrayList<Dodecahedron>();
      DodecahedronList myDList = new DodecahedronList(dListName, myList);
      String fileName = "no file name";
      String labelIn = "";
      String colorIn = "";
      double edgeIn = 0;
      String code = "";
      Scanner scan = new Scanner(System.in);
      System.out.println("Dodecahedron List System Menu\n"
                       + "R - Read File and Create Dodecahedron List\n"
                       + "P - Print Dodecahedron List\n"
                       + "S - Print Summary\n"
                       + "A - Add Dodecahedron\n"
                       + "D - Delete Dodecahedron\n"
                       + "F - Find Dodecahedron\n"
                       + "E - Edit Dodecahedron\n"
                       + "Q - Quit");
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch (codeChar) {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
               myDList = myDList.readFile(fileName);
               System.out.println("\tFile read in and "
                              + "Dodecahedron List created\n");
               break;                     
            case 'P':
               System.out.println(myDList);
               break;
            case 'S':
               System.out.println("\n" + myDList.summaryInfo() + "\n");
               break;    
            case 'A':
               System.out.print("\tLabel: ");
               labelIn = scan.nextLine();
               System.out.print("\tColor: ");
               colorIn = scan.nextLine();
               System.out.print("\tEdge: ");
               edgeIn = Double.parseDouble(scan.nextLine());
               myDList.addDodecahedron(labelIn, colorIn, edgeIn);
               System.out.println("\t*** Dodecahedron added ***\n");
               break;
            case 'D':
               System.out.print("\tLabel: ");
               labelIn = scan.nextLine(); 
               if (myDList.deleteDodecahedron(labelIn) != null) {
                  myDList.deleteDodecahedron(labelIn);
                  System.out.println("\t\"" + labelIn + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + labelIn + "\" not found\n");
               }
               break;
            case 'F':
               System.out.print("\tLabel: ");
               labelIn = scan.nextLine();
               if (myDList.findDodecahedron(labelIn) == null) {
                  System.out.println("\t\"" + labelIn + "\" not found");
                  System.out.println("");
               }
               else {
                  System.out.println(myDList.
                     findDodecahedron(labelIn).toString());
                  System.out.println("");
               }
               break;
            case 'E':System.out.print("\tLabel: ");
               labelIn = scan.nextLine();       
               System.out.print("\tColor: ");
               colorIn = scan.nextLine();               
               System.out.print("\tEdge: ");
               edgeIn = Double.parseDouble(scan.nextLine());
               if (myDList.findDodecahedron(labelIn) == null) {
                  System.out.println("\t\"" + labelIn + "\" not found");
                  System.out.println("");
               }
               else {
                  myDList.editDodecahedron(labelIn, colorIn, edgeIn);
                  System.out.println("\t\""
                     + labelIn + "\" successfully edited");
                  System.out.println("");
               }
               break;
            case 'Q':
               break;
            default:
               System.out.println("\t*** invalid code ***");
               System.out.println("");
         }
      }
      while (!code.equalsIgnoreCase("Q"));      
   }
}