import java.util.Scanner;
 /**
 * Program that displays someone's information.
 * This program asks for someone's name, age, and gender, 
 * then displays that information with calcuations.
 *
 * Activity 2
 * @author Justin Ng - CPSC1323
 * @version 5/29/2019
 */
public class AgeStatistics {
/**
 * Scans for user information and performs calculations.
 * @param args Command line arguments - not used.
 */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //Prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //Prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      //Perform calculations for age in minutes, then print:
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
         
      //Perform calculations for age in centuries, then print:
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
         
      //Display max heart rate:
      System.out.print("Your max heart rate is ");
      
      if (gender == 1) { //Calculate female MHR
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      else { //Calculate male MHR
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      
      System.out.println(maxHeartRate + " beats per minute.");
   }
}