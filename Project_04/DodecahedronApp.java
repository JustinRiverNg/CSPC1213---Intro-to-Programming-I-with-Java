import java.util.Scanner;
/**
 * Driver class for Dodecahedron.
 *
 * Project_04
 * @author Justin Ng - CSPC3243
 * @version 6/14/2019
 *
 */
public class DodecahedronApp {
    /**
    *  @param args - not used.
    */
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
     
      String userLabel;
      String userColor;
      String userEdge;
     
      System.out.println("Enter label, color, and edge length "
         + "for a dodecahedron.");
      System.out.print("\t" + "label: ");
      userLabel = scan.nextLine();   
      System.out.print("\t" + "color: ");
      userColor = scan.nextLine();
      System.out.print("\t" + "edge: ");
      userEdge = scan.nextLine();
     
      if (Double.parseDouble(userEdge) <= 0) {
         System.out.println("Error: edge must be greater than 0.");
         return;
      }
      else {
         Dodecahedron dodecahedron1 = new Dodecahedron(userLabel, userColor, 
            Double.parseDouble(userEdge));
         System.out.println("\n" + dodecahedron1);
      }
      
   }
}