import java.util.ArrayList;
import java.text.DecimalFormat;

/**
*  Represents a list of dodecahedrons.
*/
public class DodecahedronList {
   
   // Instance Variables
   private String listName;
   private ArrayList<Dodecahedron> dodecaList;      
   // Constructor:
   /**
      * @param listNameIn for the listName
      * @param dListIn for the dodecaList
   */
   public DodecahedronList(String listNameIn, ArrayList<Dodecahedron> dListIn) {
      listName = listNameIn;
      dodecaList = dListIn;
   }
   
   // Methods:
      
   /**
   *  @return String representing the list of dodecahedron objects.
   */   
   public String toString() {
      String output = getName() + "\n";
      int i = 0;
      while (i < dodecaList.size()) {
         output += "\n" + dodecaList.get(i) + "\n";
         i++;
      }
      output += "\n";
      return output;
   }
   
   /**
   *  @return String for the summary of the list.
   */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output += "----- Summary for " + getName() + " -----";
      output += "\nNumber of dodecahedrons: " + numberOfDodecahedrons();
      output += "\nTotal Surface Area: " + totalSurfaceArea();
      output += "\nTotal Volume: " + totalVolume();
      output += "\nAverage Surface Area: " + averageSurfaceArea();
      output += "\nAverage Volume: " + averageVolume();
      output += "\nAverage Surface/Volume Ratio: ";
      output += averageSurfaceToVolumeRatio() + "\n";
      return output;
   }
      
   /**
   *  @return the name of the list.
   */
   public String getName() { 
      return listName;
   }
      
   /**
   *  @return the number of dodecahedrons in the list.
   */
   public int numberOfDodecahedrons() {
      return dodecaList.size();
   }
   
   /**
   *  @return the total surface area of the dodecahedrons.
   */
   public double totalSurfaceArea() {
      double area = 0.0;
      int i = 0;
      if (dodecaList.size() == 0) {
         area = 0.0;
      }   
      while (i < dodecaList.size()) {
         area += dodecaList.get(i).surfaceArea();
         i++;
      }
      return area;
   }
   
   /**
   *  @return the total volume of the dodecahedrons.
   */
   public double totalVolume() {
      double volume = 0.0;
      int i = 0;
      if (dodecaList.size() == 0) {
         volume = 0.0;
      }
      while (i < dodecaList.size()) {
         volume += dodecaList.get(i).volume();
         i++;
      }
      return volume;
   }
   
   /**
   *  @return the average surface area of the dodecahedrons.
   */
   public double averageSurfaceArea() {
      double average;
      if (dodecaList.size() == 0) {
         average = 0.0;
      }
      else {
         average = totalSurfaceArea() / dodecaList.size();
      }
      return average;
   }
   
   /**
   *  @return the average volume of the dodecahedrons.
   */
   public double averageVolume() {
      double average;
      if (dodecaList.size() == 0) {
         average = 0.0;
      }
      else {
         average = totalVolume() / dodecaList.size();
      }
      return average;
   }
   
   /**
   *  @return the average surface area to volume ratio.
   */
   public double averageSurfaceToVolumeRatio() {
      double total = 0;
      int i = 0;
      if (dodecaList.size() == 0) {
         total = 0.0;
      }
      while (i < dodecaList.size()) {
         total += dodecaList.get(i).surfaceToVolumeRatio();
         i++;
      }
      return (total / dodecaList.size());
   }
   
}