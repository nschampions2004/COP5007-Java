/* Demonstrating how to write basic data types to a text file
   Anderson, Franceschi
*/

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class WriteGradeFile
{
  public static void main( String [] args )
  {
    try
    {
      FileOutputStream fos = new FileOutputStream
                            ( "grade.txt", false );
      // false means we will be writing to grade.txt,
      // rather than appending to it

      PrintWriter pw = new PrintWriter( fos );

      // write data to the file
      pw.print( "Grade: " );
      pw.println( 95 );
      pw.print( "Letter grade: " );
      pw.println( 'A');
      pw.print( "Current GPA: " );
      pw.println( 3.68 );
      pw.print( "Successful student: " );
      pw.println( true );

      // release the resources associated with grade.txt
      pw.close( );
   }

   catch( FileNotFoundException fnfe )
   {
     System.out.println( "Unable to find grade.txt" );
   }
 }
}
