/** abstract Figure superclass for drawing shapes
*   Anderson, Franceschi
*/
import java.awt.Graphics;
import java.awt.Color;

public abstract class Figure
{
  private int x;
  private int y;
  private Color color;

  /** default constructor
  *   sets x and y to 0
  *   sets color to black
  */
  public Figure( )
  {
    x = 0;
    y = 0;
    color = Color.BLACK;
  }

  /** overloaded constructor
  *   sets x to startX
  *   sets y to startY
  *   sets the color to startColor
  *   @param  startX      starting x pixel for figure
  *   @param  startY      starting y pixel for figure
  *   @param  startColor  figure color
  */
  public Figure( int startX, int startY, Color startColor )
  {
    x = startX;
    y = startY;
    color = startColor;
  }

  /** accessor method for color
  *   @return current figure color
  */
  public Color getColor( )
  {
    Color tempColor = color;
    return tempColor;
  }

  /** mutator method for color
  *   @param newColor  new color for figure
  */
  public void setColor( Color newColor )
  {
    color = newColor;
  }

  /** accessor method for x
  *   @return current x value
  */
  public int getX( )
  {
    return x;
  }

  /** mutator method for x
  *   @param newX  new value for x
  */
  public void setX( int newX )
  {
    x = newX;
  }

  /** accessor method for y
  *   @return current y value
  */
  public int getY( )
  {
    return y;
  }

  /** mutator method for y
  *   @param newY new y value
  */
  public void setY( int newY )
  {
     y = newY;
  }

  /** abstract draw method
  *   @param Graphics context for drawing figure
  */
  public abstract void draw( Graphics g );
}
