/**
A class to test the Cell Phone Project's classes.
@author Kyle Ligon
@version 1.0

COP5007	Project #: 4
File Name: CellPhoneDriver.java
*/
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class CellPhoneDriver
{
   public static void main(String[] args) 
   {
         //call the read-in method
         TextMenu textMenu = new TextMenu();
         Customer newCust = new Customer();
         try
         {
            textMenu.fileReadin(); 
         }
         catch (Exception IOException)
         {
            System.out.println("wasn't able to open file");
         }
         
         //start of the menu
         System.out.println("Select the from the following options: ");
         System.out.println("\t 1) Buy a Phone and Build a Bill");
         System.out.println("\t 2) Search for your bill");
         Scanner in = new Scanner(System.in);
         int initMenuItem;
         if(in.nextInt() == 1)
         {
            //print menu for Talk Minutes
         	System.out.println("Monthly Talk Plans");
            textMenu.displayTalkPackagesOptions();       	
          	boolean quit =	false;
         	int menuItem;
            do	{
         		System.out.println("Please choose an option. Otherwise, 0 to move onto Phone Model.");
         		menuItem	= in.nextInt();
         		switch (menuItem)	{
         		case 1:
                     System.out.println("You selected: " + textMenu.getTalkPackage(menuItem - 1).toString());
         				//take the selection from the menu, find it's TalkPackage from TextMenu Class
                     //set it as the customer's Talk Package var
                     newCust.setMonthlyTalkPackage(textMenu.getTalkPackage(menuItem - 1));
                     break;
         		case 2:
         				System.out.println("You selected: " + textMenu.getTalkPackage(menuItem - 1).toString());
         				//take the selection from the menu, find it's TalkPackage from TextMenu Class
                     //set it as the customer's Talk Package var
                     newCust.setMonthlyTalkPackage(textMenu.getTalkPackage(menuItem - 1));
         				break;
         		case 3: 
         				System.out.println("You selected: " + textMenu.getTalkPackage(menuItem - 1).toString());
         				//take the selection from the menu, find it's TalkPackage from TextMenu Class
                     //set it as the customer's Talk Package var
                     newCust.setMonthlyTalkPackage(textMenu.getTalkPackage(menuItem - 1));         				
                     break;
         		case 0:
         				quit = true;
         				break;
         		default:
         				System.out.println("Invalid choice.");
         		}
         		}
         		while	(!quit);
         //Phone Choice Menu
         System.out.println("Phone Choice Options");
         textMenu.displayDataPackageOptions();       	
         quit = false;
         do	{
         		System.out.println("Please choose an option. Otherwise, 0 to move onto Data Packages.");
         		menuItem	= in.nextInt();
         		switch (menuItem)	{
         		case 1:
                     System.out.println("You selected: " + textMenu.getPhoneChoice(menuItem - 1).toString());
         				//take the selection from the menu, find it's TalkPackage from TextMenu Class
                     //set it as the customer's Talk Package var
                     newCust.setPhoneChoice(textMenu.getPhoneChoice(menuItem - 1));
                     break;
         		case 2:
         				System.out.println("You selected: " + textMenu.getPhoneChoice(menuItem - 1).toString());
                     newCust.setPhoneChoice(textMenu.getPhoneChoice(menuItem - 1));
                     break;
         		case 3: 
         				System.out.println("You selected: " + textMenu.getPhoneChoice(menuItem - 1).toString());
                     newCust.setPhoneChoice(textMenu.getPhoneChoice(menuItem - 1));
                     break;
         		case 0:
         				quit = true;
         				break;
         		default:
         				System.out.println("Invalid choice.");
         		}
         		}
         		while	(!quit);
         //Data Package Option
         System.out.println("Data Package Options");
         textMenu.displayDataPackageOptions();       	
         quit = false;
         do	{
         		System.out.println("Please choose an option. 0 to Quit.");
         		menuItem	= in.nextInt();
         		switch (menuItem)	{
         		case 1:
                     System.out.println("You selected: " + textMenu.getDataPackage(menuItem - 1).toString());
         				//take the selection from the menu, find it's TalkPackage from TextMenu Class
                     //set it as the customer's Talk Package var
                     newCust.setDataPackage(textMenu.getDataPackage(menuItem - 1));
                     break;
         		case 2:
         				System.out.println("You selected: " + textMenu.getDataPackage(menuItem - 1).toString());
                     newCust.setDataPackage(textMenu.getDataPackage(menuItem - 1));
                     break;
         		case 3: 
         				System.out.println("You selected: " + textMenu.getDataPackage(menuItem - 1).toString());
                     newCust.setDataPackage(textMenu.getDataPackage(menuItem - 1));
                     break;
         		case 0:
         				quit = true;
         				break;
         		default:
         				System.out.println("Invalid choice.");
         		}
         		}
         		while	(!quit);

         }
         else if(in.nextInt()	==	2)
         {
         	System.out.println("FIXME: add pieces for Search Transaction.");
         }
         else
         {
         	System.out.println("Invalid Selection.");
         }
   } 
}
