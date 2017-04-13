/**
 * Pie class.
 *
 * Project_09.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/13/2017
 */
public class Pie extends BakedItem {
   private double crustCost;
   /**
    * The class variable - base rate.
    */
   public static final double BASE_RATE = 12.0;
   
   /**
    * @param nameIn the input name.
    * @param flavorIn the input flavor.
    * @param quantityIn the input quantity.
    * @param crustCostIn the input crustCost.
    * @param ingredientsIn the input ingredients.
    */
   public Pie(String nameIn, String flavorIn, int quantityIn, 
              double crustCostIn, String ... ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      crustCost = crustCostIn;
   }
   /**
    * @return the crustCost.
    */
   public double getCrustCost() {
      return crustCost;
   }
   /**
    * @param crustCostIn the input crustCost.
    */
   public void setCrustCost(double crustCostIn) {
      crustCost = crustCostIn;
   }
   /**
    * @return the calculated price.
    */
   public double price() {
      return (BASE_RATE + crustCost) * quantity;
   }
}