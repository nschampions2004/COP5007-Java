/**
Vehicle Class that makes the type, number of miles driven per week, and fuel efficiency in mpg

@author Kyle Ligon
@version 1.0
@filename Food.java

*/
import java.text.DecimalFormat;

public class Food implements CarbonFootprint
{
/**
   the name of the food item
*/
   private String name;
/**
   dollars spent on food
*/
   private double dollars;
/**
   the category of food
*/
   private String category;
/**
   the emission factor for the Carbon Footprint calculator
*/
   private int EMISSION_FACTOR;
/**
   the gram to pound conversion
*/
   private static final double GRAM_TO_LB_CONVERSION = 0.0022;
/**
   the number of months in a year
*/
   private static final int MONTHS_IN_YEAR = 12;

/**
   the default constructor for our Food object
*/
   public Food()
   {
      setName("Error");
      setDollars(9999.99);
      setCategory("Error");
   }
/**
   the parameterized constructor for the out Food Class
   @param name the name of the food
   @param dollars the dollars spent on food
   @param category the category of the food
*/
   public Food(String name, double dollars, String category)
   {
      setName(name);
      setDollars(dollars);
      setCategory(category);
      setEmFact(category);
   }
   
/**
   the accessor for the name of the Food
   @return name the name of the food
*/
   public String getName()
   {
      return name;
   }
/**
   the mutator for the name of the Food
   @param name the name of the food
*/
   public void setName(String name)
   {
      this.name = name;
   }
/**
   the accessor for the dollars spent on the Food
   @return dollars the dollars spend on food
*/
   public double getDollars()
   {
      return dollars;
   }
/**
   the mutator for the dollars spent on the Food
   @param dollars the dollars spend on food
*/
   public void setDollars(double dollars)
   {
      this.dollars = dollars;
   }
/**
   the accessor for the category of the Food
   @return category the category the food falls under
*/
   public String getCategory()
   {
      return category;
   }
/**
   the mutator for the category of the Food
   @param category the category the food falls under 
*/
   public void setCategory(String category)
   {
      this.category = category;
   }
/**
   the calculator for emission factor based on the type of Food
   @param category the category of the type of food
   
*/
   public void setEmFact(String category)
   {
      if(category.equals("Meat, fish, & eggs"))
      {
         this.EMISSION_FACTOR = 1452;
      }
      else if(category.equals("Cereals & Bakery Products"))
      {
         this.EMISSION_FACTOR = 741;
      }
      else if(category.equals("Dairy"))
      {
         this.EMISSION_FACTOR = 1911;
      }
      else if(category.equals("Fruits & vegetables"))
      {
         this.EMISSION_FACTOR = 1176;
      }
      else if(category.equals("Eating out"))
      {
         this.EMISSION_FACTOR = 368;
      }
      else if(category.equals("Other foods"))
      {
         this.EMISSION_FACTOR = 467;
      }
      else
      {
         this.EMISSION_FACTOR = 9999;
      }
   }

/**
   the calculator for CarbonFootprint
*/
   @Override
   public double getCarbonFootprint()
   {
      double carbonFootprint = (getDollars() * this.EMISSION_FACTOR) * MONTHS_IN_YEAR * GRAM_TO_LB_CONVERSION;
      return carbonFootprint;
   }

/**
   nicely formatted string for the House class
   @return words a nicely formatted string
*/
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("#0.00");
      String words = "A(n) " + getName() + "'s carbon footprint is " + 
      String.valueOf(df.format(getCarbonFootprint())  + " lbs a year");
      return words;
   }

}