/**  TortoiseRacer class
*    inherits from abstract Animal class
*    implements Moveable interface
*    Anderson, Franceschi
*/

import java.awt.Graphics;
import java.awt.Color;

public class TortoiseRacer extends Animal implements Moveable
{
   /** Default Constructor: calls Animal default constructor
   */
   public TortoiseRacer( )
   {
     super( );
   }

   /** Constructor
   *    @param rID  racer Id, passed to Animal constructor
   *    @param rX   x position, passed to Animal constructor
   *    @param rY   y position, passed to Animal constructor
   */
   public TortoiseRacer( String rID, int rX, int rY )
   {
     super( rID, rX, rY );
   }

   /** draw: draws the Tortoise at current (x, y) coordinate
   *       implements abstract method in Animal class
   *       @param g   Graphics context
   */
   public void draw( Graphics g )
   {
     int startX = getX( );
     int startY = getY( );

     g.setColor( new Color( 34, 139, 34 ) ); // dark green

     //body
     g.fillOval( startX, startY, 25, 15 );

     //head
     g.fillOval( startX + 20, startY + 5,  15, 10 );

     //flatten bottom
      g.clearRect( startX, startY + 11, 35, 4 );

     //feet
     g.setColor( new Color( 34, 139, 34 ) );  // brown
     g.fillOval( startX + 3, startY + 10,  5, 5 );
     g.fillOval( startX + 17, startY + 10, 5, 5 );
   }

    /** implements move method in Moveable interface
    *   move:  calculates the new x value for the racer
    *   Tortoise move characteristics: "slow & steady wins the race"
    *      increment x by SLOW (inherited from Moveable interface)
    */
    public void move( )
    {
        setX( getX( ) + SLOW );
    }
}
