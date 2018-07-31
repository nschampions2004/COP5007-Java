/**
Bread program that extends the ChoiceSection class.  
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 6
File Name: Bread.java
*/

public class Bread extends ChoiceSections
{
   /**
      The Bread object that defaults.
   */
      public Bread()
      {
         super( );
      }
   /**
      The Bread object that takes a type, sets the type, and setting Cost
      @param type the type to set the Bread object to
   */
      public Bread(String type)
      {
         setType(type);
         setCost(type);
      }
   /**
      The mutator for the Bread object's type that a customer can choose from
      @param type the type to set the Bread object to
   */
      public void setType(String type)
      {
         this.type = type;
      }
   /**
      The mutator for the Bread object's cost that a customer can choose from
      @param type the type to set the Bread Object to
   */
      public void setCost(String type)
      {
         if(type.equals("White"))
         {
            this.cost = 3.50;
         }
         else if(type.equals("Wheat"))
         {
            this.cost = 3.75;
         }
      }
}