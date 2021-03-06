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
   private double courseRating;
/**
   The value entered for course's slope
*/
   private int courseSlope;
/**
   The values representing the bounds of Course Rating
*/
   private final int  HIGH_COURSERATING = 80;
   private final int  LOW_COURSERATING = 60;
/**
   The values representing the bounds of Course Slope
*/
   private final int  LOW_COURSESLOPE = 55;
   private final int  HIGH_COURSESLOPE = 155;

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
   @exception FieldOutOfBounds Exception for CourseSlope out of bounds
   @exception FieldOutOfBounds Exception for CourseRating out of bounds
*/   
   public Course(String courseName, double courseRating, int courseSlope)
                  throws FieldOutOfBounds
   {
      setCourseName(courseName);
      setCourseRating(courseRating);
      setCourseSlope(courseSlope);
   }
   
/** 
   This accessor gets the courseName from a Course object
   @return courseName the name of the course
*/
   public String getCourseName() 
   {
      return courseName;
   }
/** 
   This accessor gets the courseRating from a Course object
   @return courseRating the rating of the course rating
*/
   public double getCourseRating()
   {
      return courseRating;
   }
/** 
   This accessor gets the courseSlope from a Course object
   @return courseSlope the slope of the course
*/
   public int getCourseSlope()
   {
      return courseSlope;
   }
/**
   This mutator sets the courseName for a Course object
   @param newCourseName new Course Name to replace regular value
*/
   public void setCourseName(String newCourseName)
   {
      this.courseName = newCourseName;
   }
/**
   This mutator sets the courseRating for a Course object
   @param newCourseRating the new course rating to alter Course Rating
   @exception FieldOutOfBounds Exception for Course Rating out of bounds
*/
   public void setCourseRating(double newCourseRating)
   {
      try
      {
         if ( newCourseRating < LOW_COURSERATING || newCourseRating > HIGH_COURSERATING)
         {
            throw new FieldOutOfBounds
                        ("Course Rating entered not between " + LOW_COURSERATING +
                        " and " + HIGH_COURSERATING);
         }
      }
      catch (Exception FieldOutOfBounds)
      {
         newCourseRating = 9999.99;
         System.out.println(FieldOutOfBounds.getMessage());
      }
      this.courseRating = newCourseRating;
   } 
/**
   This mutator sets the courseSlope for a Course object
   @param newCourseSlope sets the new value of the Course Slope
   @exception FieldOutOfBounds for the new value of course slope being out of bounds
*/
   public void setCourseSlope(int newCourseSlope)
   {
      try
      {
         if ( newCourseSlope < LOW_COURSESLOPE || newCourseSlope > HIGH_COURSESLOPE)
         {
            throw new FieldOutOfBounds
                        ("Course Slope entered not between " + LOW_COURSESLOPE + 
                        " and " + HIGH_COURSESLOPE);
         }
       }
       catch (Exception FieldOutOfBounds)
       {
            newCourseSlope = 9999;
            System.out.println(FieldOutOfBounds.getMessage());
       }
      this.courseSlope = newCourseSlope;
   }
/**
   This returns a nicely formatted string of the Course Class
*/
   public String toString()
   {
      String words = getCourseName() + " \t " + getCourseRating() + " \t " + getCourseSlope();
      return words;
   }
   
   
}

