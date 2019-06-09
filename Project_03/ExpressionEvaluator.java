import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Uses the Scanner and DecimalFormat class to perform
 * specific calculations on a user's input value and reformats
 * the result.
 *
 *
 * Project 3
 * @author Justin Ng - CPSC1323
 * @version 6/8/2019
 *
 */
public class ExpressionEvaluator {
/**
 *
 * This program reads a user's input for an x value,
 * performs a calculation on that value,
 * and displays the result along with specifics about
 * the format of that result.
 *
 * @param args Command line arguments - not used.
 *
 */
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      DecimalFormat fmt = new DecimalFormat("#,##0.0####");
      double userValue;
      double numerator;
      double denominator;
      double result;
      String stringResult = "";
      int decimalSpot;
      int leftDigits;
      int rightDigits;
      
      // Get user input for x-value, then perform calculations
      System.out.print("Enter a value for x: ");
      userValue = scan.nextDouble();
      numerator = Math.pow((3 * Math.pow(userValue, 5)) 
         - (2 * Math.pow(userValue, 3)), 2);
      denominator = Math.sqrt(Math.abs(16 * Math.pow(userValue, 7))) + 1;
      result = numerator / denominator;
      System.out.println("Result: " + result);
      
      // Convert the result to a string and display the number
      // of digits to the left and right of the decimal
      stringResult = Double.toString(result);
      decimalSpot = stringResult.indexOf('.');
      leftDigits = decimalSpot;
      rightDigits = stringResult.length() - decimalSpot - 1;
      System.out.println("# digits to left of decimal point: "
         + leftDigits);
      System.out.println("# digits to right of decimal point: "
         + rightDigits);
      
      // Reformat the result and display it
      // System.out.println("# digits to left of decimal point:" + );
      System.out.println("Formatted Result: " + fmt.format(result));
   }
}