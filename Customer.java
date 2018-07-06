/**
Customer program that creates and outputs a Customer object
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 4
File Name: Customer.java
*/

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
   private int zipCode;
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
   The Monthly Data Package 
*/
   public DataPackage monthlyDataPackage;
/**
   The calculator for the Monthly Bill
*/
   private double monthlyBill;
/**
   The calculator for the Startup Bill
*/
   private double startupBill;
/**
   Customer constructor that defaults
*/
   public Customer()
   {
      setName("__");
      setAddress("__");
      setCity("__");
      setState("__");
      setZipCode(999999);
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
   public Customer(String name, String address, String city, String state, int zipCode, String phoneNumber)
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
   public int getZipCode()
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
   public void setZipCode(int newZipCode)
   {
       this.zipCode = newZipCode;
   }
/**
   mutator for Phone Number
*/
   public void setPhoneNumber(String newPhoneNumber)
   {
       this.phoneNumber = newPhoneNumber;
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
   public void setMonthlyTalkPackage(int choiceNumber)
   {
      this.monthlyTalkPackage = talkPackages.get(choiceNumber + 1);
   }
/**
   toString method for Customer class
*/
   public String toString()
   {
      String words = "";
      words = "Name: " + getName() + "\t Address: " + getAddress() + ", " 
      + getCity() + ", " + getState() + ", " + getZipCode() + 
      "\t Phone Number: " + getPhoneNumber() + "\t IDNum: " + getIDNum();
      
      return words;
    }
/**    
/**
   The calculator for the Customer's monthly fee's

   public double monthlyBillCalculator()
   {
      monthlyBill = getTalkPackagePrice() + getDataPackagePrice();
   }
/**
   The calculator for the Customer's startup fee's

   public double startupBillCalculator()
   {
      startupBill = getShippingCost() + getPhoneCost();
   }
*/
}
