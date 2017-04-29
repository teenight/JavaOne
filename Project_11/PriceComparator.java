import java.util.Comparator;

/**
 * Price comparator class.
 *
 * Project_11.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/27/2017
 */
public class PriceComparator implements Comparator<BakedItem> {
   /**
    * @param b1 a baked item.
    * @param b2 another baked item.
    * @return returns an int representing the order.
    */
   public int compare(BakedItem b1, BakedItem b2) {
      if (b1.price() > b2.price()) {
         return 1;
      }
      else if (b1.price() < b2.price()) {
         return -1;
      }
      return 0;
   }
}