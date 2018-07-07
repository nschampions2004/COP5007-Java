/**
   A class for phone choice class
@author Kyle Ligon
@version 1.0

COP5007 Project #: 4
File Name: PhoneChoice.java
*/

public class PhoneChoice extends Option
{
/**
   The model name of the phone
*/
   private String phoneName;
/**
   The price of the phone model
*/
   private double phonePrice;
/**
   The default constructor of the Phone Choice 
*/ 
   public PhoneChoice()
   {
      super();
   }
/**
   The parameterized constructor of the Phone Choice
   @param phoneName the setter for the phone name
   @param phonePrice the setter for the price of the phone name
*/
   public PhoneChoice(String phoneName, double phonePrice)
   {
      super(phoneName, phonePrice);
   }
// /**
//    accessor for phone name
//    @return phoneName the name of the phone
// */
//    public String getPhoneName()
//    {
//       return phoneName;
//    }
// /**
//    accessor for phone price
//    @return phonePrice the price of the phone plans
// */
//    public double getPhonePrice()
//    {
//       return phonePrice;
//    }
/**
   mutator for the phone name
   @param phoneName the name to set the phone name to
*/
   public void setPhoneName(String phoneName)
   {
      this.phoneName = phoneName;
   }
/**
   mutator for the phone price
   @param phonePrice the price to set the phone price to
*/
   public void setPhonePrice(double phonePrice)
   {
      this.phonePrice = phonePrice;
   }
/**
   nicely formatted string for the phoneChoice constructor
   @return words a formatted string for the constructor
*/
   @Override 
   public String toString()
   {
      return super.toString() + "\n";
   }
}
  