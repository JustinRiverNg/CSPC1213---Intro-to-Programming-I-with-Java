import java.util.Scanner;
 /**
 * This program performs a calculation using 3 user-inputted values.
 *
 * Project 2
 * @author Justin Ng - CPSC1323
 * @version 6/1/2019
 *
 */
public class FormulaCalculator {
/**
 *
 * Scans for user's input values for x, y and z.
 * Then, calculates a result based on a formula and
 * displays that result.
 *
 * @param args Command line arguments - not used.
 *
 */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double xValue = 0;
      double yValue = 0;
      double zValue = 0;
      double result = 0;
      
      //Display formula:
      System.out.println("result = (2x - 7.4) (4y + 9.3)"
         + " (6z - 11.2) / xyz");
         
      //Get user input for x, y, and z:
      System.out.print("\tEnter x: ");
      xValue = userInput.nextDouble();
      System.out.print("\tEnter y: ");
      yValue = userInput.nextDouble();
      System.out.print("\tEnter z: ");
      zValue = userInput.nextDouble();
      
      //Use an if to determine if a value is 0:
      if (xValue == 0 || yValue == 0 || zValue == 0) {
         System.out.println("result = 0.0");
      }
      else {
      
         //Perform the calculation:
         result = (2 * xValue - 7.4) * (4 * yValue + 9.3)
            * (6 * zValue - 11.2) / (xValue * yValue * zValue);
         System.out.println("result = " + result);
      }
   }
}
