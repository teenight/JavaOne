import org.junit.Assert;
import org.junit.After;
import org.junit.Test;

/**
 * A test class for Cookie.
 *
 * Project_11.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/27/2017
 */
public class CookieTest {
   
   /** A test for getters. **/
   @Test public void gettersTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
                            "flour", "sugar", "dark chocolate chips", 
                            "butter", "baking soda", "salt");
      Assert.assertEquals("Chips Delight", c.getName());
      Assert.assertEquals("Chocolate Chip", c.getFlavor());
      Assert.assertEquals(12, c.getQuantity(), 0.01);
      String ingredients = c.getIngredients()[1];
      Assert.assertEquals("sugar", ingredients);
   }
   
   /** A test for setters. **/
   @Test public void settersTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
                            "flour", "sugar", "dark chocolate chips", 
                            "butter", "baking soda", "salt");
      c.setName("Chips");
      c.setFlavor("Chocolate");
      c.setQuantity(13);
      Assert.assertEquals("Chips", c.getName());
      Assert.assertEquals("Chocolate", c.getFlavor());
      Assert.assertEquals(13, c.getQuantity());
      String[] test = {"1", "2", "3", "4", "5", "6", 
                       "7", "8", "9", "10", "11"};
      c.setIngredients(test);
      Assert.assertEquals("2", c.getIngredients()[1]);
   }
   
   /** A test for getCount() and resetCount(). **/   
   @Test public void countTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
                            "flour", "sugar", "dark chocolate chips", 
                            "butter", "baking soda", "salt");
      c.resetCount();
      Cookie c1 = new Cookie("Chips Delight", "Chocolate Chip", 12, 
                            "flour", "sugar", "dark chocolate chips", 
                            "butter", "baking soda", "salt");
      Assert.assertEquals(1, c1.getCount());
   }
   
   /** A test for toString(). **/
   @Test public void toStringTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
                            "flour", "sugar", "dark chocolate chips", 
                            "butter", "baking soda", "salt");
      Assert.assertEquals("Cookie: Chips Delight - Chocolate Chip   "
                           + "Quantity: 12   "
                           + "Price: $4.20"
                           + "\n(Ingredients: flour, sugar, "
                           + "dark chocolate chips, "
                           + "butter, baking soda, "
                           + "\nsalt)", c.toString());
   }
   
   /** A test for price(). **/
   @Test public void priceTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
                            "flour", "sugar", "dark chocolate chips", 
                            "butter", "baking soda", "salt");
      Assert.assertEquals(4.20, c.price(), 0.01);
   }
   
   /** Reset count after each test. **/
   @After public void after() {
      BakedItem.resetCount();
   }
}