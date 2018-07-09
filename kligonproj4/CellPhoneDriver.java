/**
A class to test the Cell Phone Project's classes.
@author Kyle Ligon
@version 1.0

COP5007	Project #: 4
File Name: CellPhoneDriver.java
*/
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;


public class CellPhoneDriver
{
   /**
      the length of one record in the Random Access File
   */
   private static final int RECORD = 30;
   
   public static void main(String[] args) 
   {
         //call the read-in method         
         Customer newCust = new Customer();
         TextMenu textMenu = new TextMenu();
                  RandomAccessFile file;
         try
         {
            textMenu.fileReadin(); 
         }
         catch (Exception IOException)
         {
            System.out.println("wasn't able to open file\n");
         }
         //start of the menu
         boolean initMenuQuitter = false;
         Scanner in = new Scanner(System.in);
         int initMenuItem;
         do
         {
            System.out.println("Select the from the following options: \n");
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
                  
                  System.out.println("Please enter the house number and street of your address below");
                  newCust.setAddress(in.nextLine());
                  
                  System.out.println("Please enter the city you live in below");
                  newCust.setCity(in.nextLine());
                  
                  System.out.println("Please enter the state you live in");
                  newCust.setState(in.nextLine());
                  
                  System.out.println("Please enter your zip code below");
                  while (!in.hasNext("[0-9]{5}"))
                  {
                     System.out.println("Please use 5 numerical digits for the ZipCode");
                     in.nextLine();
                  }
                  newCust.setZipCode(in.nextLine().trim());
                  newCust.setShippingCost(newCust.getZipCode());
                                    
                  System.out.println("Please enter your phone number below");
                  newCust.setPhoneNumber(in.nextLine().trim());
                  
                  //setting ID Number
                  newCust.setIDNum();         
                  //print menu for Talk Minutes
               	System.out.println("Monthly Talk Plans");
                  System.out.println("Please choose an option. Otherwise, 0 to move onto Phone Model.");
                  textMenu.displayTalkPackagesOptions();       	
                	boolean quit =	false;
               	int menuItem;
                  do	
                  {
               		menuItem	= in.nextInt();
                     if(menuItem <= textMenu.getTalkPackageSize() && menuItem > 0)
                     {
                           System.out.println("You selected: " + textMenu.getTalkPackage(menuItem - 1).toString() + 
                           "\n\tTo change your selection, enter a new package option.  Otherwise, enter 0 to move on to Phone Choices");
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
                  System.out.println("Please choose an option. Otherwise, 0 to move onto Data Packages.");
                  do	{
                  		menuItem	= in.nextInt();
                  		if(menuItem <= textMenu.getPhoneChoiceSize() && menuItem > 0)
                        {
                              System.out.println("You selected: " + textMenu.getPhoneChoice(menuItem - 1).toString() +
                              "\n\tTo change your selection, enter a new package option.  Otherwise, enter 0 to move on to Data Packages");
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
                 System.out.println("Please choose an option.  Otherwise 0 to Quit.");
                 do	{
                   		menuItem	= in.nextInt();
                   		if(menuItem <= textMenu.getDataPackageSize() && menuItem > 0)
                        {
                           System.out.println("You selected: " + textMenu.getDataPackage(menuItem - 1).toString() +
                           "\n\tTo change your selection, enter a new package option.  Otherwise, enter 0 to Exit");
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
      
                     String fileIDNum = null;
                     String fileMonthlyPrice = null;
                     String fileStartupCost = null;
                     int customerIDToSearch;
                     System.out.println("Please enter your Customer ID Number");
                     DecimalFormat df = new DecimalFormat("#.00");
                     customerIDToSearch = in.nextInt();
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
                           if(Integer.valueOf(fileIDNum).equals(customerIDToSearch))
                           {
                              System.out.println("Your Customer ID Number is: " + fileIDNum +
                              ".  Your Startup Cost was $" + df.format(Double.valueOf(fileStartupCost)) + 
                              ".  Your Monthly Bill is $" + df.format(Double.valueOf(fileMonthlyPrice)));
                           }
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
