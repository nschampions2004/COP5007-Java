/**
An abstract class that will hold the different sections of the sandwich menu
@author Kyle Ligon
@version 1.0

COP5007 Project #: 6
File Name: ChoiceSections.java
*/
public abstract class ChoiceSections
{
   /**
      The type of food/meal item within the class
   */
      protected String type;
   /**
      The cose of the food/meal item within the class
   */
      protected double cost;
   /**
      The constructor makes the default ChoiceSection object
   */
      public ChoiceSections()
      {
         setType("Error");
         setCost(9999.99);
      }
   /**
      The parameterized constructor for the ChoiceSection object
      @param type the type of Choice the customer chooses
      @param cost the cost of the type of Choice the customer chooses
   */
      public ChoiceSections(String type, double cost)
      {
         setType(type);
         setCost(cost);
      }
   /**
      Accessor for the Type of the ChoiceSection
      @return the type of the Choice Section 
   */
      public String getType()
      {
         return type;
      }
   /**
      Accessor for the Cost of the Type of the Choice Section
      @return the cost of the type of the Choice Section
   */
      public double getCost()
      {
         return cost;
      }
   /**
      Mutator for the Type of the Choice Section
      @param the type of the Choice Section
   */
      public void setType(String type)
      {
         this.type = type;
      }
   /**
      Mutator for the Cost of the Choice Section
      @param the cost of the type of the Choice Section
   */
      public void setCost(double cost)
      {
         this.cost = cost;
      }
}