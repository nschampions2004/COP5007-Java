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
   
   
   //go to open the file
   System.out.println("\nAttempting to open dataReadIn.txt... \n");
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
      inFS.useDelimiter("\\|");
      if(objectType.equals("Food"))
      {
         String foodName = inFS.next();
         double foodPrice = Double.valueOf(inFS.next());
         String foodCategory = inFS.next();
         CarbonFootprint tempFood = new Food(foodName, foodPrice, foodCategory);
         carbonStorage.add(tempFood);
      }
      else if (objectType.equals("Vehicle"))
      {
         String vehicleMake = inFS.next();
         String vehicleModel = inFS.next();
         String vehicleYear = inFS.next();
         double vehicleNumMiPerWeek = Double.valueOf(inFS.next());
         int vehicleFuelEffMPG = Integer.valueOf(inFS.next());
         CarbonFootprint tempVehicle = new Vehicle(vehicleMake, vehicleModel, vehicleYear, vehicleNumMiPerWeek, vehicleFuelEffMPG);
         carbonStorage.add(tempVehicle);
      }
      else if (objectType.equals("Home"))
      {
         String homeCategory = inFS.next();
         String homeTypeOfFuel = inFS.next();
         double homeAvgMonthlyCost = Double.valueOf(inFS.next());
         double homeCostPerUnit = Double.valueOf(inFS.next());
         CarbonFootprint tempHome = new Home(homeCategory, homeTypeOfFuel, homeAvgMonthlyCost, homeCostPerUnit);
         carbonStorage.add(tempHome);
      }
   }
   
   //finished reading the file, output the results
   for(int i = 0; i < carbonStorage.size(); i++)
   {
      System.out.println(carbonStorage.get(i).toString());
   }
   System.out.println("\nClosing the file...");
   
 }
}
