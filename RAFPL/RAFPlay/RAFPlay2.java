import java.util.Scanner;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by probalchandradhar on 10/12/16.
 */
public class RAFPlay2 {

   public static int questionID = 1;

   public static void main(String[] args)
   {
   
      String s = "Hello World java";
        
      try{
      
         RandomAccessFile ioStream = new RandomAccessFile("bytedata", "rw");
      
         ioStream.seek(0);
      
         ioStream.writeInt(1);
         ioStream.writeBoolean(true);
         ioStream.writeUTF(s);
         ioStream.writeInt(4);
      
         System.out.println("File Size: " + (int)ioStream.length() );
         ioStream.seek(0);
      
         System.out.println("\n\n"+ioStream.readInt());
         System.out.println(ioStream.readBoolean());
         System.out.println(ioStream.readUTF());
         System.out.println(ioStream.readInt());
      
            //ioStream.seek(0);
      
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
