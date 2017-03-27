/**
 * Customer.
 * Activity_07B.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 3/27/2017
 */
public class Customer implements Comparable<Customer> {
   private String name = "";
   private String location = "";
   private double balance = 0;
   /**
    * @param nameIn the input name.
    */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   /**
    * @param locationIn the input location.
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
    * @param city the input city.
    * @param state the input state.
    */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   /**
    * @param amount the input amount.
    */
   public void changeBalance(double amount) {
      balance = balance + amount;
   }
   /**
    * @return location.
    */
   public String getLocation() {
      return location;
   }
   /**
    * @return balance.
    */
   public double getBalance() {
      return balance;
   }
   /**
    * @return output string.
    */
   public String toString() {
      String output = name;
      output += "\n" + location;
      output += "\n$" + balance;
      return output;
   }
   /**
    * @param obj a new object.
    * @return the result of comparison.
    */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
}