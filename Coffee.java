/**
Coffee program that extends the ChoiceSection class.  
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 6
File Name: Coffee.java
*/

public class Coffee extends ChoiceSections
{
   /**
      The Coffee object that defaults.
   */
      public Coffee()
      {
         super( );
      }
   /**
      The Coffee object that takes a type, sets the type, and setting Cost
      @param type the type to set the Coffee object to
   */
      public Coffee(String type)
      {
         setType(type);
         setCost(type);
      }
   /**
      The mutator for the Coffee object's type that a customer can choose from
      @param type the type to set the Coffee object to
   */
      public void setType(String type)
      {
         this.type = type;
      }
   /**
      The mutator for the Coffee object's cost that a customer can choose from
      @param type the type to set the Coffee Object to
   */
      public void setCost(String type)
      {
         if(type.equals("None"))
         {
            this.cost = 0.00;
         }
         else if(type.equals("Regular coffee"))
         {
            this.cost = 1.00;
         }
         else if(type.equals("Decaf coffee"))
         {
            this.cost = 1.00;
         }
         else if(type.equals("Cappuccino"))
         {
            this.cost = 3.75;
         }
      }
}