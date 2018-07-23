/**
Home Class that makes the cat, type, avg monthly cost, and cost per unit for kwh

@author Kyle Ligon
@version 1.0
@filename Home.java

*/
import java.text.DecimalFormat;

public class Home implements CarbonFootprint
{
/**
   the category of the homeclass
*/
   private String category;
/**
   the type of fuel
*/
   private String typeOfFuel;
/**
   the average monthly cost for the home class
*/
   private double avgMonthlyCost;
/**
   the cost per unit regardless of a fuel type and home type
*/
   private double costPerUnit;
/**
   the factor to use for emissions
*/
   private double EMISSION_FACTOR;
/**
   the months in a year
*/
   private final static int MONTHS_IN_YEAR = 12; 
/**
   the default constructor of the House class
*/
   public Home()
   {
      setCategory("Error");
      setTypeOfFuel("Error");
      setAvgMonthlyCost(9999.99);
      setCostPerUnit(9999.99);
   }
/**
   the parameterized constructor of the House object
   @param category the category of house we are calculating a carbon footprint for
   @param typeOfFuel the type of fuel used to hear the house
   @param avgMonthlyCost the average monthly cost of the house
   @param costPerUnit the cost by unit of fuel used to head the house
*/
   public Home(String category, String typeOfFuel, double avgMonthlyCost, double costPerUnit)
   {
      setCategory(category);
      setTypeOfFuel(typeOfFuel);
      setAvgMonthlyCost(avgMonthlyCost);
      setCostPerUnit(costPerUnit);
      setEmFact(typeOfFuel);
   }
/**
   the accessor of the category variable
   @return category the category of house we are calculating a carbon footprint for
*/
   public String getCategory()
   {
      return category;
   }
/**
   the mutator of the Category variable
   @param category the type of home
*/ 
   public void setCategory(String category)
   {
      this.category = category;
   }
/**
   the accessor of the typeOfFuel variable
   @return typeOfFuel the type of fuel used to hear the house
*/
   public String getTypeOfFuel()
   {
      return typeOfFuel;
   }   
/**
   the mutator of the typeOfFuel variable
   @param  typeOfFuel the type of fuel used to hear the house
*/ 
   public void setTypeOfFuel(String typeOfFuel)
   {
      this.typeOfFuel = typeOfFuel;
   }
/**
   the accessor of the AvgMonthlyCost variable
   @return avgMonthlyCost avgMonthlyCost the average monthly cost of the house
*/
   public double getAvgMonthlyCost()
   {
      return avgMonthlyCost;
   }    
/**
   the mutator of the AvgMonthlyCost variable
   @return avgMonthlyCost avgMonthlyCost the average monthly cost of the house
*/
   public void setAvgMonthlyCost(double avgMonthlyCost)
   {
      this.avgMonthlyCost = avgMonthlyCost;
   }  
/**
   the accessor of the AvgMonthlyCost variable
   @return costPerUnit the cost by unit of fuel used to head the house
*/
   public double getCostPerUnit()
   {
      return costPerUnit;
   }
/**
   the mutator of the AvgMonthlyCost variable
   @return costPerUnit the cost by unit of fuel used to head the house
*/
   public void setCostPerUnit(double costPerUnit)
   {
      this.costPerUnit = costPerUnit;
   }
/**
   the calculator for emission factor based on the type of Fuel in the House
   @param category the category of the type of house
   @return EMISSION_FACTOR the multiplier for 
*/
   public void setEmFact(String category)
   {
      if(category.equals("Electricity"))
      {
         this.EMISSION_FACTOR = 1.37;
      }
      else if(category.equals("Natural Gas"))
      {
         this.EMISSION_FACTOR = 120.61;
      }
      else if(category.equals("Fuel Oil"))
      {
         this.EMISSION_FACTOR = 22.37;
      }
      else if(category.equals("Propane"))
      {
         this.EMISSION_FACTOR = 12.17;
      }
      else
      {
         this.EMISSION_FACTOR = 9999.99;
      }
   }
/**
   the calculator for CarbonFootprint
*/
   @Override
   public double getCarbonFootprint()
   {
      double carbonFootprint = (this.getAvgMonthlyCost() / this.costPerUnit) * MONTHS_IN_YEAR * this.EMISSION_FACTOR;
      return carbonFootprint;
   }

/**
   nicely formatted string for the House class
   @return words a nicely formatted string
*/
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("#.00");
      String words = "My " + getCategory() + "'s carbon footprint is " + 
      String.valueOf(df.format(getCarbonFootprint()));
      return words;
   }
}
