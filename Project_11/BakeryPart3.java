import java.io.IOException;

/**
 * The driver class part 3.
 *
 * Project_11.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/27/2017
 */
public class BakeryPart3 {
   /**
    * The driver class of BakedItem part 3.
    * @param args Command line arguments.
    * @throws IOException throws an exception if no file found.
    */
   public static void main(String[] args) throws IOException {
      if (args.length != 0) {
         try {
            BakedItemList list = new BakedItemList();
            list.readItemFile(args[0]);
            System.out.println(list.generateReport());
            System.out.println(list.generateReportByClass());
            System.out.println(list.generateReportByPrice());
            System.out.println(list.generateReportByFlavor());
            System.out.println(list.generateExcludedRecordsReport());
         }
         catch (IOException e) {
            System.out.println("Attempted to read file: " + args[0]  
                             + " (No such file or directory)\n" 
                             + "Program ending.");
         }
      }
      else {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
   }
}