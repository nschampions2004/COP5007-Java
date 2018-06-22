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
            
      System.out.println("***Tests Parameterized Constructor and toString() for Course Class(mutators and accessors tested implicitly)***");
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
      lemon.addScore("Rockford", 66, "06/07/06", 65.0, 65);
      System.out.println(lemon.toString());
      
      System.out.println("***Checking the output of the default Golfer Class***");
      Golfer mich = new Golfer();
      System.out.println(mich.toString());
      System.out.println("Expected: __ __ ");
      
      System.out.println("***Checking for getScore's return***");
      System.out.println(lemon.getScore("06/06/06"));
      System.out.println("Expected: 65 06/06/06 Augusta 65.0 65");
      
      System.out.println("***lowestScore***");
      System.out.println(lemon.lowestScore());
      System.out.println("Expected: 65 06/06/06 Augusta 65.0 65");
      
      System.out.println("***lowestScore, no data in scores arraylist***");
      System.out.println(mich.lowestScore());
      System.out.println("Expected: null");
      
      System.out.println("***deleting score***");
      lemon.deleteScore("06/07/06");
      System.out.println(lemon.toString());
      System.out.println("Expected: 65 06/06/06 Augusta 65.0 65");
      
      System.out.println("***checking diffSum***");
      lemon.addScore("Augusta", 67, "06/06/06", 65.0, 65);
      lemon.addScore("Rockford", 66, "06/07/06", 65.0, 65);
      lemon.addScore("Augusta", 67, "06/06/06", 65.0, 65);
      lemon.addScore("Rockford", 66, "06/07/06", 65.0, 65);
      lemon.addScore("Augusta", 67, "06/06/06", 65.0, 65);
      lemon.addScore("Rockford", 66, "06/07/06", 65.0, 65);
      lemon.addScore("Augusta", 67, "06/06/06", 65.0, 65);
      lemon.addScore("Rockford", 66, "06/07/06", 65.0, 65);
      lemon.addScore("Augusta", 67, "06/06/06", 65.0, 65);
      lemon.addScore("Rockford", 66, "06/07/06", 65.0, 65);
      lemon.addScore("Augusta", 67, "06/06/06", 65.0, 65);
      lemon.addScore("Rockford", 66, "06/07/06", 65.0, 65);
      System.out.println(lemon.calculateHandicap());
      System.out.println("Expected: ~ 1.6688");
               
   }
}





