import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TextFileDemo2
{
   public static void main(String[] args)
   {
      Scanner fileIn = null;  // Initializes fileIn to an empty object
      try
      {
      // Attempt to open the file
         FileInputStream file = new FileInputStream("player1.txt");
         fileIn = new Scanner(file);
      }
      catch (FileNotFoundException e)
      {
         // If the file could not be found, this code is executed
         // and then the program exits
         System.out.println("File not found.");
         System.exit(0);
      }
   
   // If the program gets here then
   // the file was opened successfully
      int highscore;
      String name;
      fileIn.useDelimiter(",");
   
      System.out.println("Text left to read? " + fileIn.hasNextLine());
      highscore = fileIn.nextInt();
      name = fileIn.next();
   
      System.out.println("Name: " + name);
      System.out.println("High score: " + highscore);
      System.out.println("Text left to read? " + fileIn.hasNextLine());
   
      fileIn.close();
   }
}