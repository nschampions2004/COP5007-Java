/**
A class to test the Cell Phone Project's classes.
@author Kyle Ligon
@version 1.0

COP5007	Project #: 4
File Name: CellPhoneDriver.java
*/
import java.util.*;
import java.io.*;

public class CellPhoneDriver
{
   /**
      the length of one record in the Random Access File
   */
   private static final int RECORD = 30;
   
   public static void main(String[] args) 
   {
         //call the read-in method
         TextMenu textMenu = new TextMenu();
         Customer newCust = new Customer();
         RandomAccessFile file;
         try
         {
            textMenu.fileReadin(); 
         }
         catch (Exception IOException)
         {
            System.out.println("wasn't able to open file");
         }
         //start of the menu
         boolean initMenuQuitter = false;
         Scanner in = new Scanner(System.in);
         int initMenuItem;
         do
         {
         System.out.println("Select the from the following options: ");
         System.out.println("\t 1) Buy a Phone and Build a Bill");
         System.out.println("\t 2) Search for your bill");
         System.out.println("\t 0) Quit");
         
         initMenuItem = in.nextInt();       
         switch (initMenuItem)
         {
         
         case 1:
            
            //Setting Customer Info before Picking Plans
            in.nextLine();
            System.out.println("Please enter your name below.");
            newCust.setName(in.nextLine());
            
            System.out.println("Please enter your address below");
            newCust.setAddress(in.nextLine());
            
            System.out.println("Please enter the city you live in below");
            newCust.setCity(in.nextLine());
            
            System.out.println("Please enter the state you live in");
            newCust.setState(in.nextLine());
            
            System.out.println("Please enter your zip code below");
            newCust.setZipCode(Integer.valueOf(in.nextLine()));
            newCust.setShippingCost();
            System.out.println(newCust.getShippingCost());
            
            System.out.println("Please enter your phone number below");
            newCust.setPhoneNumber(in.nextLine());
            
            //setting ID Number
            newCust.setIDNum();         
            //print menu for Talk Minutes
         	System.out.println("Monthly Talk Plans");
            textMenu.displayTalkPackagesOptions();       	
          	boolean quit =	false;
         	int menuItem;
            do	
            {
         		System.out.println("Please choose an option. Otherwise, 0 to move onto Phone Model.");
         		menuItem	= in.nextInt();
               if(menuItem <= textMenu.getTalkPackageSize() && menuItem > 0)
               {
                     System.out.println("You selected: " + textMenu.getTalkPackage(menuItem - 1).toString());
                     //take the selection from the menu, find it's TalkPackage from TextMenu Class
                     //set it as the customer's Talk Package var
                     newCust.setMonthlyTalkPackage(textMenu.getTalkPackage(menuItem - 1));
               }
               else if(menuItem == 0) 
               {
                  quit = true;
               }
               else
               {
                  System.out.println("Invalid Input: please enter a valid selection.");
               }
             }
             while(!quit);                         
            //Phone Choice Menu
            System.out.println("Phone Choice Options");
            textMenu.displayPhoneChoiceOptions();       	
            quit = false;
            do	{
            		System.out.println("Please choose an option. Otherwise, 0 to move onto Data Packages.");
            		menuItem	= in.nextInt();
            		if(menuItem <= textMenu.getPhoneChoiceSize() && menuItem > 0)
                  {
                        System.out.println("You selected: " + textMenu.getPhoneChoice(menuItem - 1).toString());
            				//take the selection from the menu, find it's TalkPackage from TextMenu Class
                        //set it as the Customer's Talk Package var
                        newCust.setPhoneChoice(textMenu.getPhoneChoice(menuItem - 1));
                  }
                  else if(menuItem == 0) 
                  {
                  quit = true;
                  }
                  else
                  {
                    System.out.println("Invalid Input: please enter a valid selection.");
                  }
               }
               while(!quit);
           //Data Package Option
           System.out.println("Data Package Options");
           textMenu.displayDataPackageOptions();       	
           quit = false;
           do	{
             		System.out.println("Please choose an option. 0 to Quit.");
             		menuItem	= in.nextInt();
             		if(menuItem <= textMenu.getDataPackageSize() && menuItem > 0)
                  {
                     System.out.println("You selected: " + textMenu.getDataPackage(menuItem - 1).toString());
              		   //take the selection from the menu, find it's TalkPackage from TextMenu Class
                     //set it as the customer's Talk Package var
                     newCust.setDataPackage(textMenu.getDataPackage(menuItem - 1));
                  }
                  else if(menuItem == 0) 
                  {
                     quit = true;
                  }
                  else
                  {
                     System.out.println("Invalid Input: please enter a valid selection.");
                  }
               }
               while(!quit);
               System.out.println("Your data will be stored as: " + newCust.toString());
           
               try{
                    file = new RandomAccessFile(new File("customer.txt"), "rw");
                    long FileSize = file.length();
                    file.seek(FileSize);
                    file.writeUTF(String.valueOf(newCust.getIDNum()));
                    for(int i = 0; i < 10 - String.valueOf(newCust.getIDNum()).length(); i++)
                    {
                       file.writeByte(10);
                    }
                    file.writeUTF(String.valueOf(newCust.getStartupCost()));
                    for(int i = 0; i < 10 - String.valueOf(newCust.getStartupCost()).length(); i++)
                    {
                       file.writeByte(10);
                    }
                    file.writeUTF(String.valueOf(newCust.getMonthlyBill()));
                    for(int i = 0; i < 10 - String.valueOf(newCust.getMonthlyBill()).length(); i++)
                    {
                       file.writeByte(10);
                    }     
               file.close();
               }
               catch(IOException e)
                  {
                     e.getStackTrace();
                  }
             break;
             
         case 2:
             	System.out.println("FIXME: add pieces for Search Transaction.");
               String fileIDNum = null;
               String fileMonthlyPrice = null;
            String fileStartupCost = null;
            try {
               file = new RandomAccessFile(new File("customer.txt"), "rw");
               long FileSize = file.length();
               file.seek(0);
               long NUMRecord = FileSize / RECORD;
               for (int j = 0; j < NUMRecord; j++)
               {
                  fileIDNum = file.readUTF();
                  for(int i = 0; i < 10 - fileIDNum.length(); i++)
                  {
                     file.readByte();
                  }
                  fileStartupCost = file.readUTF();
                  for(int i = 0; i < 10 - fileStartupCost.length(); i++)
                  {
                     file.readByte();
                  }
                  fileMonthlyPrice = file.readUTF();
                  for(int i = 0; i < 10 - fileMonthlyPrice.length(); i++)
                  {
                     file.readByte();
                  }
                  System.out.println("Your Customer ID Number is: " + fileIDNum +
                  " your Startup Cost was $" + fileStartupCost + 
                  " and your Monthly Bill is $" + fileMonthlyPrice);
               }
               file.close();  
             }
             catch (IOException e) {
               e.getStackTrace();
             }  
              break;
         case 0:
              initMenuQuitter = true;
              break;
         
         default: 
            	System.out.println("Invalid Selection.");
         }
      }
      while(!initMenuQuitter);
      System.out.println("Thank you, have a nice day!");
   } 
}
