import java.util.Scanner;

public class CaptionPeriod {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userCaption;
      int lastIndex;
      char lastChar;

      System.out.print("Enter a caption: ");
      userCaption = scnr.nextLine();

      lastIndex = userCaption.length() - 1;
      lastChar  = userCaption.charAt(lastIndex);

      if ( (lastChar != '.') && (lastChar != '!') && (lastChar != '?') ) {
         // User's caption lacked ending punctuation, so add a period
         userCaption = userCaption + ".";
      }
     
      System.out.println("New: " + userCaption);
   }
}