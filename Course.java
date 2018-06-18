/**
Course program that outputs a creates a Course object.  
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 3
File Name: Course.java
*/
public class Course
{
/**
   The course name entered for the course.
*/
   private String courseName;
/**
   The course rating entered for the course.
*/
   private  double courseRating;
/**
   The value entered for course's slope
*/
   private int courseSlope;

/**
   This is the default constructor for the Course Class
*/ 
   public Course () 
   {
      courseName = "___";
      courseRating = 9999.99;
      courseSlope = 9999;
   }
/**
   This is the parameterized constructor for the Course Class
   @param courseName the name of the course the score was made at
   @param courseRating the rating of the course between 60 and 80
   @param courseSlope the slope of the course in the Score object between 55 and 155
*/   
   public Course(String courseName, double courseRating, int courseSlope)
   {
      final int  HIGH_COURSERATING = 80;
      final int  LOW_COURSERATING = 60;
      final int  HIGH_COURSESLOPE = 55;
      final int  LOW_COURSESLOPE = 155;
      /* fixme add exceptions here */
      this.courseName = courseName;
      this.courseRating = courseRating;
      this.courseSlope = courseSlope;
   }
   
/** 
   This accessor gets the courseName from a Course object
*/
   public String getCourseName() 
   {
      return courseName;
   }
/** 
   This accessor gets the courseRating from a Course object
*/
   public double getCourseRating()
   {
      return courseRating;
   }
/** 
   This accessor gets the courseSlope from a Course object
*/
   public int getCourseSlope()
   {
      return courseSlope;
   }
/**
   This mutator sets the courseName for a Course object
*/
   public void setCourseName(String newCourseName)
   {
      this.courseName = newCourseName;
   }
/**
   This mutator sets the courseRating for a Course object
*/
   public void setCourseRating(double newCourseRating)
   {
      this.courseRating = newCourseRating;
   } 
/**
   This mutator sets the courseSlope for a Course object
*/
   public void setCourseSlope(int newCourseSlope)
   {
      this.courseSlope = newCourseSlope;
   }


   




}

