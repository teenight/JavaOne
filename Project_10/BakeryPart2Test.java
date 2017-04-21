import org.junit.Assert;
import org.junit.Test;

/**
 * A test class for BakeryPart2.
 *
 * Project_10.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/20/2017
 */
public class BakeryPart2Test {
   
   /**
    * A test for main when reads no file.
    * @throws Exception throws an exception if no file found.
    */
   @Test public void mainTest1() throws Exception {
      BakedItemList.resetListCount();
      BakeryPart2 app = new BakeryPart2();
      String[] args1 = {};
      BakeryPart2.main(args1);
      Assert.assertEquals(0, BakedItemList.getListCount());
   }
   
   /**
    * A test for main when the file exists.
    * @throws Exception throws an exception if no file found.
    */
   @Test public void mainTest2() throws Exception {
      BakedItemList.resetListCount();
      BakeryPart2 app = new BakeryPart2();
      String[] args2 = {"baked_item_data.csv"};
      BakeryPart2.main(args2);
      Assert.assertEquals(1, BakedItemList.getListCount());
   }
}