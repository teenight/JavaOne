/**
 * WeddingCake class.
 *
 * Project_09.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/13/2017
 */
public class WeddingCake extends Cake {
   private int tiers;
   /**
    * The class variable - base rate.
    */
   public static final double BASE_RATE = 15.0;
   
   /**
    * @param nameIn the input name.
    * @param flavorIn the input flavor.
    * @param quantityIn the input quantity.
    * @param layersIn the input layers.
    * @param tiersIn the input tiers.
    * @param ingredientsIn the input ingredients.
    */
   public WeddingCake(String nameIn, String flavorIn, int quantityIn,
                   int layersIn, int tiersIn, String ... ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, layersIn, ingredientsIn);
      tiers = tiersIn;
   }
   /**
    * @return the tiers.
    */
   public int getTiers() {
      return tiers;
   }
   /**
    * @param tiersIn the input tiers.
    */
   public void setTiers(int tiersIn) {
      tiers = tiersIn;
   }
   /**
    * @return the calculated price.
    */
   public double price() {
      return (BASE_RATE * layers * tiers) * quantity;
   }
}