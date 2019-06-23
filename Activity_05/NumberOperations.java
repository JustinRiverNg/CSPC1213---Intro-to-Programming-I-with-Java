/**
*  This class defines objects and methods to perform various number operations.
*
*  Activity_05
*  @author Justin Ng - CSPC1213
*  @version 6/17/2019
*
*/
public class NumberOperations {
   //instance variables:
   private int number;
   
   //constructor:
   /**
   *  @param numberIn takes in a number.
   */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   
    //methods:
    
    /**
    * @return String representing the NumberOperations object.
    */
   public String toString() {
      return number + "";
   }
   
    /**
    * @return int of the value of the number.
    */
   public int getValue() {
      return number;
   }
    
    /**
    * @return String of every odd integer that is less than the number.
    */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
    
    /**
    * @return String containing the positive powers of two less than the number.
    */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
    
    /**
    * @param compareNumber takes in a number to compare with our
    *  original number.
    * @return int of 1 if number is > compareNumber,
    *  or an int of -1 if number < compareNumber,
    *  or an int of 0 if number = compareNumber.
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
    
}