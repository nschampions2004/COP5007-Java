/**
Vehicle Class that makes the type, number of miles driven per week, and fuel efficiency in mpg

@author Kyle Ligon
@version 1.0
@filename Vehicle.java
*/

import java.text.DecimalFormat;
public class Vehicle implements CarbonFootprint
{
/**
   the String defining the make of the vehicle
*/
   private String make;
/**
   the String defining the model of the vehicle
*/
   private String model;
/**
   the String defining the year of the vehicle
*/
   private String year;
/**
   the double representing the number of miles driven per week
*/
   private double numMiPerWk;
/**
   the integer representing the fuel efficiency in miles per gallon
*/
   private int fuelEffMPG;
/**
   the carbon footprint double to be returned
*/
   public double carbonFootprint;
/**
   the number of weeks in a year
*/
   private static final int NUM_WK_YR = 52;
/**
   the number of pounds of CO2 emitted per gallon
*/
   private static final double CO2_EMIT_PER_GAL = 19.4;
/**
   the emissions of greenhouse gases other than CO2
*/ 
   private static final double EMISSION_OTHER_GASSES = 100 / 95;
/**
   the default object for vehicle
*/
   public Vehicle()
   {
      setMake("Error");
      setModel("Error");
      setYear("Error");
      setNumMiPerWk(9999.99);
      setFuelEffMPG(9999);
   }
/**
   the paramterized Vehicle object
   @param make the make String to set the Vehicle class to
   @param model the model String to set the Vehicle class to
   @param year the year String to set the Vehicle class to
   @param numMiPerWeek the number of Miles per week 
   @param fuelEffMPG the fuel efficiency in miles per gallon
*/
   public Vehicle(String make, String model, String year, double numMiPerWeek, int fuelEffMPG)
   {
      setMake(make);
      setModel(model);
      setYear(year);
      setNumMiPerWk(numMiPerWeek);
      setFuelEffMPG(fuelEffMPG);
   }
/**
   the accessor for make
   @return make the make of the vehicle
*/
   public String getMake()
   {
      return make;
   }
/**
   the mutator for make
   @param make the make of the vehicle
*/
   public void setMake(String make)
   {
      this.make = make;
   }
/**
   the accessor for model
   @return model the model of the vehicle
*/
   public String getModel()
   {
      return model;
   }
/**
   the accessor for model
   @param model the model of the vehicle
*/
   public void setModel(String model)
   {
      this.model = model;
   }
/**
   the accessor for year
   @return year the year of the vehicle
*/
   public String getYear()
   {
      return year;
   }
/**
   the mutator for year
   @param year the year of the vehicle
*/
   public void setYear(String year)
   {
      this.year = year;
   }

/**
   the accessor for Number of Miles Per Week
   @return numMiPerWeek the number of miles per week
*/
   public double getNumMiPerWk()
   {
      return numMiPerWk;
   }
/**
   the mutator for Number of Miles Per Week
   @param numMiPerWk the number of miles per week
*/
   public void setNumMiPerWk(double numMiPerWk)
   {
      this.numMiPerWk = numMiPerWk;
   }
/**
   the accessor for the fuel efficiency in miles per gallon
   @return fuelEffMPG the fuel efficiency per gallon
*/
   public int getFuelEffMPG()
   {
      return fuelEffMPG;
   }
/**
   the mutator for the fuel efficiency in miles per gallon
   @param fuelEffMPG the fuel efficiency per gallon
*/
   public void setFuelEffMPG(int fuelEffMPG)
   {
      this.fuelEffMPG = fuelEffMPG;
   }
/**
   the overriden calculator for CarbonFootprint
*/
   @Override
   public double getCarbonFootprint()
   {
      double carbonFootprint = ((getNumMiPerWk() * NUM_WK_YR) / getFuelEffMPG()) * CO2_EMIT_PER_GAL * EMISSION_OTHER_GASSES;
      return carbonFootprint;
   }
/**
   nicely formatted string for the Vehicle class
   @return words a nicely formatted string
*/
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("#.00");
      String words = "My " + getYear() + " " + getMake() + " " + getModel() + 
      "'s carbon footprint is " + String.valueOf(df.format(getCarbonFootprint())
       + " lbs a year");
      return words;
   }

}

  