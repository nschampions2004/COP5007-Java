import java.util.Scanner;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by probalchandradhar on 10/12/16.
 */
public class RAFPlay {

   public static int questionID = 1;

   public static void main(String[] args)
   {
   
      String s = "Hello World java";
      System.out.println("String size: " + s.length());
   
      try{
      
         RandomAccessFile ioStream = new RandomAccessFile("bytedata", "rw");
         ioStream.seek(0);//Set pointer to start of file 
                       
         ioStream.writeUTF(s);
         /*Writes a String but also two extra bytes that provides the 
         lenght of the String so the readUTF() knows how many to read. */
                       
         System.out.println("File Size: " + (int)ioStream.length() );
               
         ioStream.seek(0);
      
         System.out.println(ioStream.readUTF());
                   
      
      }
      catch(FileNotFoundException e)
      {
         System.out.println("Problem opening file.");
      }
      catch(IOException e)
      {
         e.printStackTrace();
         System.out.println("Problems with file I/O.");
      }
   
   
   
   
   }



}
