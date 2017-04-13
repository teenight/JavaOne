import org.junit.Assert;
import org.junit.Test;

/** A test class for Cake. **/
public class CakeTest {

   /** A test for getLayers(). **/
   @Test public void getLayersTest() {
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1,
                         "flour", "sugar", "cocoa powder", "vanilla", "eggs",
                         "butter", "baking soda", "baking powder", "salt");
      Assert.assertEquals(1, c1.getLayers());
   }
   
   /** A test for setLayers(). **/
   @Test public void setLayersTest() {
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1,
                         "flour", "sugar", "cocoa powder", "vanilla", "eggs",
                         "butter", "baking soda", "baking powder", "salt");
      c1.setLayers(10);
      Assert.assertEquals(10, c1.getLayers());
   }
   
   /** A test for price(). **/
   @Test public void priceTest() {
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1,
                         "flour", "sugar", "cocoa powder", "vanilla", "eggs",
                         "butter", "baking soda", "baking powder", "salt");
      Assert.assertEquals(8, c1.price(), 0.01);
   }
}