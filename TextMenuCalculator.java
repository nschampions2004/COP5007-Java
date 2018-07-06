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
      
   {
   
   //initial branch screen
   System.out.println("Select the from the following options: ");
   System.out.println("\t 1) Buy a Phone and Build a Bill");
   System.out.println("\t 2) Search for your bill");
   int initMenuItem;
   if(in.nextInt() == 1)
   {
   	//print menu for Talk Minutes
   	System.out.println("Monthly Talk Plans");
      for (int i = 1; i	< talkPackages.size() +	1;	i++)
   	
   		System.out.println(i	+ "."	+ talkPackages.get(i	- 1));
   	
   	System.out.println("0. Move on to Phone Model");
   	boolean quit =	false;
   	int menuItem;
   	do	{
   			System.out.println("Please choose an option. Otherwise, 0 to move onto Phone Model.");
   			menuItem	= in.nextInt();
   			switch (menuItem)	{
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
   			while	(!quit);
            //FIXME: add line here to set plan for customer for Monthly Talk Packages
   			System.out.println("Thank you for choosing.");
   	
   	//print menu for Phone Choice
   	System.out.println("Phone Choice");
      //reset quit variable
      quit = false;
      for (int	i = 1; i	< phoneChoices.size() +	1;	i++)
   	
   		System.out.println(i	+ "."	+ phoneChoices.get(i	- 1));
   	
   	System.out.println("0. Move on to Phone Model");
   	do	{
   			System.out.println("Please choose an option. Otherwise, 0 to move onto Data Packages.");
   			menuItem	= in.nextInt();
   			switch (menuItem)	{
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
   			while	(!quit);
            //FIXME: add line here to set plan for customer for phone choice
   			System.out.println("Thank you for choosing.");
   			
   	//print menu for Data Package	Choice
      System.out.println("Monthly Data Plans");
      //reset quit variable
      quit = false;
   	for (int	i = 1; i	< dataPackages.size() +	1;	i++)
   	
   		System.out.println(i	+ "."	+ dataPackages.get(i	- 1));
   	
   	System.out.println("0. Quit");
   	do	{
   			System.out.println("Please choose an option. Otherwise, 0 to exit: ");
   			menuItem	= in.nextInt();
   			switch (menuItem)	{
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
   			while	(!quit);
            //FIXME: add line here to set plan for customer for Monthly Data Transactions
   			System.out.println("Thank you for choosing.");
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