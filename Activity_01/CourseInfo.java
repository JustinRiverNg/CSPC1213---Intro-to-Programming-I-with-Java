/**
 * Prints a description of the course. 
 *
 * @author Justin Ng
 * @version 5/21/2019
 */
import java.util.Random;
import java.text.DecimalFormat;
public class CourseInfo {
   /**
    * Prints course information to std output.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
     
      // print course description
      System.out.println("This course provides an"
         + " introduction to Java and ");
      System.out.println("object-oriented programming.");
      System.out.println();
      // print more course description
      System.out.println("The course also introduces"
         + " the basics of software development.");
      Random generator = new Random();
      int randomNum1;
      randomNum1 = generator.nextInt(5);
      System.out.println(randomNum1);
      
      double x = 8.765555;
      DecimalFormat form = new
         DecimalFormat("00.0#");
      System.out.print(form.format(x));
      
      String moon = "Europa";
      char myChar = moon.charAt(3);
      System.out.println(myChar);
      String planet = "Jupiter";
      String join = " and ";
      String phrase = (moon.concat(join)).concat(planet);
      char myChars = moon.charAt(3);
      System.out.print(phrase);
   }
}