/**
A class for 
@author Kyle Ligon
@version 1.0

COP5007 Project #: 4
File Name: MonthlyTalkPackage.java
*/

public class MonthlyTalkPackage
{
/**
   The talk minutes
*/
   private String talkMinutes;
/**
   the cost of the talk minutes;
*/
   private double talkPrice;
/**
   Storage of the talk pacakge options as an Array List.
*/
   //private ArrayList<MonthlyTalkPackage> talkPackages = new ArrayList<MonthlyTalkPackage>( );
/**
   the default constructor of the Monthly Talk Package
*/
   public MonthlyTalkPackage()
   {
      setTalkMinutes("____");
      setTalkPrice(9999.99);
   }
/**
   the parameterized constructor of the Monthly Talk Package
   @param talkMinutes the minutes amount to set the MonthlyTalkPackae
   @param talkPrice the price for the corresponding talkMinutes
*/
   public MonthlyTalkPackage(String talkMinutes, double talkPrice)
   {
      setTalkMinutes(talkMinutes);
      setTalkPrice(talkPrice);
   }
/**
   accessor for talk minutes
   @return the talk minutes String
*/
   public String getTalkMinutes()
   {
      return talkMinutes;
   }
/**
   accessor for talk minutes price per month
   @return talkPrice the price of the talk package
*/
   public double getTalkPrice()
   {
      return talkPrice;
   }
/**
   mutator for set talk price
   @param talkMinutes sets the talk minutes string
*/
   public void setTalkMinutes(String talkMinutes)
   {
      this.talkMinutes = talkMinutes;
   }
/**
   mutator for set talk price
*/
   public void setTalkPrice(double talkPrice)
   {
      this.talkPrice = talkPrice;
   }
/**
   string output for the MonthlyTalkPackage constructor
   @return words the string nicely formatted for the Monthly Talk Package
*/
   public String toString()
   {
      String words = "Plan: " + getTalkMinutes() + ", Price: " + getTalkPrice();
      return words;
   }
} 
