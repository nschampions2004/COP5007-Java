public class Score 
{
   private String courseName;
   
   private int score;
   
   private String date;
   
   private double courseRating;
   
   private int courseSlope;
   
   public Score () 
   {
      courseName = "__";
      score = 9999;
      date = "99/99/99";
      courseRating = 9999.99;
      courseSlope = 9999;  
   }
   
   public Score (String courseName, int score, String date, double courseRating, int courseSlope)
   {
      this.courseName = courseName;
      this.score = score;
      this.date = date;
      this.courseRating = courseRating;
      this.courseSlope = courseSlope;
    }
    
    public String getCourseName()
    {
      return courseName;
    }
    
    public int getScore()
    {
      return score;
    }
    
    public String getDate()
    {
      return date;
    }
    
    public double getCourseRating()
    {
      return courseRating;
    }
    
    public int getCourseSlope()
    {
      return courseSlope;
    }  
      
    public String toString() 
    {
      return getScore() + " \t " + getDate() + " \t " + getCourseName() + 
      " \t " + getCourseRating() + " \t " + getCourseSlope() + " \n ";
    }
 
   










}