/**  Animal class
*    Anderson. Franceschi
*/

import java.awt.Graphics;

public abstract class Animal
{
  private int x;      // x position
  private int y;      // y position
  private String ID;  // animal ID

  /** default constructor
  *    Sets ID to empty String
  */
  public Animal( )
  {
    ID = "";
  }

  /** Constructor
  *    @param rID   Animal ID
  *    @param rX    x position
  *    @param rY    y position
  */
  public Animal( String rID, int rX, int rY )
  {
    ID = rID;
    x = rX;
    y = rY;
  }

  /** accessor for ID
  *   @return  ID
  */
  public String getID( )
  {
    return ID;
  }

  /** accessor for x
  *   @return  x coordinate
  */
  public int getX( )
  {
    return x;
  }

  /** accessor for y
  *   @return  y coordinate
  */
  public int getY( )
  {
    return y;
  }

  /** mutator for x
  *   @param  newX  new value for x position
  */
  public void setX( int newX )
  {
    x = newX;
  }

  /** mutator for y
  *   @param  newY  new value for y position
  */
  public void setY( int newY )
  {
    y = newY;
  }

  /** abstract method for drawing Animal
  *   @param   g    Graphics context
  */
  public abstract void draw( Graphics g );
}
