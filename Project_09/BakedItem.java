import java.text.DecimalFormat;

/**
 * Baked item class.
 *
 * Project_09.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/13/2017
 */
public abstract class BakedItem extends BakeryPart1 {
   protected String name;
   protected String flavor;
   protected int quantity;
   protected String[] ingredients;
   protected static int count = 0;
   
   /**
    * @param nameIn the input name.
    * @param flavorIn the input flavor.
    * @param quantityIn the input quantity.
    * @param ingredientsIn the input ingredients.
    */
   public BakedItem(String nameIn, String flavorIn, int quantityIn, 
                    String ... ingredientsIn) {
      name = nameIn;
      flavor = flavorIn;
      quantity = quantityIn;
      ingredients = ingredientsIn;
      count++;
   }
   
   /**
    * @return the name.
    */
   public String getName() {
      return name;
   }
   /**
    * @param nameIn the input name.
    */
   public void setName(String nameIn) {
      this.name = nameIn;
   }
   /**
    * @return the flavor.
    */
   public String getFlavor() {
      return flavor;
   }
   /**
    * @param flavorIn the input flavor.
    */
   public void setFlavor(String flavorIn) {
      this.flavor = flavorIn;
   }
   /**
    * @return the quantity.
    */
   public int getQuantity() {
      return quantity;
   }
   /**
    * @param quantityIn the input quantity.
    */
   public void setQuantity(int quantityIn) {
      this.quantity = quantityIn;
   }
   /**
    * @return the ingredients.
    */
   public String[] getIngredients() {
      return ingredients;
   }
   /**
    * @param ingredientsIn the input ingredients.
    */
   public void setIngredients(String ... ingredientsIn) {
      this.ingredients = ingredientsIn;
   }
   /**
    * @return the amount of items.
    */
   public static int getCount() {
      return count;
   }
   /**
    * Resets the count.
    */
   public static void resetCount() {
      BakedItem.count = 0;
   }
   /**
    * @return result as a string.
    */
   public final String toString() {
      String ing = "";
      for (int i = 0; i < ingredients.length; i++) {
         if (i % 5 == 0 && i > 0) {
            ing += "\n" + ingredients[i] + ", ";
            continue;
         }
         ing += ingredients[i] + ", ";
      }
      DecimalFormat fmt = new DecimalFormat("$#,##0.00");
      String result = this.getClass().toString().substring(6) 
         + ": " + name + " - " + flavor + "   Quantity: " + quantity 
         + "   Price: " + fmt.format(price()) + "\n" + "(Ingredients: " 
         + ing + ")";
      result = result.replace(", )", ")");
      return result;
   }
   /**
    * Abstract method for derived class to override.
    * @return price as a double.
    */
   public abstract double price();
}