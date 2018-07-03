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



public class TextMenuCalculator {
   public static void main(String[] args) {
   //set up the connection to 
   Scanner in = new Scanner(System.in);
   FileInputStream fileByteStream = null;
   Scanner inFS = null;
   Integer menuOpts;
   String billClass;
   int numberOfOptions;
   String baseClass;
   
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
      //set the delimiter to separate everything
      inFS.useDelimiter(",");
      //move passed "Choices"
      inFS.next();
      //pull in the integer after Choices
      numberOfOptions = Integer.valueOf(inFS.nextLine().replace(",",""));
      System.out.println(numberOfOptions);
      //pull in what type of class the following line is
      baseClass = inFS.nextLine();
      System.out.println(baseClass);
      if(baseClass == "Monthly Talk Packages")
      {
         for(int i = 0; i < numberOfOptions; i++)
         {
                        
         }
      }
      
    }
  }   
   // print menu
   /*for (int i = 1; i < 4; i++)
      if(i == 1)
      {
         System.out.println(i + ". 1000 minutes for $29.99");
      }
      else if(i == 2)
      {
         System.out.println(i + ". 5000 minutes for $49.99");
      }
      else if(i == 3)
      {
         System.out.println(i + ". Unlimited for $69.99");
      }
      else
      {
         System.out.println("Invalid decision.");
      }
   System.out.println("0. Quit");
   boolean quit = false;
   int menuItem;
   do {
         System.out.println("Please choose an option for your monthly minute allowance.  Otherwise, 0 to exit: ");
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
         System.out.println("Thank you for choosing your minute allowance per month.");
   }*/
}
