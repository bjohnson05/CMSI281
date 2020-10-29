/**
 *  filename: UnboundedTreeExample.java
 *  purpose: demonstrate unbounded tree
 *  @author: Dr. Johnson
 *  @date: 2020-10-27
 */
import java.util.ArrayList;

public class UnboundedTreeExample {
   public static void main (String[] args) {
      int rootValue = 23;
      int rootFirstChildIndex = 0;
      int rootThirdChildIndex = 2;

      UnboundedTreeNode root = new UnboundedTreeNode( rootValue );
      root.add( 2 );      // root's first child at index zero
      root.add( 3 );      //        second child at index one
      root.add( 4 );      //        third child at index two

      UnboundedTreeNode it = root.getChild( rootFirstChildIndex );
      it.add( 5 );        // root's first child's first child
      it.add( 6 );

      UnboundedTreeNode it2 = root.getChild( rootThirdChildIndex );
      it2.add( 7 );       // root's second child's first child
      it2.add( 8 );
      it2.add( 9 );
      it2.add( 10 );
      it2.add( 11 );
      it2.add( 12 );
      it2.add( 13 );
      it2.add( 14 );

      System.out.print( "\n Children of root: " );
      for( int i = 0; i < 3; i++ ) {
         System.out.print( "[" + root.getChild( i ).getValue() + "]" );
      }
      System.out.println();

      System.out.print( "\n Children of root's first child: " );
      for( int i = 0; i < 2; i++ ) {
         System.out.print( "[" + it.getChild( i ).getValue() + "]" );
      }
      System.out.println();

      System.out.print( "\n Children of root's third child: " );
      for( int i = 0; i < 8; i++ ) {
         System.out.print( "[" + it2.getChild( i ).getValue() + "]" );
      }
      System.out.println("\n\n");

   }
}
