import java.util.Scanner;
 /**
 * This program takes a dollar amount and demoniates
 * it into twenties, tens, fives, and ones.
 *
 * Project 2
 * @author Justin Ng - CPSC1323
 * @version 6/1/2019
 *
 */
public class ATM {
 /**
 *
 * Scans for user's dollar amount and
 * denominates that amount into twenties, tens,
 * fives, and ones.
 *
 * @param args Command line arguments - not used.
 *
 */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int amount = 0;
      int remainder = 0;
      int twenties = 0;
      int tens = 0;
      int fives = 0;
      int ones = 0;
      
      //Prompt the user for the dollar amount:
      System.out.print("Enter the amount: ");
      amount = userInput.nextInt();
      
      //Display limit error if $500 is exceeded:
      if (amount > 500) {
         System.out.println("Limit of $500 exceeded!");
      }
      else {
      //Denominate the userInput into smaller amounts:
         if (amount >= 20) {
            twenties = amount / 20;
            remainder = amount % 20;
         }
      
         if (remainder >= 10) {
            tens = remainder / 10;
            remainder %= 10;
         }
      
         if (remainder >= 5) {
            fives = remainder / 5;
            remainder %= 5;
         }
      
         if (remainder >= 1) {
            ones = remainder / 1;
            remainder %= 1;
         }
         
         //Display the bills by denomination:
         System.out.println("Bills by denomination:");
         System.out.println("\t$20: " + twenties);
         System.out.println("\t$10: " + tens);
         System.out.println("\t$5: " + fives);
         System.out.println("\t$1: " + ones);
      
         //Display the bills by denomination calculation:
         System.out.print("$" + amount + " = (" + twenties
            + " * $20) + (" + tens + " * $10) + (" + fives
            + " * $5) + (" + ones + " * $1)");
      }
   }
}