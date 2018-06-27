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
*/
   public Customer(String name, String address, String city, String state, int zipCode, String phoneNumber)
   {
      setName(name);
      setAddress(address);
      setCity(city);
      setState(state);
      setZipCode(zipCode);
      setPhoneNumber(phoneNumber);
   }
/**
   accessor for name
*/
   public String getName()
   {
      return name;
   }
/**
   accessor for address
*/
   public String getAddress()
   {
      return address;
   }
/**
   accessor for city
*/
   public String getCity()
   {
      return city;
   }
/**
   accessor for state
*/
   public String getState()
   {
      return state;
   }
/**
   accessor for zip code
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



}
