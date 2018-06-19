/**
A class to test the Player, Golfer and Score classes.
@author Kyle Ligon
@version 1.0

COP5007	Project #: 3
File Name: PlayerTester.java
*/
import java.util.Arrays;

public class PlayerTester
{

   public static void main(String[] args)
   {
      System.out.println("***Tests Default Bowler Score***");
      BowlerScore jimmy = new BowlerScore();
      System.out.println(jimmy.toString());
      System.out.println("Expected: 9999 99/99/99 ____");
      
      
      System.out.println("***Tests Parameterized Bowler Score and Accessors (mutators used in setting parameters, accessors utilized in toString()***");
      BowlerScore reggie = new BowlerScore("Midnight Lanes", 78, "06/06/06");
      System.out.println(reggie.toString());
      System.out.println("Expected: 78 06/06/06 Midnight Lanes");
      
      System.out.println("***Tests High Score Values***");
      BowlerScore veggie = new BowlerScore("Midnight Lanes", 314, "06/06/06");
      System.out.println(veggie.toString());
      System.out.println("Expected: FieldOutOfBounds Exception Thrown, 9999 input");
      
      System.out.println("***Tests Low Score Values***");
      BowlerScore jeggie = new BowlerScore("Midnight Lanes", -3, "06/06/06");
      System.out.println(jeggie.toString());
      System.out.println("Expected: FieldOutOfBounds Exception Thrown, 9999 input");
      
      System.out.println("***Tests Default Parameters for Course Class***");
      Course gumball1 = new Course();
      System.out.println(gumball1.toString());
      System.out.println("Expected: ___ 9999.99 9999");
            
      System.out.println("***Tests Default Parameters for Course Class***");
      Course gumball = new Course("Arcane", 65.9, 100);
      System.out.println(gumball.toString());
      System.out.println("Expected: Arcane 65.9 100");
      
      System.out.println("***Tests Low Values for CourseRating and CourseSlope***");
      Course gumball2 = new Course("Arcane", 54.0, 54);
      System.out.println(gumball2.toString());
      System.out.println("Expected: Arcane 9999.99 9999, both exceptions thrown");
      
      System.out.println("***Tests High Values for CourseRating and CourseSlope***");
      gumball2.setCourseRating(154.0);
      gumball2.setCourseSlope(164);
      System.out.println(gumball2.toString());
      System.out.println("Expected: Arcane 9999.99 9999, both exceptions thrown");
      
      
      System.out.println("***Tests for Golfer and addScore methods with ArrayList***");
      Golfer lemon = new Golfer("Betty Draper", "CT");
      lemon.addScore("Augusta", 65, "06/06/06", 65.0, 65);
      System.out.println(lemon.toString());
      
      
      
   }
}





