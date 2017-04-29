import org.junit.Assert;
import org.junit.Test;

/**
 * A test class for BakeryPart3.
 *
 * Project_11.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/27/2017
 */
public class BakeryPart3Test {
   
   /**
    * A test for main when reads no file.
    * @throws Exception throws an exception if no file found.
    */
   @Test public void mainTest1() throws Exception {
      BakedItemList.resetListCount();
      BakeryPart3 app = new BakeryPart3();
      String[] args1 = {};
      BakeryPart3.main(args1);
      Assert.assertEquals(0, BakedItemList.getListCount());
   }
   
   /**
    * A test for main when the file exists.
    * @throws Exception throws an exception if no file found.
    */
   @Test public void mainTest2() throws Exception {
      BakedItemList.resetListCount();
      BakeryPart3 app = new BakeryPart3();
      String[] args2 = {"baked_item_data2.csv"};
      BakeryPart3.main(args2);
      Assert.assertEquals(1, BakedItemList.getListCount());
   }
}