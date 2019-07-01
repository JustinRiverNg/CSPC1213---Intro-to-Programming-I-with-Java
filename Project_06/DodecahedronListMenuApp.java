import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
*  Driver class for the DodecahedronListMenu class.
*/
public class DodecahedronListMenuApp {
   /**
   *  @param args - not used.
   *  @throws FileNotFoundException if the file cannot be opened.
   */
   public static void main(String[] args) throws FileNotFoundException {
      Scanner scan = new Scanner(System.in);
      String code = "";
      String dListName = "no list name";
      String fileName = "no file name";
      ArrayList<Dodecahedron> dodecaList = new ArrayList<Dodecahedron>();
      DodecahedronList myDList = new DodecahedronList(dListName, dodecaList);
      String dLabel;
      String dColor;
      String labelIn;
      double dEdge = 0.0;
      String colorIn;
      double edgeIn;
      
      // Print the menu:
      System.out.println("Dodecahedron List System Menu\n"
         + "R - Read File and Create Dodecahedron List\n"
         + "P - Print Dodecahedron List\n"
         + "S - Print Summary\n"
         + "A - Add Dodecahedron\n"
         + "D - Delete Dodecahedron\n"
         + "F - Find Dodecahedron\n"
         + "E - Edit Dodecahedron\n"
         + "Q - Quit\n");
      // Main Do-While Loop:
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R': // Read file and create a DodecahedronList:
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
               myDList = myDList.readFile(fileName);
               System.out.println("\tFile read in and "
                  + "Dodecahedron List created\n");
               break;
               
            case 'P': // Print DodecahedronList:
               System.out.print(myDList);
               break;
               
            case 'S': // Print the Summary of the DodecahedronList:
               System.out.print("\n" + myDList.summaryInfo() + "\n");
               break;
               
            case 'A': // Add the dodecahedron to the list of Dodecahedrons:
               System.out.print("\tLabel: ");
               dLabel = scan.nextLine();
               System.out.print("\tColor: ");
               dColor = scan.nextLine();
               System.out.print("\tEdge: ");
               dEdge = Double.parseDouble(scan.nextLine());
               myDList.addDodecahedron(dLabel, dColor, dEdge);
               System.out.println("*** Dodecahedron added ***");
               break;
               
            case 'D': // Delete the dodecahedron from the list of
               // Dodecahedrons:
               System.out.print("\tLabel: ");
               labelIn = scan.nextLine();
               if (myDList.deleteDodecahedron(labelIn) == null) {
                  System.out.println("\t\"" + labelIn + "\" not found");
               } 
               else {
                  System.out.println("\t\"" + labelIn + "\" deleted");
               }
               break;
               
            case 'F': // Find the dodecahedron from the list of Dodecahedrons:
               System.out.print("\tLabel: ");
               labelIn = scan.nextLine();
               if (myDList.findDodecahedron(labelIn) == null) {
                  System.out.println("\t\"" + labelIn + "\" not found");
               }
               else {
                  System.out.println(""
                     + myDList.findDodecahedron(labelIn).toString()
                     + "\n");
               }
               break;
            
            case 'E': // Edit the dodecahedron from the list of Dodecahedrons:
               System.out.print("\tLabel: ");
               labelIn = scan.nextLine();
               System.out.print("\tColor: ");
               colorIn = scan.nextLine();
               System.out.print("\tEdge: ");
               edgeIn = Double.parseDouble(scan.nextLine());
               if (myDList.findDodecahedron(labelIn) == null) {
                  System.out.println("\t\"" + labelIn + "\" not found");
               }
               else {
                  myDList.editDodecahedron(labelIn, colorIn, edgeIn);
                  System.out.println("\t\"" + labelIn + "\" successfully"
                     + " edited");
               }
               break;
               
            case 'Q': // Quit the menu:
               break;
            
            default: // No match, repeat loop:
               System.out.println("\t*** invalid code ***");
         }
         
      } while (!code.equalsIgnoreCase("Q"));
         
         
   }
}