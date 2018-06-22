/* Figure Hierarchy Client
   Anderson, Franceschi
*/
import javax.swing.JApplet;
import java.awt.*;
import java.util.ArrayList;

public class TrafficLightPolymorphism extends JApplet
{
  private ArrayList<Figure> figuresList;

  public void init( )
  {
    figuresList = new ArrayList<Figure>( );
    figuresList.add( new Square( 150, 100, Color.BLACK, 40 ) );
    figuresList.add( new Circle( 160, 110, Color.RED, 10 ) );

    figuresList.add( new Square( 150, 140, Color.BLACK, 40 ) );
    figuresList.add( new Circle( 160, 150, Color.YELLOW, 10 ) );

    figuresList.add( new Square( 150, 180, Color.BLACK, 40 ) );
    figuresList.add( new Circle( 160, 190, Color.GREEN, 10 ) );
  }

  public void paint( Graphics g )
  {
    for ( Figure f : figuresList )
         f.draw( g );
  }
}
