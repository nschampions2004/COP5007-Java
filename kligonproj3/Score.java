/**
Score program that outputs a creates a Score object.  
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 3
File Name: Score.java
*/

public class Score extends Course
{
/**
   The value of the entered score in the Score class
*/   
   private int score;
/**
   The date of the entered score in the Score class
*/   
   private String date;
/**
   The values representing the bounds of Course Score
*/
   private final int  HIGH_SCORE = 200;
   private final int  LOW_SCORE = 0;

/**
   Score method that defaults
*/   
   public Score () 
   {     
      score = 9999;
      date = "99/99/99";      
   }
/**
Constructs a parameterized Score Object.
@param courseName the name of the course the score was made at
@param score the score that the golfer earned between 40 and 200
@param date the date that the score was made on must be 7 chars long where the 3rd and 5th entries being '/'
@param courseRating the rating of the course between 60 and 80
@param courseSlope the slope of the course in the Score object between 55 and 155
@exception FieldOutOfBounds when the mutators attempt to set a bad Course Rating or Course Slope
*/   
   public Score (String courseName, int score, String date, double courseRating, int courseSlope)
                 throws FieldOutOfBounds
   {      
      setCourseName(courseName);
      setCourseRating(courseRating);
      setCourseSlope(courseSlope);
      setScore(score);
      setDate(date);
   }

/**
   *Accessor for Score object's Score
   @return the score of the Score object
*/    
    public int getScore()
    {
      return score;
    }
/**
   *Accessor for Score date
   @return the date of the Score object
*/    
    public String getDate()
    {
      return date;
    }
   
/**
   *Mutator for Score Object's score
   @param newScore the score to set for the Golfer's new score
   @exception FieldOutOfBounds thrown for scores out of bounds
*/    
    public void setScore(int newScore)
    {
         try
         {
            if(newScore < LOW_SCORE || newScore > HIGH_SCORE)
            {
               throw new FieldOutOfBounds
                     ("Course Score entered not between " + LOW_SCORE + " and " + HIGH_SCORE);
            }
         }
         catch (Exception FieldOutOfBounds)
         {
            newScore = 9999;
            System.out.println(FieldOutOfBounds.getMessage());
         }
         this.score = newScore;      
    }
/**
   *Mutator for Score date
   @param is the new string to set as the date
*/    
    public void setDate(String setDate)
    {
         date = setDate;
    }
/**
   *Method for outputting nicely formatted
   @return nicely formatted score printing 
*/
    @Override
    public String toString() 
    {
         String words = getScore() + " \t " + getDate() + " \t " + 
         getCourseName() + " \t " + getCourseRating() + " \t " + 
         getCourseSlope() + "\n";
         return words;
    }
}