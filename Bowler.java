/**
Bowler program that outputs a bowler's name, team name, 
id number, and current handicap
@author Kyle Ligon
@version 1.0

COP5007 Programming Project #: 3
File Name: Bowler.java
*/
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Collections;

public class Bowler extends Player
{
/**
   The team name of the Bowler.
*/
   private String teamName;
/**
   The array list holding the Bowler's scores.
*/
   ArrayList<BowlerScore> bsScores = new ArrayList<BowlerScore>( );
/**
   Bowler method that defaults.
*/
   public Bowler()
   {
      super( );
      teamName = "___";
   }
/**
   The Bowler method with parameterized values
*/ 
   public Bowler(String name, String teamName)   {
      super(name);
      setTeamName(teamName);
      this.bsScores = bsScores;
   }
/**
   Accessor for teamName
*/
   public String getTeamName()
   {
      return teamName;
   }
/**
   Mutator method for teamName
*/
   public void setTeamName(String newTeamName)
   {
      this.teamName = newTeamName;
   }
/**
   Adds scores to bowlers scores ArrayList
*/
   public void addScore(String laneName, int score, String date)
   {
      bsScores.add(new BowlerScore(laneName, score, date));
   }
  

/**
   Calculator for bowling handicap
   Invalid scores default to 9999 and appear in the ArrayList of Bowler Scores 
   after a FieldOutOfBounds Exception is thrown.  
*/
   @Override
   public double calculateHandicap()
   {
      double finalHandicap;
      double AVG_SIZE = 5;
      double BASE_BOWLING_AVG = 200;
      double BASE_MULT = 0.8;
      try
      {
         if(bsScores.isEmpty() || bsScores.size() < 5)
         {
            throw new FieldOutOfBounds
                      ("Not enough scores entered to calculate handicap");
         }
         else
         {
            double avgSum = 0.0;
            for(int i = bsScores.size() - 1; i > bsScores.size() - 6; i--)
            {
               
               avgSum = avgSum + bsScores.get(i).getScore();
            }
            finalHandicap = avgSum / AVG_SIZE;
            finalHandicap = BASE_BOWLING_AVG - finalHandicap;
            finalHandicap = finalHandicap * BASE_MULT;
            DecimalFormat dF = new DecimalFormat("#.00");
            finalHandicap = Double.valueOf(dF.format(finalHandicap));
          }
       }
       catch (Exception FieldOutOfBounds)
       {
         finalHandicap = 9999.99;
         System.out.println(FieldOutOfBounds.getMessage());
       }
       return finalHandicap;
   }
/**
   toString method that returns a nicely formatted list of the bowler's 
   info and scores
*/
   public String toString()
   {
      String words = getName() + "\t ID number " + getIDNum() + 
      "\t Team Name: " + getTeamName() + "\t Current Handicap: " + 
      calculateHandicap() + " \n";
      if(bsScores.isEmpty())
      {
         return words;         
      }
      else
      {
         words = words + "Score \t Date \t Lane \n";
         for(BowlerScore scoresItems : bsScores)
         {
            words = words + scoresItems.toString();
         }
         return words;
      }
      
   }
   
      
   

}
