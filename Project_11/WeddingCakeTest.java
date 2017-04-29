import org.junit.Assert;
import org.junit.Test;

/**
 * A test class for WeddingCake.
 *
 * Project_11.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/27/2017
 */
public class WeddingCakeTest {
   
   /** A test for getTiers(). **/
   @Test public void getTiersTest() {
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3,
                       "flour", "sugar", "buttermilk", "coffee",
                       "eggs", "butter", "baking soda", "baking powder",
                       "salt");
      Assert.assertEquals(3, c3.getTiers());
   }
   
   /** A test for setTiers(). **/
   @Test public void setTiersTest() {
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3,
                          "flour", "sugar", "buttermilk", "coffee",
                          "eggs", "butter", "baking soda", "baking powder",
                          "salt");
      c3.setTiers(10);
      Assert.assertEquals(10, c3.getTiers());
   }
   
   /** A test for price(). **/
   @Test public void priceTest() {
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3,
                          "flour", "sugar", "buttermilk", "coffee",
                          "eggs", "butter", "baking soda", "baking powder",
                          "salt");
      Assert.assertEquals(135, c3.price(), 0.01);
   }
}