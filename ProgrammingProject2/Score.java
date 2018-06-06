public class Score 
{
   private String courseName;
   
   private int score;
   
   private String date;
   
   private double courseRating;
   
   private int courseSlope;
   
   public Score() 
   {
      courseName = "__";
      score = 9999;
      date = "99/99/99";
      courseRating = 9999.99;
      courseSlope = 9999;  
   }
   
   public Score(String courseName, int score, String date, double courseRating, int courseSlope)
   {
      courseName = courseName;
      score = score;
      date = date;
      courseRating = courseRating;
      courseSlope = courseSlope;
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
      return getCourseName() + "\t" + getScore() + "\t" + getDate() + "\t" + getCourseRating() + "\t" + getCourseSlope();
    }
    
   










}