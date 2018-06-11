/**
A class to test the Golfer and Score classes.
@author Kyle Ligon
@version 1.0

COP5007	Project #: 2
File Name: GolferTest.java
*/ 
import java.util.Arrays;

public class GolferTest 
{
   public static void main (String[] args)
   {
     System.out.println("***Tests Default Values***");
     Golfer rappa = new Golfer();
     System.out.println(rappa);
     System.out.println("Expected: __ ID Number: 9999 Home Course: __ \n Score \t Date \t Course \t Course Rating \t Course Slope \n");
     

     
     System.out.println("***Tests Passed Through Values***");
     Golfer hambag = new Golfer("Hambag", "Richmond");
     System.out.println(hambag);
     System.out.println("Expect: Hambag ID Number: 1000 Home Course: Richmond \n Score \t Date \t Course \t Course Rating \t Course Slope \n");
     
     System.out.println("***Tests getName(), getHomeCourse(), and getIdNum() Accessors***");
     Golfer hobby = new Golfer("Sherry B.", "Harry Hollow");
     System.out.println(hobby.getName() + " " + hobby.getHomeCourse() + " " + hobby.getIdNum());
     System.out.println("Expected: Sherry B. Harry Hollow 1001 \n");
     
     System.out.println("***Tests setName(), setHomeCourse(), and setIdNum() Mutators***");
     Golfer harriet = new Golfer("Harriet Tubs", "August, AK");
     harriet.setName("TubsyWubsy");
     harriet.setHomeCourse("Maralago");
     harriet.setIdNum();
     System.out.println(harriet.toString());
     System.out.println("Expected: TubsyWubsy ID Number: 1002 Home Course: Maralago \n Score \t Date \t Course \t Course Rating \t Course Slope \n");
     
     System.out.println("***Testing setName and setCourseName with null values***");
     harriet.setName(null);
     harriet.setHomeCourse(null);
     System.out.println("Expected: Errors from both \n");
     
     System.out.println("***Test for addScore Method***");
     hambag.addScore("Hell's Hole", 70, "06/06/06", 66.6, 144);
     hambag.addScore("Jimmyozer's", 65, "05/05/05", 67.0, 145);
     System.out.println(hambag.toString());
     System.out.println("Expected: \n Hambag ID Number: 1000 Home Course: Richmond \n Score  \t  Date  \t  Course  \t  Course Rating  \t  Course Slope  \n 70  \t  06/06/06  \t  Hell's Hole  \t  66.6  \t  144  \n  65  \t 05/05/05  \t  Jimyozer's  \t  55.5  \t  145 \n");
     
     System.out.println("***Test for getScore, using private findScore method***");
     System.out.println(hambag.getScore("06/06/06"));
     System.out.println("70 \t 06/06/06 \t Hell's Hole \t 66.6 \t 144 \n");
     
     System.out.println("***Test for getScore, using private findScore method and a bad date*** \n");
     System.out.println(hambag.getScore("02/02/02"));
     System.out.println("Expected: null \n");
     
     System.out.println("***Test for lowestScore***");
     System.out.println(hambag.lowestScore());
     System.out.println("Expected: 65 \t 05/05/05 \t Jimmyozer's  \t 67.0 \t 145 \n");
     
     System.out.println("***Test for lowestScore with for a Score Object with no Score objects in the Array***");
     System.out.println(rappa.lowestScore());
     System.out.println("Expected: null \n");
     
     System.out.println("***Test for deleteScore***");
     System.out.println(hambag.deleteScore("05/05/05"));
     System.out.println(hambag.toString());
     System.out.println(hambag.getScore("07/07/07"));
     System.out.println("Expected: Hell's Hole, 70, 06/06/06, 66.6, 144 \n");
     
     System.out.println("***Test for findScore after deleting score***");
     
     
     System.out.println("***Test for bad values in deleteScore***");
     System.out.println(hambag.deleteScore("02/02/02"));
     System.out.println("Expected: false \n");

     System.out.println("***Test for default Score() object***");
     Score def = new Score();
     System.out.println(def.toString());
     System.out.println("Expected: 9999 \t 99/99/99 \t __ \t 9999.99 \t 9999 \n");
     
     System.out.println("***Test for toString on the Score Method with parameterized values***");
     Score balla = new Score("Hell's Hole", 70, "06/06/06", 66.6, 144);
     System.out.println(balla.toString());
     System.out.println("Expected: 70 \t 06/06/06 \t Hell's Hole \t 66.6 \t 144 \n");
     
     System.out.println("***Test for Score's Valid Score, Course Rating, and Course Slope with bad values***");
     Score balla1 = new Score("Hell's Hole", 12, "06/05/13", 212, 1989);
     System.out.println("Expected: Please enter a valid 18 Hole Score. \n Please enter a valid Course Rating. \n Please enter a valid Course Slope. \n");
     
     System.out.println("***Test for accessor values in Score Class");
     System.out.println(balla1.getScore() + " \t " + balla1.getCourseName() + " \t " + balla1.getDate() + " \t " + balla1.getCourseRating() + " \t " + balla1.getCourseSlope() + " \n ");
     System.out.println("Expected: 9999 \t Hell's Hole \t 06/05/13 \t 9999.0 \t 9999");
     
     System.out.println("***Test for all mutator values in Score.java with good values***");
     balla1.setCourseName("Augusta");
     balla1.setScore(72);
     balla1.setDate("07/12/14");
     balla1.setCourseRating(76.5);
     balla1.setCourseSlope(101);
     System.out.println(balla1.toString());
     System.out.println("Expected: 72  \t 07/12/14 \t Augusta \t 76.5 \t 101 \n");     
     
     System.out.println("***Test for all mutator methods in Score.java with bad values***");
     Score balla2 = new Score("Hello", 44, "06/05/13", 144, 133);
     balla2.setCourseName("ByEEEEE");
     balla2.setScore(55);
     balla2.setDate("06/06/06");
     balla2.setCourseRating(76);
     balla2.setCourseSlope(122);
     System.out.println(balla2.toString());
     System.out.println("Expected: 55 \t 06/06/06 \t ByEEEEE \t 76.0 \t 122 \n");

     
   }
}