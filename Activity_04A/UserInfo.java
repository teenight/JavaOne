/**
 * User information.
 *
 * Activity_04A.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 2/6/2017
 */
public class UserInfo {
/**
 * User information.
 * @param args Commandline arguments - not used.
 */
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   /**
    * @param firstNameIn the first name.
    * @param lastNameIn the last name.
    */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   /**
    * @return output.
    */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
   /**
    * @param locationIn the input location.
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
    * @return isSet.
    * @param ageIn the input age.
    */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
    * @return age.
    */
   public int getAge() {
      return age;
   }
   /**
    * @return location.
    */
   public String getLocation() {
      return location;
   }
   /**
    * Offline.
    */
   public void logOff() {
      status = OFFLINE;
   }
   /**
    * Online.
    */
   public void logOn() {
      status = ONLINE;
   }
}