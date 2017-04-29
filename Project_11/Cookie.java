/**
 * Cookie class.
 *
 * Project_11.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/27/2017
 */
public class Cookie extends BakedItem {
   /**
    * The class variable - base rate.
    */
   public static final double BASE_RATE = 0.35;
   
   /**
    * @param nameIn the input name.
    * @param flavorIn the input flavor.
    * @param quantityIn the input quantity.
    * @param ingredientsIn the input ingredients.
    */
   public Cookie(String nameIn, String flavorIn, int quantityIn, 
                 String ... ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
   }
   /**
    * @return the calculated price.
    */
   public double price() {
      return BASE_RATE * quantity;
   }
}