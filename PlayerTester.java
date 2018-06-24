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
      
      
      System.out.println("***Checking the output of the default Golfer Class***");
      Golfer mich = new Golfer();
      System.out.println(mich.toString());
      System.out.println("Expected: __ __ ");
      
            
      System.out.println("***Tests for parameterized Golfer, accessors, mutators, addScore, \n parameterized Score, Score's mutators, Score's toString, and Score's accessor methods with ArrayList***");
      Golfer lemon = new Golfer("Betty Draper", "CT");
      lemon.addScore("Augusta", 65, "06/06/06", 65.0, 65);
      lemon.addScore("Rockford", 66, "06/07/06", 65.0, 65);
      System.out.println(lemon.toString());
      System.out.println("Expected: 'Header Line' and Two Score Lines");
     
      System.out.println("***Test for deleteScore (implicitly tests findScore)***");
      lemon.deleteScore("06/07/06");
      System.out.println(lemon.toString());
      System.out.println("Expected: 'Header'  + 65 06/06/06 Augusta 65.0 65");
      
      System.out.println("***Test for deleteScore no Vals***");
      System.out.println(mich.deleteScore("06/06/06"));
      System.out.println("Expected: false");
     
      System.out.println("***Test for bad deleteScore rows***");
      System.out.println(lemon.deleteScore("06/01/06"));
      System.out.println("Expected: false");
      
      
      System.out.println("***Checking for getScore's return on a good value***");
      System.out.println(lemon.getScore("06/06/06"));
      System.out.println("Expected: 65 06/06/06 Augusta 65.0 65");
      
      System.out.println("***Checking for getScore's return on a bad value***");
      System.out.println(lemon.getScore("06/01/06"));
      System.out.println("Expected: null");
      
      System.out.println("***Checking for getScore's return with no values in ArrayList***");
      System.out.println(mich.getScore("05/05/05"));
      System.out.println("Expected: null");
      
      
      System.out.println("***lowestScore with values in the ArrayList***");
      lemon.addScore("Rockford", 66, "06/07/06", 65.0, 65);
      lemon.addScore("Rogersville", 21, "03/05/07", 65.0, 78);
      System.out.println(lemon.lowestScore());
      System.out.println("Expected: 21 03/05/07 Rogersville 65.0 78");
            
      System.out.println("***lowestScore, no data in scores arraylist***");
      System.out.println(mich.lowestScore());
      System.out.println("Expected: null");
      
      System.out.println("***checking diffSum in calculateHandicap and toString()***");
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
      System.out.println(lemon.toString());
      System.out.println("Expected: ~ 1.67");
      
      System.out.println("***No vals for Calculate Handicap***");
      System.out.println(mich.calculateHandicap());
      System.out.println(mich.toString());
      System.out.println("Expected: Exception thrown and 9999.99 set for handicap");
      
      System.out.println("***Test for default Score class***");
      Score def = new Score ();
      System.out.println(def.toString());
      System.out.println("Expected: 9999  99/99/99 ___   9999.99  9999");
      
      System.out.println("***Test for HIGH Score values***");
      def.setScore(888);
      System.out.println(def.toString());
      System.out.println("Expected: Exception thrown, 9999 becomes the score for the line");
      
      System.out.println("***Test for LOW Score values***");
      def.setScore(-888);
      System.out.println(def.toString());
      System.out.println("Expected: Exception thrown, 9999 becomes the score for the line");
      
      System.out.println("***Test for Bowler Default Constructor***");
      Bowler init = new Bowler();
      System.out.println(init.toString());
      System.out.println("Expected: ____ ID Num: 9999 Team Name: ____ Current Handicap: 0.0");       
      
      System.out.println("***Test for Bowler Paramed Constructor, accessor, mutator, and toStirng methods***");
      Bowler init2 = new Bowler("Christina", "Red Rock Raiders");
      System.out.println(init2.toString());
      System.out.println("Expected: Christina ID Num 1003 Team Name: Red Rock Raiders Current Handicap 0.0");
      
      System.out.println("***Test for Bowler Add Score Method***");
      init2.addScore("Don Carter's", 78, "06/06/06");
      System.out.println(init2.toString());
      System.out.println("Expected: 'Header' + 78 06/06/06 Don Carter's");
      
      System.out.println("***Test for Bowler Calculate Handicap***");
      init2.addScore("Don Carter's", 78, "06/06/06");
      init2.addScore("Don Carter's", 78, "06/06/06");
      init2.addScore("Don Carter's", 78, "06/06/06");
      init2.addScore("Don Carter's", 78, "06/06/06");
      System.out.println(init2.toString());
      System.out.println("Expected: 5 scores with a Current Handicap ~ 97.6");
   }
}





