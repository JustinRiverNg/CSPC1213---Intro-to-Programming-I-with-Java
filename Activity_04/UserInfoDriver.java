/** 
*  Driver class for UserInfo.
*
*  Activity_04
*  @author Justin Ng - CSPC1213
*  @version 6/11/2019 
*/
public class UserInfoDriver {
   /**
   *  @param args - not used. 
   */

   public static void main(String[] args) {
   
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
      
      ArrayList<String> shapes = new ArrayList<String>();
      
      shapes.add("Circle");
      shapes.add("Square");
      shapes.add("Triangle");
      int before = shapes.indexOf("Square");
      shapes.remove(1);
      int allShapes = shapes.size();
      int after = shapes.indexOf("Circle");
   }
   }
}