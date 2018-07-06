/**
The read-in file for the text menu options
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 4
File Name: FileReadIn.java
*/
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class FileReadIn 
   throws IOException
{
//set up the connection to planReadin.txt
   Scanner in = new Scanner(System.in);
   FileInputStream fileByteStream = null;
   Scanner inFS = null;
   Integer menuOpts;
   int numberOfOptions;
   String baseClass;
   //Array lists for options
   ArrayList<MonthlyTalkPackage> talkPackages = new ArrayList<MonthlyTalkPackage>( );
   ArrayList<PhoneChoice> phoneChoices = new ArrayList<PhoneChoice>( );
   ArrayList<DataPackage> dataPackages = new ArrayList<DataPackage>( );

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
}
