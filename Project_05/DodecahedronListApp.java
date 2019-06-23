import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 *  Driver class for the DodecahedronListApp.
 */
public class DodecahedronListApp {
   /**
   *  @param args - not used.
   *  @throws FileNotFoundException from scanning input file.
   */
   public static void main(String[] args) throws FileNotFoundException {
      ArrayList<Dodecahedron> dList = new ArrayList<Dodecahedron>();
      Scanner scan = new Scanner(System.in);
      String fileName;
      String listName;
      String label = "";
      String color = "";
      double edgeLength;
   
      System.out.print("Enter file name: ");
      String txtFileName = scan.nextLine();
      System.out.println();
   
      Scanner scanFile = new Scanner(new File(txtFileName));
   
      listName = scanFile.nextLine();
   
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         color = scanFile.nextLine();
         edgeLength = Double.parseDouble(scanFile.nextLine());
         
         Dodecahedron dodeca = new Dodecahedron(label, color, edgeLength);
         dList.add(dodeca);
      }
      DodecahedronList listOfDodecas = new DodecahedronList(listName, dList);
      
      System.out.println(listOfDodecas);
      DecimalFormat df = new DecimalFormat("#,##0.##");
      System.out.print(listOfDodecas.summaryInfo());
      
   }
   
}