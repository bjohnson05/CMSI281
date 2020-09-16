/**
 * File name: SourceFile.java
 * Purpose  : read in the input file
 */

package copiersupport;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class SourceFile {

   private String fileInputBuffer = "";

   public SourceFile( String fileName ) {

      BufferedReader br = null;
      try {
         br = new BufferedReader( new FileReader( fileName ) );
         StringBuilder sb = new StringBuilder();
         String line = br.readLine();

         while( line != null ) {
            sb.append( line );
            sb.append( System.lineSeparator() );
            line = br.readLine();
         }
         fileInputBuffer = sb.toString();
         br.close();
      }
      catch( IOException ioe ) {
         System.out.println( "Error reading input file." );
      }
   }

   public String getBuffer() {
      return fileInputBuffer;
   }

}
