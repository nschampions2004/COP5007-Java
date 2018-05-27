/**
Muffler program that outputs a customer's name, muffler, and total price
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 1
File Name: Door.java
*/
import java.util.*;




public class Muffler {
   /**
   The customer who is buying the muffler.
   */
   private String customer;
   
   /**
   The price code associated with the muffler, this will determine price
   */
   private String priceCode;
   
   /**
   The cost associated with the muffler
   */
   private double cost;
   
   /**
   Constructs a Muffler Object with default values 
   */
   public Muffler(){
    customer = "";
    priceCode = "";
    cost = 9999.99;
    }
/**
*Constructs a Muffler Object that is not defaulted.
*@param customerPssThrgh the name of the customer
*@param priceCodePssThrgh the pricecode corresponding to the muffler the customer desires
*/

    
  public Muffler(String customerPssThrgh, String priceCodePssThrgh){
      customer = customerPssThrgh;
      priceCode = priceCodePssThrgh;
      }
/** 
Pulls customer's name
@return the name of the customer
*/
   public String getCustomer() {
      return customer;
   }
/**
Pulls the price code of the muffler the customer wants
@return the price code
*/

   public String getPriceCode() {
      String[] possibilities = new String[] {"A", "A3", "B", "B3", "BL", "C", "C3", "CL", "D", "D3", "DL", "E", "E3", "EL", "F3", "FL"};
      boolean id = Arrays.asList(possibilities).contains(priceCode);
      if(!id){
          priceCode = "Error: please enter a valid price code.";
      } else {
         priceCode = priceCode;
       }
      return priceCode;
   }
   
/** 
Pulls the cost of the muffler that the customer wants
@return the cost of the muffler
*/

   public double getCost() {
      String[] possibilities = new String[] {"A", "A3", "B", "B3", "BL", "C", "C3", "CL", "D", "D3", "DL", "E", "E3", "EL", "F3", "FL"};
      boolean id = Arrays.asList(possibilities).contains(getPriceCode());
      if(id){
            cost = computeCost();
      }
      else {
         cost = 9999.99;
      }
         return cost;
   }

/**
This is a mutator for customer; you don't want it to return a value, thus the void.  
@param newCustomer the name of the new Customer
*/
   public void setCustomer(String newCustomer){
        customer = newCustomer; 
        }
        
/**
This updates price code for customers.
@param updatePriceCode changes the PriceCode to a present value
*/
   public void updatePriceCode(String newPriceCode){
         priceCode = newPriceCode;
         }
/**
This outputs format of the getCustomer, getPriceCode, and computeCost pieces in 
an easily readable format.  
*/
   public String toString(){
   String rounded = String.format("%.2f", getCost());
     String words = getCustomer() + " \t " + getPriceCode() + " \t " + "$" + rounded;
      return words;
      }
/**
Calculates the cost in dollars of the Muffler given the Price Code which is broken 
down by letter and warranty choice.
*/

   private double computeCost() {
      double priceFactor;
      double warranty;
      char priceF = getPriceCode().charAt(0);
      int i = getPriceCode().length() - 1;
      char warrantyVal = getPriceCode().charAt(i);
         switch (priceF){
            case 'A':
               priceFactor = 1.00;
               break;
            case 'B':
               priceFactor = 1.07;
               break;
            case 'C':
               priceFactor = 1.15;
               break;
            case 'D':
               priceFactor = 1.22;
               break;
            case 'E':
               priceFactor = 1.38;
               break;
            case 'F':
               priceFactor = 1.50;
               break;
            default:
               priceFactor = 1.00;
            }
            
            if(warrantyVal == '3'){
                warranty = 2.00;
               } else if(warrantyVal == 'L'){
                  warranty = 5.00;
               } else {
                  warranty = 0.00;
               }
         
         cost = Math.round((39.95 + warranty) * priceFactor * 100.00) / 100.00;
         
         return cost;           
       }            
}    
        
         
     
       