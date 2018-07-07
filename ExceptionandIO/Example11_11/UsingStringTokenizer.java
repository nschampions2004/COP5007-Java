/* Demonstrating the StringTokenizer class
   Anderson, Franceschi
*/

import java.util.StringTokenizer;

public class UsingStringTokenizer
{
  public static void main( String [] args )
  {
    String flightRecord1 = "AA123,BWI,SFO,235,239.5";
    StringTokenizer stfr1 = new StringTokenizer( flightRecord1, "," );
                                        // the delimiter is a comma

    while ( stfr1.hasMoreTokens( ) )
       System.out.println( stfr1.nextToken( ) );
  }
}
