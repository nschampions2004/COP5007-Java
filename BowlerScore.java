/**
Score program that outputs and creates a Score Object for Bowlers
@author Kyle Ligon
@version 1.0

COP 5007 Programming Project #: 3
File Name: BowlerScore.java
*/

public class BowlerScore
{
/**
   The lane name the Bowler performed at
*/
   private String laneName;
/**
   The score the Bowler made during the event
*/
   private int score;
/**
   The date the bowler played the game.
*/
   private String date;
/**
   This states the low and high scores of bowling game.  Used for validation of scores for 
   paramaterized contstructor and mutator methods.
*/   
   private static final int SCORE_LOW = 0;
   private static final int SCORE_HIGH = 300;
/**
   Score method that defaults
*/
   public BowlerScore ()
   {
      laneName = "____";
      score = 9999;
      date = "99/99/99";
   }
/**
   Score method that has parameterized values
   @param laneName the name of the lane the Bowler bowled at
   @param score the score the bowler made during the event
   @param date the date the bowler bolwed the score
*/
   public BowlerScore (String laneName, int score, String date)
                           throws FieldOutOfBounds
   {
          
      this.laneName = laneName; 
      /**fixme: add exception for catching scores outside 0 and 300 */
      try 
      {
         if ( score < SCORE_LOW || score > SCORE_HIGH) 
         {
            throw new FieldOutOfBounds
                        ("Score entered not between " + SCORE_LOW + " and "
                        + SCORE_HIGH);
            
          }      
       }
       catch (Exception FieldOutOfBounds)
       {
         score = 9999;
         System.out.println(FieldOutOfBounds.getMessage()); 
       }
      this.score = score; 
      this.date = date;
   }
/**
   This method gets the lane name of the Bowler Score obj
*/
     
   public String getLaneName()
   {
      return laneName;
   }
/**
   This method gets the score of the BowlerScore obj
*/
   public int getScore()
   {
      return score;
   }
/**
   This method returns the date    
*/
   public String getDate() 
   {
      return date;
   }
/**
   This method sets the lane name for Bowler score obj
*/
   public void setLaneName(String laneName)
   {
      this.laneName = laneName;
   }
   
/**
   This method sets the score for the Bowler score obj
*/
   public void setScore(int score)
   {
      this.score = score;
   }
/**
   This method sets the date for the Bowler Score obj
*/
   public void setDate(String date)
   {
      this.date = date;
   }
/**
   This method returns a nicely formatted String that contains the score
   and its instance fields.
*/
   public String toString()
   {
      String words = this.score + " \t " + this.date + " \t " + this.laneName;
      return words;
   }
}
      

   