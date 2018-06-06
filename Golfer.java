/**
Golfer program that outputs a golfer's name, home course, id number, and an Array of Score Objects.  
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 2
File Name: Golfer.java
*/
import java.util.Arrays;

public class Golfer {
/**
   The golfer in question.
*/
   private String name;

/**
   The home course of the Golfer.
*/
   private String homeCourse;
/**
   The id of the golfer.
*/
   private int idNum;
/**
   Storage of the golfer's scores.
*/
   private int[] scores;
/**
   Counter of Golfer's IdNum
*/
   private static int nextIdNum = 999;
/**
   Golfer method that defaults.
*/
   public Golfer() 
   {
  
      name = "__";
      homeCourse = "__";
      idNum = 9999;
      this.name = name;
      this.homeCourse = homeCourse;
      this.idNum = idNum;
      final int LENGTH = 20;
      String[] values = new String[LENGTH];
      }
/**
*Constructs a parameterized Golfer Object.
*@param name the name of the golpher
*@param homeCourse the home course corresponding to the golfer in question
*/    
   public Golfer(String name, String homeCourse)
   {
      idNum = 0;
      nextIdNum++;
      this.idNum = nextIdNum;
      this.name = name;
      this.homeCourse = homeCourse;
      final int LENGTH = 20;
      String[] values = new String[LENGTH];
   }   


   public String toString() 
   {
      String words;
      words = this.name + " ID Number: " + this.idNum + " Home Course: " + this.homeCourse + "\n" + "Score" +
      "\t" + "Date" + "\t" + "Course" + "\t" + "Course Rating" + "\t" + "Course Slope" + "\n";
      return words;
   }

/**
   Accessor for Golfer Name
*/
   public String getName() 
   {
      return name;
   }
/**
   Accessor for homeCourse
*/   
   public String getHomeCourse()
   {
      return homeCourse;
   }
     
/** 
   Accessor for idNum 
*/
   public int getIdNum()
   {
      return idNum;
   }
/**
   Mutator of name
*/
   public String setName(String newName)
   {
      name = newName;
      return name;
   }
/**
   Mutator of home course
*/
   public String setHomeCourse(String newHomeCourse)
   {
      homeCourse = newHomeCourse;
      return homeCourse;
   }
/**
   Mutator for idNum 
*/ 
   public int setIdNum()
   {
      nextIdNum++;
      idNum = nextIdNum;
      return idNum;
   }



}   