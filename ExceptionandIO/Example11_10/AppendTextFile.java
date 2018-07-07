/* Demonstrating how to append to a text file
   Anderson, Franceschi
*/

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class AppendTextFile
{
  public static void main( String [] args )
  {
    try
    {
       FileWriter fw = new FileWriter( "output.txt", true );
       // true means we will be appending to output.txt,
       // rather than writing to it

       BufferedWriter bw = new BufferedWriter( fw );

       // write four more lines
       bw.write( "Ah, yes! I wrote the \"Purple Cow\" --" );
       bw.newLine( );
       bw.write( "I'm sorry, now, I wrote it!" );
       bw.newLine( );
       bw.write( "But I can tell you anyhow," );
       bw.newLine( );
       bw.write( "I'll kill you if you quote it!" );
       bw.newLine( );

       // release resources associated with output.txt
       bw.close( );
       System.out.println( "File appended successfully" );
    }

    catch( IOException ioe )
    {
      ioe.printStackTrace( );
    }
  }
}
