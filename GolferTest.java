import java.util.Arrays;

public class GolferTest 
{
   public static void main (String[] args)
   {
     System.out.println("***Tests Default Values***");
     Golfer rappa = new Golfer();
     System.out.println(rappa);
     System.out.println("Expect __ ID Number: 9999 Home Course: __ \n Score \t Date \t Course \t Course Rating \t Course Slope");
     System.out.println("***Tests Passed Through Values***");
     Golfer hambag = new Golfer("Hambag", "Richmond");
     System.out.println(hambag);
     System.out.println("Expect: Hambag ID Number: 1000 Home Course: Richmond \n Score \t Date \t Course \t Course Rating \t Course Slope");
     System.out.println("Tests accessor methods for the Golfer name, Golfer homeCourse, Golfer idNum");
     System.out.println("***Tests getName(), getHomeCourse(), and getIdNum() Accessors***");
     Golfer hobby = new Golfer("Sherry B.", "Harry Hollow");
     System.out.println(hobby.getName() + " " + hobby.getHomeCourse() + " " + hobby.getIdNum());
     System.out.println("Expected: Sherry B. Harry Hollow 1001");
     System.out.println("***Tests setName(), setHomeCourse(), and setIdNum() Mutators***");
     Golfer harriet = new Golfer("Harriet Tubs", "August, AK");
     harriet.setName("TubsyWubsy");
     harriet.setHomeCourse("Maralago");
     harriet.getIdNum();
     System.out.println(harriet.toString());
     System.out.println("Expected: TubsyWubsy ID Number: 1002 Home Course: Maralago \n Score \t Date \t Course \t Course Rating \t Course Slope");
     System.out.println("***Testing setName and setCourseName with null values***");
     harriet.setName(null);
     harriet.setHomeCourse(null);
     System.out.println("Expected: Errors from both");
     System.out.println("***Test for addScore Method***");
     hambag.addScore("Hell's Hole", 70, "06/06/06", 66.6, 144);
     hambag.addScore("Jimmyozer's", 65, "05/05/05", 55.5, 145);
     System.out.println(hambag.toString());
     System.out.println("Expected: \n Hambag ID Number: 1000 Home Course: Richmond \n Score  \t  Date  \t  Course  \t  Course Rating  \t  Course Slope  \n 70  \t  06/06/06  \t  Hell's Hole  \t  66.6  \t  144  \n  65  \t 05/05/05  \t  Jimyozer's  \t  55.5  \t  145");
     System.out.println("***Test for toString on the Score Method***");
     Score balla = new Score("Hell's Hole", 70, "06/06/06", 66.6, 144);
     System.out.println(balla.toString());
     System.out.println("***Test for Score's Valid Score, Course Rating, and Course Slope ***");
     Score balla1 = new Score("Hell's Hole", 12, "06/05/2013", 212, 1989);
     System.out.println("Expected: Please enter a valid 18 Hole Score. \n Please enter a valid Course Rating. \n Please enter a valid Course Slope.");
     System.out.println("***Test for all mutator methods in Score.java***");
     Score balla2 = new Score("Hello", 44, "06/05/13", 144, 133);
     balla2.setCourseName("ByEEEEE");
     balla2.setScore(55);
     balla2.setDate("06/06/06");
     balla2.setCourseRating(76);
     balla2.setCourseSlope(122);
     System.out.println(balla2.toString());
     System.out.println("Expected: 55 \t 06/06/06 \t ByEEEEE \t 76.0 \t 122");
     System.out.println("***Test for getScore, using private findScore method***");
     System.out.println(hambag.getScore("06/06/06"));
     System.out.println("70 \t 06/06/06 \t Hell's Hole \t 66.6 \t 144");
     System.out.println("***Test for lowestScore***");
     System.out.println(hambag.lowestScore());
     System.out.println("Expected: 65 \t 05/05/05 \t Jimmyozer's  \t 55.5 \t 145");
   }
}