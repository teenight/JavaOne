import org.junit.Assert;
import org.junit.Test;

/**
 * A test class for FlavorComparator.
 *
 * Project_10.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/20/2017
 */
public class FlavorComparatorTest {
   
   /**
    * A test for flavor compare method.
    * @throws Exception throws an exception if no file found.
    */
   @Test public void compare() throws Exception {
      BakedItemList bList = new BakedItemList();
      bList.readItemFile("baked_item_data.csv");
      Assert.assertEquals("\n---------------------------------------\n"
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
         + "butter, baking soda, baking powder, salt)\n", 
         bList.generateReportByFlavor());
   }
}