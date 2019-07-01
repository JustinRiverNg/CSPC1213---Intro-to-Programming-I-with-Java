import java.text.DecimalFormat;
/**
*  Dodecahedron defines objects for the Dodecahedron.
*
*  Project_05
*  @author Justin Ng - CSPC1213
*  @version 6/21/2019
*
*/
public class Dodecahedron {

   // Instance Variables:
   private String label = "";
   private String color = "";
   private double edge = 0.0;
   
   // Constructor:
   /**
   *  @param labelIn takes the dodecahedron's label
   *  @param colorIn takes the dodecahedron's color
   *  @param edgeIn takes the dodecahedron's edge
   */
   public Dodecahedron(String labelIn, String colorIn, double edgeIn) {
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
   }
   
   // Methods:
   
   /**
   *  @return String representing the Dodecahedron object
   */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String output = "Dodecahedron " + "\"" + getLabel() + "\""
         + " is " + "\"" + getColor() + "\"" + " with 30 edges of length "
         + edge + " units." + "\n\t" + "surface area = " 
         + fmt.format(surfaceArea()) + " square units" + "\n\t"
         + "volume = " + fmt.format(volume()) + " cubic units" + "\n\t"
         + "surface/volume ratio = " + fmt.format(surfaceToVolumeRatio());
      return output;
   }
   
   /**
   *  @return the label of the dodecahedron
   */
   public String getLabel() {
      return label;
   }
   
   /**
   *  @param labelIn takes the dodecahedron's label
   *  @return boolean of whether the label was successfully set 
   */
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   
   /**
   *  @return the color of the dodecahedron
   */
   public String getColor() {
      return color;
   }
   
   /**
   *  @param colorIn takes the dodecahedron's color
   *  @return boolean of whether the color was successfully set
   */
   public boolean setColor(String colorIn) {
      boolean isSet = false;
      if (colorIn != null) {
         color = colorIn.trim();
         isSet = true;
      }
      return isSet;
   }
   
   /**
   *  @return the edge of the dodecahedron
   */
   public double getEdge() {
      return edge;
   }
   
   /**
   *  @param edgeIn takes the edge of the dodecahedron
   *  @return boolean of whether the edge was successfully set
   */
   public boolean setEdge(double edgeIn) {
      boolean isSet = false;
      if (edgeIn > 0) {
         edge = edgeIn;
         isSet = true;
      }
      return isSet;
   }
 
   /**
   *  @return double of the total surface area of the dodecahedron
   */
   public double surfaceArea() {
      return (3 * Math.pow(edge, 2) * Math.sqrt(25 + (10 * Math.sqrt(5))));
   }
   
   /**
   *  @return double of the volume of the of the dodecahedron
   */
   public double volume() {
      return ((15 + 7 * Math.sqrt(5)) * Math.pow(edge, 3)) / 4;
   }
   
   /**
   *  @return double the surface area to volume ratio
   */
   public double surfaceToVolumeRatio() {
      return surfaceArea() / volume();
   }
   
}