/* Reading structured data from a text file
   Anderson, Franceschi
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.ArrayList;

public class ReadFlights
{
  public static void main( String [ ] args )
  {
   // declare ArrayList to hold FlightRecord objects
   ArrayList<FlightRecord> listFlightRecords =
                      new ArrayList<FlightRecord>( );

   try
   {
        Scanner file = new Scanner( new File ( "flights.txt" ) );

        while ( file.hasNext( ) ) // test for the end of the file
        {
            // read a line
            String stringRead = file.nextLine( );

             // process the line read
            StringTokenizer st = new
                     StringTokenizer( stringRead, "," );
            String flightNumber = st.nextToken( );
            String origin = st.nextToken( );
            String destination = st.nextToken( );

            try
            {
               int numPassengers =
                   Integer.parseInt( st.nextToken( ) );
               double avgTicketPrice =
                   Double.parseDouble( st.nextToken( ) );

               FlightRecord frTemp = new FlightRecord(
                                      flightNumber, origin, destination,
                                      numPassengers, avgTicketPrice );

               // add FlightRecord obj to listFlightRecords
               listFlightRecords.add( frTemp );
            }

           catch ( NumberFormatException nfe )
           {
                System.out.println( "Error in flight record: "
                                              + stringRead
                                              + "; record ignored" );
           }
       }

      // release resources associated with flights.txt
      file.close( );
   }

   catch ( FileNotFoundException fnfe )
   {
     System.out.println( "Unable to find flights.txt" );
   }

   catch ( IOException ioe )
   {
     ioe.printStackTrace( );
   }

   // print the FlightRecords read
   for ( FlightRecord flight : listFlightRecords )
       System.out.println( flight );
 }
}
