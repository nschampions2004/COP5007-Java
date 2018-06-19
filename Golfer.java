/**
Golfer program that outputs a golfer's name, home course, 
id number, and an Array of Score Objects.  
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 3
File Name: Golfer.java
*/
import java.util.ArrayList;


public class Golfer extends Player {
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
   Storage of the golfer's scores as an Array List.
*/
   private ArrayList<Score> scores = new ArrayList<Score>( );
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
      scores = null;
      // array list of score objects
      
     }
/**
*Constructs a parameterized Golfer Object.
*@param name the name of the golpher
*@param homeCourse the home course corresponding to 
   the golfer in question
*/    
   public Golfer(String name, String homeCourse)
   {
      nextIdNum++;
      this.idNum = nextIdNum;
      this.name = name;
      this.homeCourse = homeCourse;
      this.scores = scores;
   }   
/**
Formats the Golfer constructer with 
the Table header and Score Array list
@return a nicely formatted list 
describing the golfer and their recorded scores.  
*/
   public String toString() 
   {
      //sets the initial line of words to the header line in for the Golfer class
      String words = getName() + "  " + getHomeCourse() + " \n";
      //loop through ArrayList
      for(int i = 0; i < scores.size(); i++)
      {
         //take that header block and add the toString
         words = words + scores.get(i).toString();
      }
      return words;
   }


/**
   *Accessor for Golfer Name
   @return the name of the golfer
*/
   public String getName() 
   {
      return name;
   }
/**
   Accessor for homeCourse
   @return the name of the home course of the golfer
*/   
   public String getHomeCourse()
   {
      return homeCourse;
   }
        
/** 
   Accessor for idNum 
   @return the id number of the golfer
*/
   public int getIdNum()
   {
      return idNum;
   }
/**
   Mutator of name
   @param newName sets the name of the golfer
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
   @param newHomeCourse sets the name of the home course
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
   @return returns the new id number of the golfer
*/ 
   public void setIdNum()
   {
      
      idNum = nextIdNum;
      nextIdNum++;
   }

/**   
   This adds a score to the scores array.
   @param addCourseName this adds the course name to the Score class which will be used to add to the Golfer's info
   @param addScore this adds the score to the Score class which will be used to add to the Golfer's info
   @param addDate this adds the date to the Score class which will be used to add to the Golfer's info
   @param addCourseRating this adds the course rating to the Score class which will be used to add to the Golfer's info
   @param addCourseSlope this adds the course slope to the Score class which will be used to add to the Golfer's info
*/


   public void addScore(String addCourseName, int addScore, String addDate, double addCourseRating, int addCourseSlope)
   {
      //loop through the index of scores ArrayList
      for(int i = 0; i < scores.size(); i++)
      {
         //check to see if the value at the ith index is empty, then add the score object to the arraylist
         if(scores.get(i) == null)
         {
             scores.add(new Score(addCourseName, addScore, addDate, addCourseRating, addCourseSlope));
         }
         
      }
    }

// /**
// *This private method finds the entry in the array with the date that is passed into it.
// @param dateToFind is the value we pass into locate within the array.
// @return k the index of an array when a date is found
// @return NOTFOUND = -1 when a date in an array of Score Object is not found
// */
//    private int findScore(String dateToFind)
//    {
//       int k = -1;
//       int NOTFOUND = -1;
//       for(int i = 0; i < scores.length; i++)
//       {
//          if(scores[i].getDate().equals(dateToFind))
//          {
//             k = i;
//             break;
//          }
//       }
//       if(k != -1)
//       {
//          return k;
//       }
//       else
//       {
//          return NOTFOUND;
//       }
//    }      
// 
// /**
// *This public method gets the Score object in the scores array based on a passed in Date.
// @param checker is the value we pass in to locate within the array.
// @return null if the the findScore method returns -1
// @return the Score object matching the index found by the findScore method
// */
// 
//    public Score getScore(String checker)
//    {
//       int i = -1;
//       if(findScore(checker) == -1)
//       {
//          return null;
//       }
//       else
//       {
//          i = findScore(checker);
//          return scores[i];
//       }
//    }
// /**
// *This public method gets the Score object with the lowest score.  Null if no scores entered.  
// @return the Score object matching the lowest score in the scores array, null if k equals -1
// */
//   
//    public Score lowestScore()
//    {
//       Score lowest = new Score();
//       int smallSoFar = 201;
//       if(scores[0] == null)
//       {
//          return null;
//       }
//       else
//       {
//          for(int i = 0; i < scores.length; i++)
//          {
//             lowest = scores[0];
//             if(scores[i] == null)
//             {
//                break;
//             }
//             if(scores[i].getScore() < lowest.getScore())
//             {
//                lowest = scores[i];
//             }
//                
//           }
//           return lowest;
//       }  
//     }
// /**
// *This public method returns true or false based on whether or not a date is found and the entry deleted
// @return true when a date is found in the scores array and deleted
// @return false when a date is found in the scores array is not found
// */
//    public boolean deleteScore(String dateCheck)
//    {
//       Score[] temp = new Score[scores.length - 1];
//       if(findScore(dateCheck) == -1)
//       {
//          return false;
//       }
//       else
//       {
//          for(int i = 0; i < findScore(dateCheck); i++)
//          {
//                temp[i] = scores[i];
//          }
//          for(i = findScore(dateCheck) + 1; i < scores.length; i++)
//          {
//             temp[i - 1] = scores[i];
//          }
//       scores = temp;
//       return true;
//       }
//    }


}   