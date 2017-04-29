/**
 * An exception class for invalid categories.
 *
 * Project_11.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/27/2017
 */
 
public class InvalidCategoryException extends Exception {
   /**
    * @param category a String parameter representing category.
    */
   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   }
}