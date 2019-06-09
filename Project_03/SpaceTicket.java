import java.util.Scanner;
import java.util.Random;
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
public class SpaceTicket {
   static final double STUDENT_DISCOUNT = .25;
   static final double CHILD_DISCOUNT = .35;
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
      Random generator = new Random();
      DecimalFormat fmt = new DecimalFormat("###,###.00");
      String ticket = "";
      String price = "";
      char category;
      String date = "";
      String time = "";
      String seat = "";
      String ticketDescription = "";
      double ticketPrice;
      double cost;
      int prizeNumber = generator.nextInt(999999) + 1;
      
      
      // Get user input
      System.out.print("Enter ticket code: ");
      ticket = scan.nextLine();
      ticket = ticket.trim();
      System.out.println("");
      
      // Ticket is invalid
      if (ticket.length() < 25) {
         System.out.println("*** Invalid ticket code ***");
         System.out.print("Ticket code must have at least "
            + "25 characters.");
      }
            
      // Ticket is valid
      if (ticket.length() >= 25) {
      
         // Extract values with substring method
         price = ticket.substring(0, 7); // Price
         ticketPrice = Double.parseDouble(price);
         category = ticket.charAt(8); // Category
         time = ticket.substring(9, 13); // Time
         date = ticket.substring(13, 21); // Date
         seat = ticket.substring(21, 24); // Seat
         ticketDescription = ticket.substring(24); // Description
         cost = ticketPrice; // Cost of ticket
      
         // Calculate the cost of the ticket
         if (category == 's' || category == 'S') {
            cost = ticketPrice - (ticketPrice * STUDENT_DISCOUNT);
         }
      
         if (category == 'c' || category == 'C') {
            cost = ticketPrice - (ticketPrice * CHILD_DISCOUNT);
         }
      
         System.out.println("Space Ticket: " + ticketDescription);
         System.out.println("Date: " + date.substring(0, 2) + "/"
            + date.substring(2, 4) + "/" + date.substring(4)
            + "   Time: " + time.substring(0, 2) + ":"
            + time.substring(2) 
            + "   Seat: " + seat);
         System.out.println("Price: $" + fmt.format(ticketPrice)
            + "   Category: " + category
            + "   Cost: $" + fmt.format(cost));
         System.out.printf("Prize Number: %06d", prizeNumber);
      
      }
   }
}