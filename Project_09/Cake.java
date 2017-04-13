/**
 * Cake class.
 *
 * Project_09.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/13/2017
 */
public class Cake extends BakedItem {
   protected int layers;
   /**
    * The class variable - base rate.
    */
   public static final double BASE_RATE = 8.0;
   
   /**
    * @param nameIn the input name.
    * @param flavorIn the input flavor.
    * @param quantityIn the input quantity.
    * @param layersIn the input layers.
    * @param ingredientsIn the input ingredients.
    */
   public Cake(String nameIn, String flavorIn, int quantityIn, 
                        int layersIn, String ... ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      layers = layersIn;
   }
   /**
    * @return the layers.
    */
   public int getLayers() {
      return layers;
   }
   /**
    * @param layersIn the input layers.
    */
   public void setLayers(int layersIn) {
      layers = layersIn;
   }
   /**
    * @return the calculated price.
    */
   public double price() {
      return (BASE_RATE * layers) * quantity;
   }
}