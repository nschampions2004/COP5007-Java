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
      @return optionName the name of the Option
   */
      public String getOptionName()
      {
         return optionName;
      }
   /**
      Accessor for Option Price
      @return optionPrice the price of the Option
   */
      public double getOptionPrice()
      {
         return optionPrice;
      }
   /**
      Mutator for Option Name
      @param optionName the name of the option
   */
      public void setOptionName(String optionName)
      {
         this.optionName = optionName;
      }
   /**
      Mutator for Option Price
      @param optionPrice the price of the option
   */
      public void setOptionPrice(double optionPrice)
      {
         this.optionPrice = optionPrice;
      }
   /**
      nicely formatted string for option Price
      @return words the nicely formatted string of the Option object
   */
      public String toString()
      {
         DecimalFormat df = new DecimalFormat("#.00");
         String words = getOptionName() + ": $" + df.format(getOptionPrice()) + ".";
         return words;
      }
}