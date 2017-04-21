import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;

/**
 * A test class for BakedItem.
 *
 * Project_10.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/20/2017
 */
public class BakedItemListTest {

   /** A test for getListName() and setListName(). **/
   @Test public void getSetListNameTest() {
      BakedItemList bList = new BakedItemList();
      Assert.assertEquals("", bList.getListName());
      bList.setListName("Hi");
      Assert.assertEquals("Hi", bList.getListName());
   }
   
   /** A test for getItemList() and setItemList(). **/
   @Test public void getSetItemListTest() {
      BakedItemList bList = new BakedItemList();
      BakedItem[] itemList = {null};
      Assert.assertEquals(itemList[0], bList.getItemList()[0]);
      String[] ingredientsIn = {"Hey"};
      Cookie c = new Cookie("cookie", "flavor", 3, ingredientsIn);
      BakedItem[] itemList1 = {c};
      bList.setItemList(itemList1);
      Assert.assertEquals(c, bList.getItemList()[0]);
   }
   
   /** A test for getItemCount() and setItemCount(). **/
   @Test public void getSetItemCountTest() {
      BakedItemList bList = new BakedItemList();
      Assert.assertEquals(0, bList.getItemCount());
      bList.setItemCount(1);
      Assert.assertEquals(1, bList.getItemCount());
   }
   
   /** A test for getExcludedRecords() and setExcludedRecords(). **/
   @Test public void getSetExcludedRecordsTest() {
      BakedItemList bList = new BakedItemList();
      String[] eRecords = new String[0];
      Assert.assertEquals(null, bList.getExcludedRecords()[0]);
      String[] eRecords1 = {"Yo"};
      bList.setExcludedRecords(eRecords1);
      Assert.assertEquals(eRecords1[0], bList.getExcludedRecords()[0]);
   }
   
   /** A test for getExcludedCount() and setExcludedCount(). **/
   @Test public void getSetExcludedCountTest() {
      BakedItemList bList = new BakedItemList();
      Assert.assertEquals(0, bList.getExcludedCount());
      bList.setExcludedCount(1);
      Assert.assertEquals(1, bList.getExcludedCount());
   }
   
   /** A test for listCount(). **/
   @Test public void listCountTest() {
      BakedItemList.resetListCount();
      BakedItemList blist = new BakedItemList();
      Assert.assertEquals(1, BakedItemList.getListCount());
   }
   
   /** 
    * A test for readItemFile().
    * @throws IOException throws an exception if no file found.
    */
   @Test public void readItemFileTest() throws IOException {
      BakedItemList bList = new BakedItemList();
      bList.readItemFile("baked_item_data.csv");
      Assert.assertEquals("Auburn's Best Bakery", bList.getListName());
   }
   
   /** 
    * A test for generateReport().
    * @throws IOException throws an exception if no file found.
    */
   @Test public void generateReportTest() throws IOException {
      BakedItemList bList = new BakedItemList();
      bList.readItemFile("baked_item_data.csv");
      String result = "---------------------------------------\n"
         + "Report for Auburn's Best Bakery\n"
         + "---------------------------------------\n"
         + "\n" 
         + "Cookie: Chips Delight - Chocolate Chip   "
         + "Quantity: 12   Price: $4.20\n"
         + "(Ingredients: flour, sugar, dark chocolate chips, butter, baking"
         + " soda, \n"
         + "salt)\n"
         + "\n" 
         + "Pie: Weekly Special - Apple   Quantity: 1   "
         + "Price: $12.00\n"
         + "(Ingredients: flour, sugar, apple, cinnamon, butter, \n"
         + "baking soda, salt)\n"
         + "\n" 
         + "Pie: Summer Special - Key Lime   Quantity: 1"
         + "   Price: $14.00\n"
         + "(Ingredients: flour, sugar, lime juice, lemon juice, graham "
         + "crackers, \n"
         + "butter, baking soda, salt)\n"
         + "\n" 
         + "Cake: Birthday - Chocolate   Quantity: 1   "
         + "Price: $8.00\n"
         + "(Ingredients: flour, sugar, cocoa powder, vanilla, eggs, \n"
         + "butter, baking soda, baking powder, salt)\n"
         + "\n" 
         + "Cake: 2-Layer - Red Velvet   Quantity: 1   "
         + "Price: $16.00\n"
         + "(Ingredients: flour, sugar, cocoa powder, food coloring, eggs, "
         + "\nbutter, baking soda, baking powder, salt)\n"
         + "\n" 
         + "WeddingCake: 3-Layer/3-Tier - Vanilla   "
         + "Quantity: 1   Price: $135.00\n"
         + "(Ingredients: flour, sugar, buttermilk, coffee, eggs, \n"
         + "butter, baking soda, baking powder, salt)\n"
         + "\n";
      Assert.assertEquals(result, bList.generateReport());
   }
   
   /** 
    * A test for generateReportByClass().
    * @throws IOException throws an exception if no file found.
    */
   @Test public void generateReportByClassTest() throws IOException {
      BakedItemList bList = new BakedItemList();
      bList.readItemFile("baked_item_data.csv");
      String result = "---------------------------------------\n"
         + "Report for Auburn's Best Bakery (by Class)\n"
         + "---------------------------------------\n"
         + "\n"
         + "Cake: 2-Layer - Red Velvet   Quantity: 1   "
         + "Price: $16.00\n"
         + "(Ingredients: flour, sugar, cocoa powder, food coloring, eggs, "
         + "\nbutter, baking soda, baking powder, salt)\n"
         + "\n"
         + "Cake: Birthday - Chocolate   Quantity: 1   "
         + "Price: $8.00\n"
         + "(Ingredients: flour, sugar, cocoa powder, vanilla, eggs, \n"
         + "butter, baking soda, baking powder, salt)\n"
         + "\n"
         + "Cookie: Chips Delight - Chocolate Chip   "
         + "Quantity: 12   Price: $4.20\n"
         + "(Ingredients: flour, sugar, dark chocolate chips, butter, baking"
         + " soda, \n"
         + "salt)\n"
         + "\n"
         + "Pie: Summer Special - Key Lime   Quantity: 1"
         + "   Price: $14.00\n"
         + "(Ingredients: flour, sugar, lime juice, lemon juice, graham "
         + "crackers, \n"
         + "butter, baking soda, salt)\n"
         + "\n"
         + "Pie: Weekly Special - Apple   Quantity: 1   "
         + "Price: $12.00\n"
         + "(Ingredients: flour, sugar, apple, cinnamon, butter, \n"
         + "baking soda, salt)\n"
         + "\n"
         + "WeddingCake: 3-Layer/3-Tier - Vanilla   "
         + "Quantity: 1   Price: $135.00\n"
         + "(Ingredients: flour, sugar, buttermilk, coffee, eggs, \n"
         + "butter, baking soda, baking powder, salt)\n\n";
      Assert.assertEquals(result, bList.generateReportByClass());
   }
   
   /** 
    * A test for generateReportByPrice().
    * @throws IOException throws an exception if no file found.
    */
   @Test public void generateReportByPriceTest() throws IOException {
      BakedItemList bList = new BakedItemList();
      bList.readItemFile("baked_item_data.csv");
      String result = "---------------------------------------\n"
         + "Report for Auburn's Best Bakery (by Price)\n"
         + "---------------------------------------\n"
         + "\n"
         + "Cookie: Chips Delight - Chocolate Chip   "
         + "Quantity: 12   Price: $4.20\n"
         + "(Ingredients: flour, sugar, dark chocolate chips, butter, baking"
         + " soda, \n"
         + "salt)\n"
         + "\n"
         + "Cake: Birthday - Chocolate   Quantity: 1   "
         + "Price: $8.00\n"
         + "(Ingredients: flour, sugar, cocoa powder, vanilla, eggs, \n"
         + "butter, baking soda, baking powder, salt)\n"
         + "\n"
         + "Pie: Weekly Special - Apple   Quantity: 1   "
         + "Price: $12.00\n"
         + "(Ingredients: flour, sugar, apple, cinnamon, butter, \n"
         + "baking soda, salt)\n"
         + "\n"
         + "Pie: Summer Special - Key Lime   "
         + "Quantity: 1   Price: $14.00\n"
         + "(Ingredients: flour, sugar, lime juice, lemon juice, graham "
         + "crackers, \n"
         + "butter, baking soda, salt)\n"
         + "\n"
         + "Cake: 2-Layer - Red Velvet   Quantity: 1   "
         + "Price: $16.00\n"
         + "(Ingredients: flour, sugar, cocoa powder, food coloring, eggs, "
         + "\nbutter, baking soda, baking powder, salt)\n"
         + "\n"
         + "WeddingCake: 3-Layer/3-Tier - Vanilla   "
         + "Quantity: 1   Price: $135.00\n"
         + "(Ingredients: flour, sugar, buttermilk, coffee, eggs, \n"
         + "butter, baking soda, baking powder, salt)\n\n";
      Assert.assertEquals(result, bList.generateReportByPrice());
   }
   
   /** 
    * A test for generateReportByFlavor().
    * @throws IOException throws an exception if no file found.
    */
   @Test public void generateReportByFlavorTest() throws IOException {
      BakedItemList bList = new BakedItemList();
      bList.readItemFile("baked_item_data.csv");
      String result = "---------------------------------------\n"
         + "Report for Auburn's Best Bakery (by Flavor)\n"
         + "---------------------------------------\n"
         + "\n"
         + "Pie: Weekly Special - Apple   Quantity: 1   "
         + "Price: $12.00\n"
         + "(Ingredients: flour, sugar, apple, cinnamon, butter, \n"
         + "baking soda, salt)\n"
         + "\n"
         + "Cake: Birthday - Chocolate   "
         + "Quantity: 1   Price: $8.00\n"
         + "(Ingredients: flour, sugar, cocoa powder, vanilla, eggs, \n"
         + "butter, baking soda, baking powder, salt)\n"
         + "\n"
         + "Cookie: Chips Delight - Chocolate Chip   "
         + "Quantity: 12   Price: $4.20\n"
         + "(Ingredients: flour, sugar, dark chocolate chips, butter, "
         + "baking soda, \n"
         + "salt)\n"
         + "\n" 
         + "Pie: Summer Special - Key Lime   Quantity: 1"
         + "   Price: $14.00\n"
         + "(Ingredients: flour, sugar, lime juice, lemon juice, graham "
         + "crackers, \n"
         + "butter, baking soda, salt)\n"
         + "\n"
         + "Cake: 2-Layer - Red Velvet   Quantity: 1   "
         + "Price: $16.00\n"
         + "(Ingredients: flour, sugar, cocoa powder, food coloring, eggs, "
         + "\nbutter, baking soda, baking powder, salt)\n"
         + "\n"
         + "WeddingCake: 3-Layer/3-Tier - Vanilla   "
         + "Quantity: 1   Price: $135.00\n"
         + "(Ingredients: flour, sugar, buttermilk, coffee, eggs, \n"
         + "butter, baking soda, baking powder, salt)\n\n";
      Assert.assertEquals(result, bList.generateReportByFlavor());
   }
   
   /** 
    * A test for generateExcludedRecordsReport().
    * @throws IOException throws an exception if no file found.
    */
   @Test public void generateExcludedRecordsReportTest() throws IOException {
      BakedItemList bList = new BakedItemList();
      bList.readItemFile("baked_item_data.csv");
      String result = "---------------------------------------\n"
         + "Excluded Records Report\n"
         + "---------------------------------------\n"
         + "\n"
         + "*** invalid category *** for line:\n"
         + "D,Chips Delight,Chocolate Chip,12,flour,sugar,dark chocolate "
         + "chips,butter,baking soda,salt\n"
         + "*** invalid category *** for line:\n"
         + "R,Weekly Special,Apple,1,0,flour,sugar,apple,cinnamon,butter,"
         + "baking soda,salt\n";
      Assert.assertEquals(result, bList.generateExcludedRecordsReport());
   }
}