import java.util.Scanner;
import java.util.ArrayList;
/**
*  Driver class for Temperature.java.
*/
public class TemperatureInfo {
   /**
   *  @param args - not used.
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      
      // Prompt the user to create the list of temperatures.
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing"
            + " to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      
      Temperatures temps = new Temperatures(tempsList);
      
      // Create a menu to display temp based on user's choice.
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp,"
            + " [P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
               
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
               
            case 'P':
               System.out.println(temps);
               break;
               
            case 'E':
               System.out.println("\tDone");
               break;
               
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
      
   }
}