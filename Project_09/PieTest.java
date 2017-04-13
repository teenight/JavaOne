import org.junit.Assert;
import org.junit.Test;

/** A test class for Pie. **/
public class PieTest {

   /** A test for getCrustCost(). **/
   @Test public void getCrustCostTest() {
      Pie p1 = new Pie("Weekly Special", "Apple", 1, 0,
                       "flour", "sugar", "apples", "cinnamon",
                       "butter", "baking soda", "salt");
      Assert.assertEquals(0, p1.getCrustCost(), 0.01);
   }
   
   /** A test for setCrustCost(). **/
   @Test public void setCrustCostTest() {
      Pie p1 = new Pie("Weekly Special", "Apple", 1, 0,
                       "flour", "sugar", "apples", "cinnamon",
                       "butter", "baking soda", "salt");
      p1.setCrustCost(2.0);
      Assert.assertEquals(2, p1.getCrustCost(), 0.01);
   }
   
   /** A test for price(). **/
   @Test public void priceTest() {
      Pie p1 = new Pie("Weekly Special", "Apple", 1, 0,
                       "flour", "sugar", "apples", "cinnamon",
                       "butter", "baking soda", "salt");
      Assert.assertEquals(12, p1.price(), 0.01);
   }
}