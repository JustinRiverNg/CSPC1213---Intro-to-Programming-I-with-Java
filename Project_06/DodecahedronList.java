import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

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
   
   /**
   *  @return the list of dodecahedron objects.
   */
   public ArrayList<Dodecahedron> getList() {
      return dodecaList;
   }
   
   /**
   *  @param fileNameIn reads in a file.
   *  @return a list of dodecahedron list object.
   *  @throws FileNotFoundException from scanning input file.
   */
   public DodecahedronList readFile(String fileNameIn) 
      throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      String label = "";
      String color = "";
      double edgeLength;
      ArrayList<Dodecahedron> myList = new ArrayList<Dodecahedron>();
      
      String dListName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         color = scanFile.nextLine();
         edgeLength = Double.parseDouble(scanFile.nextLine());
         Dodecahedron dodeca = new Dodecahedron(label, color, edgeLength);
         myList.add(dodeca);
      }
      DodecahedronList dList = new DodecahedronList(dListName, myList);
      return dList;
   }
   
   /**
   *  @param lIn for length of the dodecahedron.
   *  @param cIn for the color of the dodecahedron.
   *  @param elIn for the edge length of the dodecahedron.
   */
   public void addDodecahedron(String lIn, String cIn, double elIn) {
      Dodecahedron d = new Dodecahedron(lIn, cIn, elIn);
      dodecaList.add(d);
   }
   
   /**
   *  @param label for the label of the dodecahedron.
   *  @return Dodecahedron if it exists in the list or null if it doesn't.
   */
   public Dodecahedron findDodecahedron(String label) {
      Dodecahedron result = null;
      for (int i = 0; i < dodecaList.size(); i++) {
         Dodecahedron dod = dodecaList.get(i);
         if (dod.getLabel().equalsIgnoreCase(label)) {
            result = dod;
         }
      }
      return result;
   }
   
   /**
   *  @param labelIn for the label of the dodecahedron.
   *  @return Dodecahedron if it exists and is deleted from the list
   *     or null if it doesn't.
   */
   public Dodecahedron deleteDodecahedron(String labelIn) {
      Dodecahedron result = null;
      for (int i = 0; i < dodecaList.size(); i++) {
         Dodecahedron dod = dodecaList.get(i);
         if (dod.getLabel().equalsIgnoreCase(labelIn)) {
            dodecaList.remove(i);
            result = dod;
         }
      }
      return result;
   }
   
   /**
   *  @param lIn for the label of the dodecahedron.
   *  @param cIn for the new color of the dodecahedron.
   *  @param elIn for the new length of the dodecahedron.
   *  @return True if dodecahedron was found in the list and was
   *     successfully edited. Otherwise, returns false.
   */
   public boolean editDodecahedron(String lIn, String cIn, double elIn) {
      boolean result = false;
      for (int i = 0; i < dodecaList.size(); i++) {
         Dodecahedron dod = dodecaList.get(i);
         if (dod.getLabel().equalsIgnoreCase(lIn)) {
            dod.setColor(cIn);
            dod.setEdge(elIn);
            result = true;
         }
      }
      return result;
   }
   
   
}