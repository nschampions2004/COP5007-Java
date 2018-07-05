/**
A class for the Data Package a customer may choose
@author Kyle Ligon
@version 1.0

COP5007 Project #: 4
File Name: DataPackage.java
*/

public class DataPackage
{
/**
   the name of the amount of data within the package by month
*/   
   private String dataName;
/**
   the price of the amount of data within the package by month
*/
   private double dataPrice;
/**
   the default constructor for the DataPackage object 
*/
   public DataPackage()
   {
      setDataName("__");
      setDataPrice(9999.99);
   }
/**
   the parameterized constructor for the DataPackage object
   @param dataName the name of the data package to set the data package object to
   @param dataPrice the price of the data pacakge to set the data package object ot
*/
   public DataPackage(String dataName, double dataPrice)
   {
      setDataName(dataName);
      setDataPrice(dataPrice);
   }
/**
   the accessor for the dataName of the DataPackage
   @return dataName the name of the data package
*/
   public String getDataName()
   {
      return dataName;
   }
/**
   the accessor for the data price of the DataPackage
   @return dataPrice the price of the data package
*/
   public double getDataPrice()
   {
      return dataPrice;
   }
/**
   the mutatator for the data name section of the DataPackage object
   @param dateName the name of the data package to set the object to
*/
   public void setDataName(String dataName)
   {
      this.dataName = dataName;
   }
/**
   the mutatator for the data price section of the DataPackage object
   @param datePrice the price of the data package to set the object to
*/
   public void setDataPrice(double dataPrice)
   {
      this.dataPrice = dataPrice;
   }
/**
   the nicely formatted string of the Data Package Object
*/
   public String toString()
   {
      String words = "Package Name: " + getDataName() + ", Price: " + getDataPrice();
      return words;
   }
/**
 */  

  
}