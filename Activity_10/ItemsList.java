/**
 * Items list class.
 *
 * Activity_10.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/13/2017
 */
public class ItemsList {
   private InventoryItem[] inventory;
   private int count;
   
   /**
    * Declare an instance variable.
    */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   /**
    * @param itemIn the input items.
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   /**
    * @param electronicsSurcharge electronics need to add the surcharge.
    * @return the calculated total cost.
    */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   /**
    * @return the output as a string.
    */
   public String toString() {
      String output = "All inventory:\n\n";
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
   }
}