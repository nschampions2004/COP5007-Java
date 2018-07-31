/* VacationList class
   Anderson, Franceschi
*/

import java.util.*;
import java.io.*;

public class VacationList
{
 private ArrayList<Vacation> vacationList;

 /** Constructor
 *  @param  fileName  the name of the file containing the data
 */
 public VacationList( String fileName )
 {
  vacationList = new ArrayList<Vacation>( );
  try
  {
   File file = new File( fileName );
   Scanner br = new Scanner( file );

   while ( br.hasNext( ) )
   {
	String record = br.nextLine( );
    // extract the fields from the records
    StringTokenizer st = new StringTokenizer( record, "," );
    String loc = st.nextToken( );
    String org = st.nextToken( );
    String desc = st.nextToken( );

    try
    {
     double pr = Double.parseDouble( st.nextToken( ) );

     Vacation vacationTemp = new Vacation( loc, org, desc, pr );
     vacationList.add( vacationTemp );
    }
    catch ( NumberFormatException nfe )
    {
     System.out.println( "Error in vacation record: "
             + record + "; record ignored" );
    }

   }
   br.close( );
  }
  catch ( FileNotFoundException fnfe )
  {
   System.out.println( "Unable to find " + fileName );
  }
  catch ( IOException ioe )
  {
   ioe.printStackTrace( );
  }
 }

 /** getLocationList
 *  @return array of locations
 */
 public String [] getLocationList( )
 {
  String [] temp = new String[vacationList.size( )];
  for ( int i = 0; i < vacationList.size( ); i++ )
    temp[i] = ( vacationList.get( i ) ).getLocation( );
  return temp;
 }

 /** getDescription
 *  @param  index index of vacation in vacationList
 *  @return description of vacation at index
 */
 public String getDescription( int index )
 {
  return ( ( vacationList.get( index ) ).toString( ) );
 }
}
