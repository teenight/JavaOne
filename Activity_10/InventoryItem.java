/**
 * Inventory item class.
 *
 * Activity_10.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/13/2017
 */
public class InventoryItem {
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /**
    * @param nameIn the input name.
    * @param priceIn the input price.
    */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   /**
    * @return the name.
    */
   public String getName() {
      return name;
   }
   /**
    * @return the total cost.
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   /**
    * @param taxRateIn sets the tax rate.
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   /**
    * @return the name and cost as string.
    */
   public String toString() {
      return name + ": $" + calculateCost();
   }
}