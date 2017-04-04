/**
 * Online article class.
 *
 * Activity_09.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 4/3/2017
 */
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;
   
   /**
    * @param nameIn the input name.
    * @param priceIn the input price.
    */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   /**
    * @param wordCountIn set the amount of words.
    */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}