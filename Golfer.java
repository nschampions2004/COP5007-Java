/**
Golfer program that outputs a golfer's name, home course, 
id number, and an Array of Score Objects.  
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 3
File Name: Golfer.java
*/
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Collections;

public class Golfer extends Player
{

/**
   The home course of the Golfer.
*/
   private String homeCourse;

/**
   Storage of the golfer's scores as an Array List.
*/
   private ArrayList<Score> scores = new ArrayList<Score>( );

/**
   Setter for error method
*/
   private static int NOTFOUND = -1;


/**
   Golfer method that defaults.
*/
   public Golfer() 
   {  
      super( );
   }
/**
*Constructs a parameterized Golfer Object.
*@param name the name of the golfer
*@param homeCourse the home course corresponding to 
   the golfer in question
*/    
   public Golfer(String name, String homeCourse)
   {
      super(name) ;
      setHomeCourse(homeCourse);
      this.scores = scores;
      setIDNum();
      
   }   
/**
Formats the Golfer constructer with 
the Table header and Score Array list
@return a nicely formatted list 
describing the golfer and their recorded scores.  
*/
   public String toString() 
   {
      DecimalFormat dF = new DecimalFormat("#.00");
      String numberAsString = dF.format(calculateHandicap());
      String words = getName() + "\t ID number: " + getIDNum() + "\t Home Course: " + getHomeCourse() + 
      "\t Current Handicap " + numberAsString + " \n";
      if(scores.isEmpty())
      {
         //sets the initial line of words to the header line in for the Golfer class
         return words;   
      }
      else
      {
         //loop through ArrayList
         for(int i = 0; i < scores.size(); i++)
         {
            //take that header block and add the toStrings
            words = words + scores.get(i).toString();
         }
         return words;
      }
      
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
   This adds a score to the scores array.
   @param addCourseName this adds the course name to the Score class which will be used to add to the Golfer's info
   @param addScore this adds the score to the Score class which will be used to add to the Golfer's info
   @param addDate this adds the date to the Score class which will be used to add to the Golfer's info
   @param addCourseRating this adds the course rating to the Score class which will be used to add to the Golfer's info
   @param addCourseSlope this adds the course slope to the Score class which will be used to add to the Golfer's info
*/


   public void addScore(String addCourseName, int addScore, String addDate, double addCourseRating, int addCourseSlope)
   {
      scores.add(new Score(addCourseName, addScore, addDate, addCourseRating, addCourseSlope));
   }

/**
*This private method finds the entry in the array with the date that is passed into it.
@param dateToFind is the value we pass into locate within the array.
@return k the index of an array when a date is found
@return NOTFOUND = -1 when a date in an array of Score Object is not found
*/
   private int findScore(String dateToFind)
   {
      int k = -1;
      
      if(scores.isEmpty())
      {
         return NOTFOUND;
      }
      else
      {
         for(int i = 0; i < scores.size(); i++)
         {
            if(scores.get(i).getDate().equals(dateToFind))
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
    }      

/**
*This public method gets the Score object in the scores array based on a passed in Date.
@param checker is the value we pass in to locate within the array.
@return null if the the findScore method returns -1
@return the Score object matching the index found by the findScore method
*/

   public Score getScore(String checker)
   {
      int i = -1;
      if(findScore(checker) == NOTFOUND)
      {
         return null;
      }
      else
      {
         i = findScore(checker);
         return scores.get(i);
      }
   }
/**
*This public method gets the Score object with the lowest score.  Null if no scores entered.  
@return the Score object matching the lowest score in the scores array, null if k equals -1
*/
   public Score lowestScore()
   {
      Score lowestScore = new Score();
      //highest golf score
      int SMALL_SO_FAR = 1000;
      //scores empty = notfound sent back
      if(scores.isEmpty())
      {
         return null;
      }
      //loop through the arrayList, updating lowest score with .getScore() in Score class 
      //store the Score object in lowestScore
      else
      {
         for(int i = 0; i < scores.size(); i++)
         {
            if(scores.get(i).getScore() < SMALL_SO_FAR)
            {
               SMALL_SO_FAR = scores.get(i).getScore();
               lowestScore = scores.get(i);  
            }
          }
          return lowestScore;
      }
    }
 /**
*This public method returns true or false based on whether or not a date is found and the entry deleted
@return true when a date is found in the scores array and deleted
@return false when a date is found in the scores array is not found
*/
   public boolean deleteScore(String dateCheck)
   {
      if(findScore(dateCheck) == -1)
      {
         return false;
      }
      else
      {
         scores.remove(findScore(dateCheck));
         return true;
      }
   }
/**
*This public method returns the Golfer's handicap based on the 10 most recent scores entered in for the 
golfer.
@returns handicap after calculating the differentials, average of diffs, 96% of that number, and rounded to 2 spots. 
@exception if scores array is less than 10 items
*/
   @Override
   public double calculateHandicap() 
                  throws FieldOutOfBounds
   {
      
      double diffAvg;
      double diffSum = 0.0;
      final double HANDI_CONST = 113.0;
      final double HANDI_MULT = 0.96;
      try 
      {
         if(scores.isEmpty() || scores.size() < 10)
         {
            throw new FieldOutOfBounds   
                        ("Not enough scores entered to calculate handicap");
         }
         else
         {
            ArrayList<Double> diffs = new ArrayList<Double>( ); 
            for(int i = scores.size() - 1; i > scores.size() - 11; i--)
            {
               //calculating differentials
               double sub = (scores.get(i).getScore() - scores.get(i).getCourseRating());
               sub = sub * HANDI_CONST / scores.get(i).getCourseSlope(); 
               diffs.add(sub);
            }
            //sort the differentials from lowest to highest
            Collections.sort(diffs);
            //pull out the first 5 and sum them
            for(int k = 0; k < 5; k++)
            {
               diffSum = diffSum + diffs.get(k);
            }
            //compute the avg 
            diffAvg = diffSum / 5 ;
            //multiply by 0.96
            diffAvg = diffAvg * HANDI_MULT;
            DecimalFormat dF = new DecimalFormat("#.00");
            diffAvg = Double.valueOf(dF.format(diffAvg));
         }
       }
       catch (Exception FieldOutOfBounds)
       {
         diffAvg = 9999.99;
         System.out.println(FieldOutOfBounds.getMessage()); 
       }            
       
       return diffAvg;
       }
     
}   