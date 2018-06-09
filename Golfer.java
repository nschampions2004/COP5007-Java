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
   private Score[] scores = new Score[100];
/**
   Counter of Golfer's IdNum
*/
   private static int nextIdNum = 999;
/**
   Counter for Golfer's Array
*/
   private static int i;

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
      Score[] values = new Score[LENGTH];
      values = this.scores;
     }
/**
*Constructs a parameterized Golfer Object.
*@param name the name of the golpher
*@param homeCourse the home course corresponding to the golfer in question
*/    
   public Golfer(String name, String homeCourse)
   {
      int currentSize = 0;
      idNum = 0;
      nextIdNum++;
      this.idNum = nextIdNum;
      this.name = name;
      this.homeCourse = homeCourse;
      final int LENGTH = 20;
      Score[] values = new Score[LENGTH];
      values = this.scores;
   }   
/**
Formats the Golfer constructer with the Table header and Score Array list
*/
   public String toString() 
   {
      String words = "";
      boolean empty = true;
      for (int i = 0; i < scores.length; i++)
      {
         if(scores[i] == null)
         {
            empty = false;
            words = this.name + " ID Number: " + this.idNum + " Home Course: " + this.homeCourse + " \n " + "Score" +
         " \t " + "Date" + " \t " + "Course" + " \t " + "Course Rating" + " \t " + "Course Slope" + " \n ";
            break;
         }
         else 
         {
         words = this.name + " ID Number: " + this.idNum + " Home Course: " + this.homeCourse + " \n " + "Score" +
         " \t " + "Date" + " \t " + "Course" + " \t " + "Course Rating" + " \t " + "Course Slope" + " \n " + 
         Arrays.asList(scores).toString().replaceFirst("]", "").replace(", ", "").replace("[","");
         }
       }  
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
   public void setName(String newName)
   {
      if (newName == null)
      { 
         System.out.println("Error: must input a new name."); 
      }
      else 
      {
         name = newName;
      }
   }
/**
   Mutator of home course
*/
   public void setHomeCourse(String newHomeCourse)
   {
      if (newHomeCourse == null) 
      {
         System.out.println("Error: must input a new home course");
      }
      else
      {
         homeCourse = newHomeCourse;
      }
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

/**   
   This adds a score to the scores array. 
*/

   public void addScore(String addCourseName, int addScore, String addDate, double addCourseRating, int addCourseSlope)
   {
      int z = 0;
      Score temp = new Score(addCourseName, addScore, addDate, addCourseRating, addCourseSlope);
      for(int i = 0; i < scores.length; i++)
      {
         if(scores[i] != null)
         {
             z++;
         }
      }
      Score[] copy = new Score[z + 1];
      for(i = 0; i < z; i++)
      {
         copy[i] = scores[i];
      }
      copy[z] = temp;
      this.scores = copy;
    }

/**
*This private method finds the entry in the array with the date that is passed into it.
*@param dateToFind is the value we pass into locate within the array.
*/
   private int findScore(String dateToFind)
   {
   int k = -1;
   int NOTFOUND = -1;
   for(int i = 0; i < scores.length; i++)
   {
      if(scores[i].getDate() == dateToFind)
      {
         k = i;
         break;
      }
   }
   if(k != -1)
   {
      return k;
   }
   else
   {
      return NOTFOUND;
   }
   }      

/**
*This public method gets the Score object in the scores array based on a passed in Date.
*@param checker is the value we pass in to locate within the array.
*/

   public Score getScore(String checker)
   {
      int i = -1;
      if(findScore(checker) == -1)
      {
         return null;
      }
      else
      {
         i = findScore(checker);
         return scores[i];
      }
   }
/**
*This public method gets the Score object with the lowest score.  Null if no scores entered.  
*/
   public Score lowestScore()
   {
      int k = -1;
      int smallSoFar = 201;
         
      for(int i = 0; i < scores.length; i++)
      {
         if(i == 0)
         {
            smallSoFar = scores[0].getScoreVal();
            k = 0;
         }
         else if(scores[i].getScoreVal() < smallSoFar)
         {
            k = i;
            smallSoFar = scores[i].getScoreVal();
         }
      }  
      
      return scores[k];
   }
/**
*This public method returns true or false based on whether or not a date is found and the entry deleted
*/
   public boolean deleteScore(String dateCheck)
   {
      Score[] temp = new Score[scores.length - 1];
      if(findScore(dateCheck) == -1)
      {
         return false;
      }
      else
      {
      for(int i = 0; i < findScore(dateCheck); i++)
      {
            temp[i] = scores[i];
      }
      for(i = findScore(dateCheck) + 1; i < scores.length; i++)
      {
         temp[i] = scores[i];
      }
      scores = temp;
      return true;
      }
   }


}   