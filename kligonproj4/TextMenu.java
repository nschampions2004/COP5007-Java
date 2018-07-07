/**
TextMenuCalculator program that outputs and creates a menu to calculate 
the customer's bill 
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 4
File Name: TextMenu.java
*/

//import java.util.Scanner;
//import java.util.regex.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class TextMenu 
   {
      //define and initialize ArrayList for Concrete Options Objects
      private ArrayList<MonthlyTalkPackage> talkPackages = new ArrayList<MonthlyTalkPackage>() ;
      private ArrayList<PhoneChoice> phoneChoice = new ArrayList<PhoneChoice>();
      private ArrayList<DataPackage> dataPackages = new ArrayList<DataPackage>();   
      
            
      //method to read in the file   
      public void fileReadin()
         throws IOException
      {
         //define and initialize a scanner as well as vars that hold optionClass and number of options      
         Scanner in = new Scanner(System.in);
         FileInputStream fileByteStream = null;
         Scanner inFS = null;
         Integer menuOpts;
         int numberOfOptions;
         String baseClass;
         //go to open the file
         try
         {
            fileByteStream = new FileInputStream("planReadin.txt");
            inFS = new Scanner(fileByteStream);
         }
         catch (Exception FieldOutOfBounds)
         {
            System.out.println("The specified file was not found.");
            System.exit(0);
         }
         //loop through till no next line
         while(inFS.hasNextLine())
         {
            //setting the loop index for the different groups
            int i;
            //set the delimiter to separate everything
            inFS.useDelimiter(",");
            //move passed "Choices"
            inFS.next();
            //pull in the integer after Choices
            numberOfOptions = Integer.valueOf(inFS.nextLine().replace(",",""));
            //pull in what type of class the following line is
            baseClass = inFS.nextLine().trim();
            System.out.println("You have input " + numberOfOptions + " options for the " + baseClass + " section.");
            
            //branch on the string that comes next
            if(baseClass.equals("Monthly Talk Packages"))
            {  
               for(i = 0; i < numberOfOptions; i++)
               {
                  String tempTalkMinutes = inFS.next();
                  String tempTalkPriceString = inFS.nextLine().replace(",","");
                  double tempTalkPrice = Double.valueOf(tempTalkPriceString);
                  talkPackages.add(new MonthlyTalkPackage(tempTalkMinutes, tempTalkPrice));
               }
            }
            else if(baseClass.equals("Phone Choices"))
            {
               for(i = 0; i < numberOfOptions; i++)
               {
                   String tempPhoneName = inFS.next();
                   String tempPhonePriceString = inFS.nextLine().replace(",","");
                   double tempPhonePrice = Double.valueOf(tempPhonePriceString);
                   phoneChoice.add(new PhoneChoice(tempPhoneName, tempPhonePrice));
               }
            }
            else if(baseClass.equals("Monthly Data Packages"))
            {
               for(i = 0; i < numberOfOptions; i++)
               {
                  String tempDataName = inFS.next();
                  String tempDataPriceString = inFS.nextLine().replace(",","");
                  double tempDataPrice = Double.valueOf(tempDataPriceString);
                  dataPackages.add(new DataPackage(tempDataName, tempDataPrice));
               }
            }
            else
            {
               System.out.println("Error: Please Enter a Valid Consumer Object.");
            }
         }                
         
         //finished with the file, shutting down
         System.out.println("Closing file planReadin.txt");
         fileByteStream.close();
         }
         
      //method to output the options to the User (Should work on any class)
      public void displayTalkPackagesOptions()
      {
         for(int i = 0; i < talkPackages.size(); i++)
         {
            MonthlyTalkPackage temp = talkPackages.get(i);
            String text = temp.toString();
            System.out.println(i + 1 + ". " + text);
         }
      }
      public void displayPhoneChoiceOptions()
      {
         for(int i = 0; i < phoneChoice.size(); i++)
         {
            PhoneChoice temp = phoneChoice.get(i);
            String text = temp.toString();
            System.out.println(i + 1 + ". " + text);
         }
       }
       public void displayDataPackageOptions()
      {
         for(int i = 0; i < dataPackages.size(); i++)
         {
            DataPackage temp = dataPackages.get(i);
            String text = temp.toString();
            System.out.println(i + 1 + ". " + text);
         }
       }

       public MonthlyTalkPackage getTalkPackage(int i)
       {
         return talkPackages.get(i);
       }
  
       public PhoneChoice getPhoneChoice(int i)
       {
         return phoneChoice.get(i);
       }
       public DataPackage getDataPackage(int i)
       {
         return dataPackages.get(i);
       }
       

         
}