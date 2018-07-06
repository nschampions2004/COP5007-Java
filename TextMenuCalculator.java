/**
TextMenuCalculator program that outputs and creates a menu to calculate 
the customer's bill 
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 4
File Name: TextMenuCalculator.java
*/

import java.util.Scanner;
import java.util.regex.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;


public class TextMenuCalculator {
   public static void main(String[] args) 
      throws IOException
   {
   //set up the connection to 
   Scanner in = new Scanner(System.in);
   FileInputStream fileByteStream = null;
   Scanner inFS = null;
   Integer menuOpts;
   String billClass;
   int numberOfOptions;
   String baseClass;
   ArrayList<MonthlyTalkPackage> talkPackages = new ArrayList<MonthlyTalkPackage>( );
   ArrayList<PhoneChoice> phoneChoices = new ArrayList<PhoneChoice>( );
   ArrayList<DataPackage> dataPackages = new ArrayList<DataPackage>( );

   
   //go to open the file
   System.out.println("Attempting to open planReadin.txt...");
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
            MonthlyTalkPackage tempMinutes = new MonthlyTalkPackage(tempTalkMinutes, tempTalkPrice);
            talkPackages.add(tempMinutes);
            //talkPackages.get(i).toString();
         }
      }
      else if(baseClass.equals("Phone Choices"))
      {
         for(i = 0; i < numberOfOptions; i++)
         {
            String tempPhoneName = inFS.next();
            String tempPhonePriceString = inFS.nextLine().replace(",","");
            double tempPhonePrice = Double.valueOf(tempPhonePriceString);
            PhoneChoice tempPhone = new PhoneChoice(tempPhoneName, tempPhonePrice);
            phoneChoices.add(tempPhone);
            phoneChoices.get(i).toString();
         }
      }
      else if(baseClass.equals("Monthly Data Packages"))
      {
         for(i = 0; i < numberOfOptions; i++)
         {
            String tempDataName = inFS.next();
            String tempDataPriceString = inFS.nextLine().replace(",","");
            double tempDataPrice = Double.valueOf(tempDataPriceString);
            DataPackage tempData = new DataPackage(tempDataName, tempDataPrice);
            dataPackages.add(tempData);
            Arrays.toString(dataPackages.toArray());
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
  

   //print menu for Talk Minutes
   for (int i = 1; i < talkPackages.size() + 1; i++)
   
      System.out.println(i + "." + talkPackages.get(i - 1));
   
   System.out.println("0. Move on to Phone Model");
   boolean quit = false;
   int menuItem;
   do {
         System.out.println("Please choose an option. Otherwise, 0 to move onto Phone Model.");
         menuItem = in.nextInt();
         switch (menuItem) {
         case 1:
               System.out.println("You selected: 1000 minutes for $29.99.");
               break;
         case 2:
               System.out.println("You selected: 5000 minutes for $49.99.");
               break;
         case 3: 
               System.out.println("You selected:  Unlimited minutes for $69.99.");
               break;
         case 0:
               quit = true;
               break;
         default:
               System.out.println("Invalid choice.");
            }
         }
         while (!quit);
         System.out.println("Thank you for choosing.");
   
   //print menu for Phone Choice
   for (int i = 1; i < phoneChoices.size() + 1; i++)
   
      System.out.println(i + "." + phoneChoices.get(i - 1));
   
   System.out.println("0. Move on to Phone Model");
   do {
         System.out.println("Please choose an option. Otherwise, 0 to move onto Data Packages.");
         menuItem = in.nextInt();
         switch (menuItem) {
         case 1:
               System.out.println("You selected: Model 100 for $39.95.");
               break;
         case 2:
               System.out.println("You selected: Model 200 for $49.95.");
               break;
         case 3: 
               System.out.println("You selected: Model 300 for $59.95.");
               break;
         case 0:
               quit = true;
               break;
         default:
               System.out.println("Invalid choice.");
            }
         }
         while (!quit);
         System.out.println("Thank you for choosing.");
         
   //print menu for Data Package Choice
   for (int i = 1; i < dataPackages.size() + 1; i++)
   
      System.out.println(i + "." + dataPackages.get(i - 1));
   
   System.out.println("0. Quit");
   do {
         System.out.println("Please choose an option. Otherwise, 0 to exit: ");
         menuItem = in.nextInt();
         switch (menuItem) {
         case 1:
               System.out.println("You selected: 500 MB for $50.00.");
               break;
         case 2:
               System.out.println("You selected: 2.5 GB for $60.00.");
               break;
         case 3: 
               System.out.println("You selected: Unlimited for $70.00.");
               break;
         case 0:
               quit = true;
               break;
         default:
               System.out.println("Invalid choice.");
            }
         }
         while (!quit);
         System.out.println("Thank you for choosing.");
   } 
}