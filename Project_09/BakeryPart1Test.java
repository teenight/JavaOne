import org.junit.Assert;
import org.junit.Test;

/** Test class for BakeryPart1. **/
public class BakeryPart1Test {

   /** A test for main. **/
   @Test public void mainTest() {
      BakeryPart1 bp1 = new BakeryPart1();
      BakedItem.resetCount();
      BakeryPart1.main(null);
      Assert.assertEquals("BakedItem.count should be 6. ",
                           6, BakedItem.getCount());
   }
}