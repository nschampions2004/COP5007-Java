import java.io.*;               // For file I/O classes
import javax.swing.JOptionPane; // For JOptionPane class

/**
   This program demonstrates how the default error
   message can be retrieved from an exception object.
*/

public class ExceptionMessage
{
   public static void main(String[] args)
   {
      FileReader freader;       // For file input
      BufferedReader inputFile; // For file input
      String fileName;          // To hold a file name

      // Get a file name from the user.
      fileName = JOptionPane.showInputDialog("Enter " +
                                "the name of a file:");

      // Attempt to open the file.
      try
      {
         freader = new FileReader(fileName);
         inputFile = new BufferedReader(freader);
         JOptionPane.showMessageDialog(null, 
                          "The file was found.");
      }
      catch (FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null, 
                             e.getMessage());
      }
      
      JOptionPane.showMessageDialog(null, "Done.");
      System.exit(0);
   }
}