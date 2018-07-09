/**
An abstract class that will hold the Options' concrete classes
@author Kyle Ligon
@version 1.0

COP5007	Project #: 4
File Name: Options.java
*/
import java.text.DecimalFormat;

public abstract class Option
{
   /**
      The option name
   */
      private String optionName;
   /**
      the price of the option
   */
      private double optionPrice;
   /**
      default constructor for option
   */
      public Option()
      {
         setOptionName("___");
         setOptionPrice(9999.99);
      }
   /**
      This constructor makes the option object that the concrete options' concrete packages will inherit
      @param optionName the name of the option
      @param optionPrice the price of the option
   */
      public Option(String optionName, double optionPrice)
      {
         setOptionName(optionName);
         setOptionPrice(optionPrice);
      }
   
   /**
      Accessor for Option Name
   */
      public String getOptionName()
      {
         return optionName;
      }
   /**
      Accessor for Option Price
   */
      public double getOptionPrice()
      {
         return optionPrice;
      }
   /**
      Mutator for Option Name
   */
      public void setOptionName(String optionName)
      {
         this.optionName = optionName;
      }
   /**
      Mutator for Option Price
   */
      public void setOptionPrice(double optionPrice)
      {
         this.optionPrice = optionPrice;
      }
   /**
      nicely formatted string for option Price
   */
      public String toString()
      {
         DecimalFormat df = new DecimalFormat("#.00");
         String words = getOptionName() + ": $" + df.format(getOptionPrice()) + ".";
         return words;
      }
}