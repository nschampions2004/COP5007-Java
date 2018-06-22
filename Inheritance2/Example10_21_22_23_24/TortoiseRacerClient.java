/** TortoiseRacer Client
*   Anderson, Franceschi
*/

import javax.swing.*;
import java.awt.*;

public class TortoiseRacerClient extends JApplet
{
  private TortoiseRacer t;

  public void init( )
  {
    t = new TortoiseRacer( "Tortoise", 50, 50 );
  }

  public void paint( Graphics g )
  {
    for ( int i = 0; i < getWidth( ); i++ )
    {
      t.move( );
      t.draw( g );

      Pause.wait( .03 );
      g.clearRect( 0, 0, getWidth( ), getHeight( ) );
    }
  }
}
