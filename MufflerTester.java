/**
A class to test the Muffler Class.
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 1
File Name: DoorTester.java
*/

   public class MufflerTester
   {
      public static void main(String[] args)
      {
         Muffler def = new Muffler();
         System.out.println("This should be a the default values for Name, priceCode, and Cost " + def.getCustomer() + " " + 
                             def.getPriceCode() + " ");
         System.out.println("Expected: '' '' ");
         Muffler steve = new Muffler("Steve", "A4");
         steve.setCustomer("Becky");
         System.out.println("This should change the name to Becky. New Customer is: " + steve.getCustomer() + " " + steve.getPriceCode().charAt(0));
         System.out.println("Expected: New Customer is: Becky A");
         Muffler rebecca = new Muffler("Rebecca", "C3");
         rebecca.updatePriceCode("BL");
         System.out.println("This will print the price code for Rebecca. " + rebecca.getCustomer() + " " + rebecca.getPriceCode());
         System.out.println("Expectation: Rebecca BL");
         /* This group below won't work. */
         Muffler randy = new Muffler("Randy", "A");
         System.out.println("Price factor A = " + randy.getCost());
         System.out.println("This should output the price factor for A: 1.00");
         /* above this line */
         Muffler sandy = new Muffler("Sandy", "D4");
         System.out.println(sandy.toString());
      }
   }
   
         