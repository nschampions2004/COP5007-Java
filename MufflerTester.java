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
         System.out.println("***Tests default values***");
         Muffler def = new Muffler();
         System.out.println("This should be a the default values for Name, priceCode, and Cost: " + def.getCustomer() + " " + 
                             def.getPriceCode() + " " + def.getCost());
         System.out.println("Expected: '' '' 9999.99");
         System.out.println("***Tests called values***");
         Muffler ryan = new Muffler("Ryan", "A");
         System.out.println(ryan.getCustomer() + " " + ryan.getPriceCode() + " " + ryan.getCost());
         System.out.println("Expected: Ryan A 39.95");
         System.out.println("***Tests updateCustomer***");
         Muffler steve = new Muffler("Steve", "A3");
         steve.setCustomer("Becky");
         System.out.println("This should change the name, Steve, to Becky. New Customer is: " + steve.getCustomer() + " Price code is: " + steve.getPriceCode());
         System.out.println("Expected: New Customer is: Becky Price code is: A");
         System.out.println("***Tests updatePriceCode***");
         Muffler rebecca = new Muffler("Rebecca", "C3");
         rebecca.updatePriceCode("BL");
         System.out.println("This will print the price code for Rebecca. " + rebecca.getCustomer() + " " + rebecca.getPriceCode() + 
         " " + rebecca.getCost());
         System.out.println("Expectation: Rebecca BL 48.1");
         System.out.println("***Tests toString***");
         Muffler sandy = new Muffler("Sandy", "D3");
         System.out.println(sandy.toString());
         System.out.println("Expected: Sandy <tab> D3 <tab> $51.18");
         System.out.println("***Tests passing a bad priceCode to toString()***");
         Muffler brad = new Muffler("Brad", "Z5");
         System.out.println(brad.toString());
         System.out.println("Expected: Brad <tab> Error: please enter a valid price code. <tab> $9999.99");
         System.out.println("***Tests all possible combinations of priceCode with toString***");
         Muffler christina = new Muffler("Christina", "A");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   A  $39.95");
         christina.updatePriceCode("A3");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   A3 $41.95");
         christina.updatePriceCode("B");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   B  $42.75");
         christina.updatePriceCode("B3");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   B3  $44.89");
         christina.updatePriceCode("BL");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   BL  $48.10");
         christina.updatePriceCode("C");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   C  $45.94");
         christina.updatePriceCode("C3");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   C3  $48.24");
         christina.updatePriceCode("CL");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   CL  $51.69");  
         christina.updatePriceCode("D");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   D  $48.74");      
         christina.updatePriceCode("D3");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   D3  $51.18");
         christina.updatePriceCode("DL");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   DL  $54.84");
         christina.updatePriceCode("E");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   E  $55.13");
         christina.updatePriceCode("E3");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   E3  $57.89");
         christina.updatePriceCode("EL");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   EL  $62.03");
         christina.updatePriceCode("F3");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   F3  $62.93");
         christina.updatePriceCode("FL");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   FL   $67.43");
         System.out.println("***Test the illegal price codes(AL and F) with toString()***");
         christina.updatePriceCode("AL");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   Error: please enter a valid price code.  $9999.99");
         christina.updatePriceCode("F");
         System.out.println(christina.toString());
         System.out.println("Expected: Christina   Error: please enter a valid price code. $9999.99");
         }
   }
   
         