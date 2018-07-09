/**
Customer program that creates and outputs a Customer object
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 4
File Name: Customer.java
*/
import java.util.regex.*;
import java.text.DecimalFormat;

public class Customer
{
   /**
      The name of the customer
   */
      private String name;
   /**
      The billing street of the customer
   */
      private String address;
   /**
      The billing city of the customer
   */
      private String city;
   /**
      The billing state of the customer
   */
      private String state;
   /**
      The billing zip code of the customer
   */
      private String zipCode;
   /**
      The phone number of the customer
   */
      private String phoneNumber;
   /**
      Customer ID generator starting point
   */
      private static int nextIDNum = 0;
   /**
      The id of the player
   */
      private int IDNum;
   /**
      The Monthly Talk Package the customer picks
   */
      public MonthlyTalkPackage monthlyTalkPackage;
   /**
      The Phone Choice the customer picks
   */
      public PhoneChoice phoneChoice;
   /**
      The Data Package the customer picks
   */
      public DataPackage dataPackage;
   /**
      The Monthly Data Package 
   */
      public DataPackage monthlyDataPackage;
   /**
      The total for the Monthly Bill
   */
      private double monthlyBill;
   /**
      The total for the Startup Bill
   */
      private double startupBill;
   /**
      The shipping cost for the customer
   */   
      private double shippingCost;
   /**
      status for while loops in for zip code and phone number formatters
   */
      private boolean moveOn;
   /**
      prefixes for the AK and HI zips
   */
      private final String[] AK_HI_PREFIXES = {"995", "996", "997", "998", "999", "967", "968"};
   /**
      cost for shipping to AK and HI
   */ 
      private final double AK_HI_SHIP_COST = 10.00;
   /**
      cost of shipping to 325 starting zip
   */
      private final double SINGLE_ZIP_COST = 0.00;
   /**
      cost of shipping to the continental united states
   */
      private final double CON_US_SHIP_COST = 5.00;
   
   
   /**
      Customer constructor that defaults
   */
      public Customer()
      {
         setName("__");
         setAddress("__");
         setCity("__");
         setState("__");
         setZipCode("999999");
         setPhoneNumber("(999) 999-9999");
         IDNum = 9999;
      }
   /**
      Parameterized Customer Constructor
      @param name the name of the customers
      @param address the address of the customer
      @param city the city of the customer
      @param state the state the customer lives in
      @param zipCode the zipcode the customer lives in
      @param phoneNumber the phone number of the customer
   */
      public Customer(String name, String address, String city, String state, String zipCode, String phoneNumber)
      {
         setName(name);
         setAddress(address);
         setCity(city);
         setState(state);
         setZipCode(zipCode);
         setPhoneNumber(phoneNumber);
         setIDNum();
      }
   /**
      accessor for name
      @return the name of the customer
   */
      public String getName()
      {
         return name;
      }
   /**
      accessor for address
      @return the address of the customer
   */
      public String getAddress()
      {
         return address;
      }
   /**
      accessor for city
      @return the city of the customer
   */
      public String getCity()
      {
         return city;
      }
   /**
      accessor for state
      @return the state the customer lives in 
   */
      public String getState()
      {
         return state;
      }
   /**
      accessor for zip code
      @return the zip code 
   */
      public String getZipCode()
      {
         return zipCode;
      }
   /**
      accessor for Phone Number
      
   */
      public String getPhoneNumber()
      {
         return phoneNumber;
      }
   /**
      accessor for IDNum
   */
      public int getIDNum()
      {
         return IDNum;
      }
   
   /**
      mutator for Name
   */
      public void setName(String newName)
      {
          this.name = newName;
      }
   /**
      mutator for Address
   */
      public void setAddress(String newAddress)
      {
          this.address = newAddress;
      }
   /**
      mutator for City
   */
      public void setCity(String newCity)
      {
          this.city = newCity;
      }
   /**
      mutator for State
   */
      public void setState(String newState)
      {
          this.state = newState;
      }
   /**
      mutator for Zip Code
   */
      public void setZipCode(String newZipCode)
         throws FieldOutOfBounds
      {
         this.zipCode = newZipCode;              
      }
   /**
      mutator for Phone Number
   */
      public void setPhoneNumber(String newPhoneNumber)
         throws FieldOutOfBounds
      {
        moveOn = false;
        while(moveOn)
        { 
          try
          {
            if(phoneNumberCheck(newPhoneNumber))
            {
               this.phoneNumber = newPhoneNumber;
               moveOn = true;
            }
            else
            {
               throw new FieldOutOfBounds 
                           ("Phone Number must be in the form of (XXX)-XXX-XXXX; \nplease re-enter a number");
            }
          }
          catch (Exception FieldOutOfBounds)
          {
               System.out.println(FieldOutOfBounds.getMessage());
          }
         }
      }
    
   /**
      mutator for IDNum
   */
      public void setIDNum()
      {
         nextIDNum++;
         this.IDNum = nextIDNum;
      }
   /**
      setting the customer's MonthlyTalkPackage
   */ 
      public void setMonthlyTalkPackage(MonthlyTalkPackage choiceNumber)
      {
         this.monthlyTalkPackage = choiceNumber;
      }
   /**
      setting the customer's Phone Choice
   */ 
      public void setPhoneChoice(PhoneChoice choiceNumber)
      {
         this.phoneChoice = choiceNumber;
      }
   /**
      setting the customer's Data Package
   */ 
      public void setDataPackage(DataPackage choiceNumber)
      {
         this.dataPackage = choiceNumber;
      }
   /**
      getting the Monthly Talk Package for the Customer
   */
      public MonthlyTalkPackage getMonthlyTalkPackage()
      {
         return this.monthlyTalkPackage;
      }
   /**
      getting the Data Package for the Customer
   */
      public DataPackage getDataPackage()
      {
         return this.monthlyDataPackage;
      }   
   /**
      getting the Phone Package for the Customer
   */
      public PhoneChoice getPhoneChoice()
      {
         return this.phoneChoice;
      }    
   /**
      toString method for Customer class
   */
      public String toString()
      {
         DecimalFormat df = new DecimalFormat("#.00");
         setMonthlyBill(this.monthlyTalkPackage, this.dataPackage);
         setStartupCost(this.phoneChoice);
         String words = "IDNum: " + getIDNum() + "\t Startup Fees: $" + df.format(getStartupCost()) + 
         "\t Monthly Fees: $" + df.format(getMonthlyBill());  
         return words;
       }
   /**
      The calculator for the Customer's monthly fee's
   */
      public void setMonthlyBill(MonthlyTalkPackage talkPackage, DataPackage dataPackage)
      {
         this.monthlyBill = talkPackage.getOptionPrice() + dataPackage.getOptionPrice();
      }
   /**
      Method to calculate shipping cost for the customer
   */
      public void setShippingCost(String zipCode)
      {        
         
         for(int i = 0; i < AK_HI_PREFIXES.length; i++)
         {
            if(zipCode.startsWith(AK_HI_PREFIXES[i]))
            {
               this.shippingCost = AK_HI_SHIP_COST;
               break;
            }
            else if(zipCode.startsWith("325"))
            {
               this.shippingCost = SINGLE_ZIP_COST;
               break;
            }
            else 
            {
               this.shippingCost = CON_US_SHIP_COST;
            }
         }
      }
   /**
   */
      public double getShippingCost()
      {
         return shippingCost;
      }
   /**
      The calculator for the Customer's startup fee's
   */
      public void setStartupCost(PhoneChoice phoneChoice)
      {
         this.startupBill = this.shippingCost + phoneChoice.getOptionPrice();
      }
   /**
      The accessor for the Customer's startup fee's
   */
      public double getStartupCost()
      {
         return this.startupBill;
      }
   /**
      The accessor for the Customer's monthly bill
   */
      public double getMonthlyBill()
      {
         return this.monthlyBill;
      }
   /**
      Method to check if a string has a pattern
   */
      public boolean phoneNumberCheck(String phoneNumber)
      {
         String pattern = "^\\(([0-9]{3})\\)\\s([0-9]{3})-([0-9]{4})$";
         return phoneNumber.matches(pattern);         
      }
   }