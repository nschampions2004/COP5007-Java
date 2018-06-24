import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TextFileDemo
{
   public static void main(String[] args)
   {
      Scanner fileIn = null;  // Initializes fileIn to an empty object
      try
      {
         // Attempt to open the file
         FileInputStream file = new FileInputStream("data.txt");
         fileIn = new Scanner(file);
      }
      catch (FileNotFoundException e)
      {
         System.out.println("File not found.");
         System.exit(0);
      }
      
      int numOfScores = 0;
      String typeScore = "";
      String playerCourse = "";
      String scoreData = "";
      
      while(fileIn.hasNextLine())
      {
         numOfScores = fileIn.nextInt();
         fileIn.nextLine();
         typeScore = fileIn.nextLine();
         playerCourse = fileIn.nextLine();
         System.out.println("There are " + numOfScores + " " + typeScore + " for " + playerCourse);
         System.out.println("The scores are: ");
         for (int i = 0; i < numOfScores; i++)
         {
            scoreData = fileIn.nextLine();
            System.out.println(scoreData);
         }
      }      
      fileIn.close();
   }
}