import java.io.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
   This program demonstrates how exception handlers can
   be used to recover from errors.
*/

public class SalesReport2
{
   public static void main(String[] args)
   {
      String filename = "SalesData.txt"; // File name
      String input;             // To hold file input
      int months = 0;           // Number of months
      double totalSales = 0.0;  // Total sales
      double averageSales;      // Average sales

      // Create a DecimalFormat object.
      DecimalFormat dollar = 
               new DecimalFormat("#,##0.00");

      // Attempt to open the file by calling the
      // openfile method.
      FileReader freader = openFile(filename);
      while (freader == null)
      {
         filename = JOptionPane.showInputDialog(
                        "ERROR: " + filename +
                        " does not exist.\n" +
                        "Enter another file name: ");
         freader = openFile(filename);
      }
      // Create a BufferedReader object for file input.
      BufferedReader inputFile = 
                     new BufferedReader(freader);

      try
      {
         // Read the contents of the file and 
         // accumulate the sales data.
         input = inputFile.readLine();
         while (input != null)
         {
            try
            {
               totalSales += Double.parseDouble(input);
               months++;
            }
            catch(NumberFormatException e)
            {
               JOptionPane.showMessageDialog(null,
                 "Non-numeric data found in the file.\n" +
                 "The invalid record will be skipped.");
            }
            input = inputFile.readLine();
         }

         // Close the file.
         inputFile.close();

         // Calculate the average.
         averageSales = totalSales / months;

         // Display the results.
         JOptionPane.showMessageDialog(null,
                         "Number of months: " + months +
                         "\nTotal Sales: $" +
                         dollar.format(totalSales) +
                         "\nAverage Sales: $" +
                         dollar.format(averageSales));
      }
       catch(IOException e)
      {
         JOptionPane.showMessageDialog(null,
                        "I/O Error: " + e.getMessage());
      }
      
      System.exit(0);
   }

   /**
      The opeFile method opens the specified file and
      returns a reference to a FileReader object.
      @param filename The name of the file to open.
      @return A FileReader reference, if the file exists
      Otherwise, null is returned.
   */

   public static FileReader openFile(String filename)
   {
      FileReader fr;

      // Attempt to open the file.
      try
      {
         fr = new FileReader(filename);
      }
      catch(FileNotFoundException e)
      {
         fr = null;
      }

      return fr;
   }
}