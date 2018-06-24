import java.io.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
   This program demonstrates how multiple exceptions can
   be caught with one try statement.
*/

public class SalesReport
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

      try
      {
         FileReader freader = 
                    new FileReader(filename);
         BufferedReader inputFile = 
                    new BufferedReader(freader);

         // Read the contents of the file and 
         // accumulate the sales data.
         input = inputFile.readLine();
         while (input != null)
         {
            months++;
            totalSales += Double.parseDouble(input);
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
      catch(FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null,
                            "The file " + filename +
                            " does not exist.");
      }
      catch(IOException e)
      {
         JOptionPane.showMessageDialog(null,
                            "I/O Error: " +
                            e.getMessage());
      }
      catch(NumberFormatException e)
      {
         JOptionPane.showMessageDialog(null,
                      "Non-numeric data found " +
                      "in the file.");
      }
      
      System.exit(0);
   }
}