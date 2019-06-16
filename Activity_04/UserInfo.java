/**
*  UserInfo defines objects for users and their information.
*
*  Activity_04
*  @author Justin Ng - CSPC1213
*  @version 6/11/2019
*
*/
public class UserInfo {

   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   // constructor
   
   /**
   *  @param firstNameIn takes the user's first name.
   *  @param lastNameIn takes the user's last name.
   */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   // methods
   
   /**
   *  @return String representing the UserInfo object.
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
   *  @param locationIn takes the user's location.
   *  Does not return a value.
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
   *  @param ageIn takes the user's age.
   *  @return true if applied; otherwise false.
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
   *  @return age of the user.
   *
   */
   public int getAge() {
      return age;
   }
   
   /**
   *  @return location of the user.
   *
   */
   public String getLocation() {
      return location;
   }
   
   /**
   *  Does not return a value.
   */
   public void logOff() {
      status = OFFLINE;
   }
   
   /**
   *  Does not return a value.
   */
   public void logOn() {
      status = ONLINE;
   }
}