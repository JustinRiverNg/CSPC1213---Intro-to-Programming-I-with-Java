import java.util.ArrayList;
/**
*  Represents a list of daily temperatures. 
*/
public class Temperatures {
   // Instance Variables:
   private ArrayList<Integer> temperatures;
   
   // Constructor:
   
   /**
   *  @param temperaturesIn for daily temperatures.
   */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   
   // Methods:
   
   /**
   *  @return int for the lowest temperature in the list
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
   *  @return int for the highest temperature in the list
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
   *  @param lowIn takes in an integer.
   *  @return int of the lower of getLowTemp() and the parameter.
   */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   /**
   *  @param highIn takes in an integer.
   *  @return int of the higher of getHighTemp() and the parameter.
   */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   /**
   *  @return String representing the lowest and highest temperatures.
   */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp() + "\n\tHigh: " + getHighTemp();
   }
   
}