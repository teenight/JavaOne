/**
 * User information.
 * 
 * Activity_04A.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 2/6/2017
 */
public class Activity4A {
/**
 * User information.
 * @param args Commandline arguments - not used.
 */
   public static void main(String[] args) {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}