/* Square class
*  inherits from abstract Figure class
*  Anderson, Franceschi
*/

import java.awt.Graphics;
import java.awt.Color;

public class Square extends Figure
{
   private int length;

   /** default constructor
   *   calls default constructor of Figure class
   *   sets length to 0
   */
   public Square( )
   {
     super( );
     length = 0;
   }

   /** overloaded constructor
   *   sends startX, startY, startColor to Figure constructor
   *   sets startLength to setLength method
   *   @param startX      starting x pixel
   *   @param startY      starting y pixel
   *   @param startColor  color for square
   *   @param startlength length of square
   */
   public Square( int startX, int startY, Color startColor,
                  int startLength )
   {
      super( startX, startY, startColor );
      setLength( startLength );
   }

   /** mutator method for length
   *   @param newLength  new value for length
   */
   public void setLength( int newLength )
   {
      length = newLength;
   }

   /** accessor method for length
   *   @return length
   */
   public int getLength( )
   {
      return length;
   }

   /** draw method
   *  sets color and draws a square
   *  @param g  Graphics context for drawing the square
   */
   public void draw( Graphics g )
   {
      g.setColor( getColor( ) );
      g.fillRect( getX( ), getY( ),
                   length, length );
   }
}
