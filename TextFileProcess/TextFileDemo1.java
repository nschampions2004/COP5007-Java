   import java.util.Scanner;
   import java.io.FileInputStream;
   import java.io.FileNotFoundException;  
	
	public class TextFileDemo1
   {
      public static void main(String[] args)
      {
       
      	
         Scanner fileIn = null;  // Initializes fileIn to an empty object
         try
         {
         // Attempt to open the file
            FileInputStream file = new FileInputStream("questions.dat");
            fileIn = new Scanner(file);
         }
            catch (FileNotFoundException e)
            {
            // If the file could not be found, this code is executed
            // and then the program exits
               System.out.println("File not found.");
               System.exit(0);
            }
      		String line = "";
				while(fileIn.hasNextLine())
				{
				line = fileIn.nextLine();
				System.out.println(line);
				}

      		
      }
   			
   			
   }
