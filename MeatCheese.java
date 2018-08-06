/**
MeatCheese program that extends the ChoiceSection class.  
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 6
File Name: MeatCheese.java
*/

public class MeatCheese extends ChoiceSections
{
   /**
      The MeatCheese object that defaults.
   */
      public MeatCheese()
      {
         super( );
      }
   /**
      The MeatCheese object that takes a type, sets the type, and setting Cost
      @param type the type to set the MeatCheese object to
   */
      public MeatCheese(String type)
      {
         setType(type);
         setCost(type);
      }
   /**
      The mutator for the MeatCheese object's type that a customer can choose from
      @param type the type to set the MeatCheese object to
   */
      public void setType(String type)
      {
         this.type = type;
      }
   /**
      The mutator for the MeatCheese object's cost that a customer can choose from
      @param type the type to set the MeatCheese Object to
   */
      public void setCost(String type)
      {
         if(type.equals("Cheese"))
         {
            this.cost = this.cost + 1.00;
         }
         if(type.equals("Roast Beef"))
         {
            this.cost = this.cost + 3.75;
         }
         if(type.equals("Turkey"))
         {
            this.cost = this.cost + 3.25;
         }
         if(type.equals("Ham"))
         {
            this.cost = this.cost + 3.00;
         }
      }
}