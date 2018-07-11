/**
A class for 
@author Kyle Ligon
@version 1.0

COP5007 Project #: 4
File Name: MonthlyTalkPackage.java
*/

import java.util.*;

public class MonthlyTalkPackage extends Option
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
   the default constructor of the Monthly Talk Package
*/
   public MonthlyTalkPackage()
   {
      super();
   }
/**
   the parameterized constructor of the Monthly Talk Package
   @param talkMinutes the minutes amount to set the MonthlyTalkPackae
   @param talkPrice the price for the corresponding talkMinutes
*/
   public MonthlyTalkPackage(String talkMinutes, double talkPrice)
   {
      super(talkMinutes, talkPrice);
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
   @param talkPrice sets the talk price value
*/
   public void setTalkPrice(double talkPrice)
   {
      this.talkPrice = talkPrice;
   }
/**
   string output for the MonthlyTalkPackage constructor
   @return words the string nicely formatted for the Monthly Talk Package
*/
   @Override
   public String toString()
   {
      return super.toString() + "\n";
   }
} 
