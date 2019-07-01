public class PracticeFile {
   public static void main(String[] args) {
      int i = 0, x = 0, y = 0;
      do {
         switch(y) {
            case 1:
               y++;
            case 2:
               x++;
            default: 
               x += 2;
               y++;
         }
         i++;
      } while (i < 3);
      System.out.println(x);
      System.out.println(y);
   }
}