/**
main method for 2 things:
   1) reading in the data and setting the different class objects
   2) generate the carbon footprint of the ArrayList

@author Kyle Ligon
@version 1.0
@filename CarbonFootprint.java
*/
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class CarbonTester
{
   public static void main (String[] args)
      throws FieldOutOfBounds
   {
   //general testing
   
   //setting the first Home object
   CarbonFootprint newHome = new Home("Condo", "Natural Gas", 130.11, 0.65);
   System.out.println(newHome.toString());
   
   //setting the Transportation object
   CarbonFootprint newVehicle = new Vehicle("Toyota", "Corolla", "2017", 360, 36);
   System.out.println(newVehicle.toString());
   
   //setting the Food object
   CarbonFootprint newFood = new Food("Apple", 3.99, "Fruits & vegetables");
   System.out.println(newFood.toString());
   
   //defining the Array List of CarbonFootprint Objects
   ArrayList<CarbonFootprint> carbonStorage = new ArrayList<CarbonFootprint>();
   
   //set up connection to data.text
   FileInputStream fileByteStream = null;
   Scanner inFS = null;
   int scoreNum = 0;
   String objectType = "";
   inFS.useDelimeter("|");
   
   //go to open the file
   System.out.println("Attempting to open dataReadIn.txt...");
   try
   {   
      fileByteStream = new FileInputStream("dataReadIn.txt");
      inFS = new Scanner(fileByteStream);
   }
   catch (Exception FieldOutOfBounds)
   {
      System.out.println("The specified file was not found.");
      System.exit(0);
   }
   
   //loop through till no next line
   while(inFS.hasNextLine())
   {
      //get the type of object to create to add to the ArrayList of CarbonFootprints
      objectType = inFS.nextLine();
      if(objectType.equals("Food"))
      {
      
      }
      else if (objectType.equals("Vehicle"))
      {
      //add stuff
      }
      else if (objectType.equals("Home"))
      {
      //add stuff
      }
      else
      {
         throw new FieldOutOfBounds
            ("Illegal Object Entered");
      }
   }
   
   //finished reading the file, output the results
   for(int i = 0; i < carbonStorage.size(); i++)
   {
      System.out.println(carbonStorgage.get(i).toString());
   }
 }
}
