import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Baked item list class.
 *
 * Project_10.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/20/2017
 */
public class BakedItemList {
   private String listName;
   private BakedItem[] itemList = new BakedItem[100];
   private int itemCount;
   private String[] excludedRecords = new String[30];
   private int excludedCount;
   private static int listCount = 0;
   
   /**
    * Initialize the instance fields.
    */
   public BakedItemList() {
      listName = "";
      itemCount = 0;
      excludedCount = 0;
      listCount++;
   }
   /**
    * @return returns the String representing the listName.
    */
   public String getListName() {
      return listName;
   }
   /**
    * @param listNameIn assigns the input String to listName.
    */
   public void setListName(String listNameIn) {
      listName = listNameIn;
   }
   /**
    * @return returns the BakedItem array representing the itemList.
    */
   public BakedItem[] getItemList() {
      return itemList;
   }
   /**
    * @param itemListIn assigns the BakedItem array to itemList.
    */
   public void setItemList(BakedItem[] itemListIn) {
      itemList = itemListIn;
   }
   /**
    * @return the current value of itemCount.
    */
   public int getItemCount() {
      return itemCount;
   }
   /**
    * @param itemCountIn assigns the int to itemCount.
    */
   public void setItemCount(int itemCountIn) {
      itemCount = itemCountIn;
   }
   /**
    * @return returns the String array representing the excludedRecords.
    */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   /**
    * @param excludedRecordsIn assigns the input String array 
    * to excludedRecords.
    */
   public void setExcludedRecords(String[] excludedRecordsIn) {
      excludedRecords = excludedRecordsIn;
   }
   /**
    * @return returns the current value of excludedCount.
    */
   public int getExcludedCount() {
      return excludedCount;
   }
   /**
    * @param excludedCountIn sets excludedCount to the int.
    */
   public void setExcludedCount(int excludedCountIn) {
      excludedCount = excludedCountIn;
   }
   /**
    * @return returns the current value of listCount.
    */
   public static int getListCount() {
      return listCount;
   }
   /**
    * Sets listCount to 0.
    */
   public static void resetListCount() {
      listCount = 0;
   }
   /**
    * @param fileNameIn the input file name.
    * @throws IOException throws an exception if no file found.
    */
   public void readItemFile(String fileNameIn) throws IOException {
      Scanner scanName = new Scanner(new File(fileNameIn));
      listName = scanName.nextLine();
      String[] elements;
      char option;
      String optionString;
      while (scanName.hasNext()) {
         String input = scanName.nextLine();
         elements = input.split(",");
         optionString = elements[0];
         option = optionString.toUpperCase().charAt(0);

         String nameIn;
         String flavorIn;
         int quantityIn;
         double crustCostIn;
         int layersIn;
         int tiersIn;
         String[] ingredients = new String[50];
         int j;
         String[] ingredientsTrim;

         switch (option) {
            case 'C':
               nameIn = elements[1];
               flavorIn = elements[2];
               quantityIn = Integer.parseInt(elements[3]);
               j = 0;
               for (int i = 0; i < elements.length - 4; i++) {
                  ingredients[i] = elements[i + 4];
                  j++;
               }
               ingredientsTrim = Arrays.copyOf(ingredients, j);
               Cookie c = new Cookie(nameIn, flavorIn, quantityIn,
                     ingredientsTrim);
               itemList[itemCount] = c;
               itemCount++;
               break;

            case 'P':
               nameIn = elements[1];
               flavorIn = elements[2];
               quantityIn = Integer.parseInt(elements[3]);
               crustCostIn = Double.parseDouble(elements[4]);
               j = 0;
               for (int i = 0; i < elements.length - 5; i++) {
                  ingredients[i] = elements[i + 5];
                  j++;
               }
               ingredientsTrim = Arrays.copyOf(ingredients, j);
               Pie p = new Pie(nameIn, flavorIn, quantityIn, crustCostIn,
                     ingredientsTrim);
               itemList[itemCount] = p;
               itemCount++;
               break;

            case 'K':
               nameIn = elements[1];
               flavorIn = elements[2];
               quantityIn = Integer.parseInt(elements[3]);
               layersIn = Integer.parseInt(elements[4]);
               j = 0;
               for (int i = 0; i < elements.length - 5; i++) {
                  ingredients[i] = elements[i + 5];
                  j++;
               }
               ingredientsTrim = Arrays.copyOf(ingredients, j);
               Cake k = new Cake(nameIn, flavorIn, quantityIn, layersIn,
                     ingredientsTrim);
               itemList[itemCount] = k;
               itemCount++;
               break;

            case 'W':
               nameIn = elements[1];
               flavorIn = elements[2];
               quantityIn = Integer.parseInt(elements[3]);
               layersIn = Integer.parseInt(elements[4]);
               tiersIn = Integer.parseInt(elements[5]);
               j = 0;
               for (int i = 0; i < elements.length - 6; i++) {
                  ingredients[i] = elements[i + 6];
                  j++;
               }
               ingredientsTrim = Arrays.copyOf(ingredients, j);
               WeddingCake w = new WeddingCake(nameIn, flavorIn, quantityIn,
                     layersIn, tiersIn, ingredientsTrim);
               itemList[itemCount] = w;
               itemCount++;
               break;

            default:
               excludedRecords[excludedCount] = input;
               excludedCount++;
               break;
         }
      }
   }
   /**
    * @return returns the bakery report by using the original order.
    */
   public String generateReport() {
      BakedItem[] itemList1 = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(itemList1);
      String result = "---------------------------------------\n"
                    + "Report for Auburn's Best Bakery\n"
                    + "---------------------------------------\n\n";
      for (int i = 0; i < itemCount; i++) {
         result += itemList[i].toString() + "\n\n";
      }
      return result;
   }
   /**
    * @return returns the bakery report by using the natural order.
    */
   public String generateReportByClass() {
      BakedItem[] itemList1 = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(itemList1);
      String result = "---------------------------------------\n"
                    + "Report for Auburn's Best Bakery (by Class)\n"
                    + "---------------------------------------\n\n";
      for (int i = 0; i < itemCount; i++) {
         result += itemList1[i].toString() + "\n\n";
      }
      return result;
   }
   /**
    * @return returns the bakery report by item price.
    */
   public String generateReportByPrice() {
      BakedItem[] itemList1 = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(itemList1, new PriceComparator());
      String result = "---------------------------------------\n"
                    + "Report for Auburn's Best Bakery (by Price)\n"
                    + "---------------------------------------\n\n";
      for (int i = 0; i < itemCount; i++) {
         result += itemList1[i].toString() + "\n\n";
      }
      return result;
   }
   /**
    * @return returns the bakery report by flavor.
    */
   public String generateReportByFlavor() {
      BakedItem[] itemList1 = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(itemList1, new FlavorComparator());
      String result = "---------------------------------------\n"
                    + "Report for Auburn's Best Bakery (by Flavor)\n"
                    + "---------------------------------------\n\n";
      for (int i = 0; i < itemCount; i++) {
         result += itemList1[i].toString() + "\n\n";
      }
      return result;
   }
   /**
    * @return returns the Excluded Records Report.
    */
   public String generateExcludedRecordsReport() {
      String result = "---------------------------------------\n" 
                    + "Excluded Records Report\n" 
                    + "---------------------------------------\n\n";
      for (int i = 0; i < excludedCount; i++) {
         result += "*** invalid category *** for line:\n"
                 + excludedRecords[i] + "\n";
      }
      return result;
   }
}