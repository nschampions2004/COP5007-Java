/**
Score program that outputs a creates a Score object.  
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 2
File Name: Score.java
*/

public class Score 
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
   The Course object to be pulled in from Course
*/
   private Course inherit;

/**
   Score method that defaults
*/   
   public Score () 
   {
      
      //FIXME:  get the old values out of the piece Course class
      inherit = new Course(); 
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
*/   
   public Score (String courseName, int score, String date, double courseRating, int courseSlope)
   {
      /*if((score < 40) || (score > 200))
      {
         System.out.println("Please enter a valid 18 Hole Score.");
         score = 9999;
      }*/
            
            
      this.inherit = new Course(courseName, courseRating, courseSlope);
      setScore(score);
      setDate(date);
      //this.courseRating = courseRating;
      //this.courseSlope = courseSlope;
    }
/**
   *Accessor for course name
   @return the name of the course name
    
    public String getCourseName()
    {
      return courseName;
    }
*/
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
   *Accessor for Course object within Scores
   @return Course obj
*/
   public Course getInherit()
   {
      return inherit;
   }    
    
 
/**
   *Accessor for Score Course Rating
   @return the course rating of the Score object
    
    public double getCourseRating()
    {
      return courseRating;
    }
    */
/**
   *Accessor for Score Course Slope
   @return the course slope of the score object
   
    public int getCourseSlope()
    {
      return courseSlope;
    }  
    */
/**
   *Mutator for Score Course Name
     
    public void setCourseName(String newCourseName)
    {
        courseName = newCourseName;
    }
*/
/**
   *Mutator for Score Object's score
*/    
    public void setScore(int newScore)
    {
         score = newScore;
    }
/**
   *Mutator for Score date
*/    
    public void setDate(String setDate)
    {
         date = setDate;
    }

/**
   *Mutator for Score course rating
   
    public void setCourseRating(double newCourseRating)
    {
        courseRating = newCourseRating;
    }
*/ 
/**
   *Mutator for Score Course Slope
  
    public void setCourseSlope(int newCourseSlope)
    {
         courseSlope = newCourseSlope;
    }
*/ 
/**
   *Method for outputting nicely formatted 
*/
    public String toString() 
    {
      return getScore() + " \t " + getDate() + " \t "; //+ getCourseName() + 
      //" \t " + getCourseRating() + " \t " + //getCourseSlope() + " \n";
    }
}