import java.util.ArrayList;
/**
 * Temperatures list.
 *
 * Activity_06.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 2/27/2017
 */
public class Temperatures {
   /**
    * Adding an instance variable.
    */
   private ArrayList<Integer> temperatures;
   /**
    * @param temperaturesIn the input temperatures.
    */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   /**
    * @return 0 if no input.
    */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   /**
    * @return 0 if no input.
    */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
   /**
    * @param lowIn the input low temp.
    * @return the low temp.
    */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   /**
    * @param highIn the input high temp.
    * @return the high temp.
    */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   /**
    * @return a string.
    */
   public String toString() {
      return "\tTemperatures: " + temperatures
            + "\n\tLow: " + getLowTemp()
            + "\n\tHigh: " + getHighTemp();
   }
}