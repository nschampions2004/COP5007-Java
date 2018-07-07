/* Demonstrating how to write to a text file
   Anderson, Franceschi
*/

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class WriteTextFile
{
  public static void main( String [] args )
  {
    try
    {
       FileWriter fw = new FileWriter( "output.txt", false );
       // false means we will be writing to output.txt,
       // rather than appending to it

       BufferedWriter bw = new BufferedWriter( fw );

       // write four lines
       bw.write( "I never saw a purple cow," );
       bw.newLine( );
       bw.write( "I never hope to see one;" );
       bw.newLine( );
       bw.write( "But I can tell you, anyhow," );
       bw.newLine( );
       bw.write( "I'd rather see than be one!" );
       bw.newLine( );

       // release resources associated with output.txt
       bw.close( );
       System.out.println( "File written successfully" );
    }

    catch( IOException ioe )
    {
      ioe.printStackTrace( );
    }
  }
}
