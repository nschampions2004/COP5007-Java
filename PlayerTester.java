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
      
      
      System.out.println("***Tests Parameterized Bowler Score and Accessors (accessors utilized in toString()***");
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
      
      System.out.println("***Tests for Golfer and addScore methods with ArrayList***");
      Golfer lemon = new Golfer("Betty Draper", "CT");
      lemon.addScore("Augusta", 65, "06/06/06", 65.0, 65);
      System.out.println(lemon.toString());
      
      
      
   }
}





