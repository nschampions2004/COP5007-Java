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
      if(score < 40 || score > 200)
      {
         System.out.println("Please enter a valid 18 Hole Score.");
         score = 9999;
      }
      if(courseRating < 60 || courseRating > 80)
      {
         System.out.println("Please enter a valid Course Rating.");
         courseRating = 9999;
      }
      if(courseSlope < 55 || courseSlope > 155)
      {
         System.out.println("Please enter a valid Course Slope.");
         courseSlope = 9999;
      }
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
      
    public void setCourseName(String newCourseName)
    {
        courseName = newCourseName;
    }
    
    public void setScore(int newScore)
    {
         score = newScore;
    }
    
    public void setDate(String setDate)
    {
         date = setDate;
    }
    
    public void setCourseRating(double newCourseRating)
    {
        courseRating = newCourseRating;
    }
    
    public void setCourseSlope(int newCourseSlope)
    {
         courseSlope = newCourseSlope;
    }
     
    public String toString() 
    {
      return getScore() + " \t " + getDate() + " \t " + getCourseName() + 
      " \t " + getCourseRating() + " \t " + getCourseSlope() + " \n ";
    }
 
   










}