/* Circle class
*  inherits from abstract Figure class
*  Anderson, Franceschi
*/

import java.awt.Graphics;
import java.awt.Color;

public class Circle extends Figure
{
   private int radius;

   /** default constructor
   *   calls default constructor of Figure class
   *   sets radius to 0
   */
   public Circle( )
   {
      super( );
      radius = 0;
   }

   /** overloaded constructor
   *   sends startX, startY, startColor to Figure constructor
   *   sends startRadius to setRadius method
   *   @param startX      starting x pixel
   *   @param startY      starting y pixel
   *   @param startColor  color for circle
   *   @param startradius radius of circle
   */
   public Circle( int startX, int startY, Color startColor,
                             int startRadius )
   {
      super( startX, startY, startColor );
      setRadius( startRadius );
   }

   /** mutator method for radius
   *   @param newRadius  new value for radius
   */
   public void setRadius( int newRadius )
   {
      radius = newRadius;
   }

   /** accessor method for radius
   *   @return radius
   */
   public int getRadius( )
   {
      return radius;
   }

   /** draw method
   *  sets color and draws a circle
   *  @param g  Graphics context for drawing the circle
   */
   public void draw( Graphics g )
   {
       g.setColor( getColor( ) );
       g.fillOval ( getX( ), getY( ),
                    radius * 2, radius * 2 );
   }
}
