/**
Defined Exception for values outside our range  
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 5
File Name: FieldOutOfBounds.java
*/
   public class FieldOutOfBounds extends IllegalArgumentException
   {
      public FieldOutOfBounds( String message )
      {
         super( message );
      }
   }
   