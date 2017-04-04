/**
 * Online book class.
 * Subclass of OnlineTextItem class.
 *
 * Activity_09.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/3/2017
 */
public class OnlineBook extends OnlineTextItem {
   protected String author;
   
   /**
    * @param nameIn the input name.
    * @param priceIn the input price.
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   /**
    * @param nameIn sets the author's name.
    */
   public void setAuthor(String nameIn) {
      author = nameIn;
   }
   /**
    * @return the author's name and price as string.
    */
   public String toString() {
      return name + " - " + author + ": $" + price;
   }
}