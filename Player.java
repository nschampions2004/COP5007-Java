/**
An abstract class that will hold the Golfer and Bowler class
@author Kyle Ligon
@version 1.0

COP5007	Project #: 3
File Name: Player.java
*/

public abstract class Player
{
   /**
   	The player in question.
   */
   	private String	name;
   	
   /**
   	The id of the player.
   */
   	private int	IDNum;
   	
   /**
   	Counter of Golfer's IdNum
   */
   	private static	int nextIDNum = 999;
   /**
      This constructor makes the default player obkect that the Golfer and Bowler will inherit
   */
      public Player()
      {
         setName("___");
         IDNum = 9999;
      }
   /**
      This constructor makes the player object that the Golfer and Bowler will inherit
      @param name the name of the player in question
      @param IDNum the id number assigned to the player in question
   */
      public Player(String name)
      {
         setName(name);
         setIDNum();
      }
   
   
   /**
   	*Accessor for Golfer	Name
   	@return the	name of the	player
   */
   	public String getName()	
   	{
   		return name;
   	}
   /** 
   	Accessor	for idNum 
   	@return the	id	number of the player
   */
   	public int getIDNum()
   	{
   		return IDNum;
   	}
   /**
   	Mutator of name
   	@param newName	sets the	name of the	player
   */
   	public void	setName(String	newName)
   	{
   		if	(newName	==	null)
   		{ 
   			System.out.println("Error: must input a new name."); 
   		}
   		else 
   		{
   			name = newName;
   		}
   	}
   /**
   	Mutator for	idNum
   	@return returns the new	id	number of the player
   */	
   	public void	setIDNum()
   	{
   		nextIDNum++;
   		IDNum	= nextIDNum;
   	}
   /**
      Abstract method for computeHandicap
   */
      abstract double calculateHandicap() throws FieldOutOfBounds;

   /**
      toString method takes the object and prints a nicely formatted string
      @return nicely formatted string
   */
      public String toString() 
      {
         String words = getName() + " ID Number: " + getIDNum();
         return words;
      }
      

}
