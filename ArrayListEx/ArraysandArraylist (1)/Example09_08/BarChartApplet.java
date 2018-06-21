/* Displaying a Two-Dimensional Array as a Bar Chart
   Anderson, Franceschi
*/

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

public class BarChartApplet extends JApplet
{
 final int LEFT_MARGIN = 60;        // starting x value
 final int BASE_Y_BAR  = 100;       // bottom of the bars
 final int BASE_Y_VALUE = 125;      // bottom of the values
 final int BAR_WIDTH = 30;          // width of each bar
 final int SPACE_BETWEEN_BARS = 15; // pixels between bars
 final int ROW_HEIGHT = 110;        // pixels between rows
 double [][] familyCellBills = { {45.24, 54.67, 32.55, 25.61},
                                 {65.29, 49.75, 32.08, 26.11},
                                 {75.24, 54.53, 34.55, 28.16} };
 Color [] colors = { Color.BLUE, Color.RED, Color.GREEN };

 public void init( )
 {
   setSize( 250, 375 );
 }

 public void paint( Graphics g )
 {
  int xStart = LEFT_MARGIN;    // x value for 1st column (bars)
  int yStart = BASE_Y_VALUE;   // y value for 1st row (data)
  int yStartBar = BASE_Y_BAR;  // y value for 1st row (bars)

  for ( int i = 0; i < familyCellBills.length; i++ )
  {
   g.setColor( colors[i] );   // set color for current row
   g.drawString( "Row " + i, xStart - LEFT_MARGIN + 10,
                 (int) ( yStart - .3 * ROW_HEIGHT ) );

   for ( int j = 0; j < familyCellBills[i].length; j++ )
   {
     g.fillRect( xStart, yStartBar - (int) ( familyCellBills[i][j] ),
                 BAR_WIDTH, (int) ( familyCellBills[i][j] ) );

     g.drawString( Double.toString( familyCellBills[i][j] ),
                   xStart, yStart );

     // move to starting x value for next bar
     xStart += BAR_WIDTH + SPACE_BETWEEN_BARS;
   }

   // new row:  increase yStart and yStartBar
   yStart += ROW_HEIGHT;       // increment yStart for next row
   yStartBar += ROW_HEIGHT;    // increment yStartBar for next row
   xStart = LEFT_MARGIN;       // reset xStart for next row
  }
 }
}
