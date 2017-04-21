import java.util.Comparator;

/**
 * Flavor comparator class.
 *
 * Project_10.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/20/2017
 */
public class FlavorComparator implements Comparator<BakedItem> {
   /**
    * @param b1 a baked item.
    * @param b2 another baked item.
    * @return returns an int representing order.
    */
   public int compare(BakedItem b1, BakedItem b2) {
      return (b1.getFlavor().compareTo(b2.getFlavor()));
   }
}