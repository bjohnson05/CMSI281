/*
 * filename: IntLinkedListTester.java
 * purpose: Tests the singly linked list data structure
 */

   public class IntLinkedListTester {

      public static void main( String[] args ) {
         IntLinkedList myList = new IntLinkedList();     // create a list
         IntLinkedList.Iterator myIt = null;             // declare an Iterator

         myList.prepend( 59 );
         myList.prepend( 57 );
         myList.prepend( 53 );
         myList.prepend( 51 );
         myList.prepend( 47 );
         myList.prepend( 43 );
         myList.prepend( 41 );
         myList.prepend( 37 );
         myList.prepend( 31 );
         myList.prepend( 29 );
         myList.prepend( 23 );
         myList.prepend( 19 );
         myList.prepend( 17 );
         myList.prepend( 13 );
         myList.prepend( 11 );
         myList.prepend(  7 );
         myList.prepend(  5 );
         myList.prepend(  3 );
         myList.prepend(  2 );
         System.out.println( "\n  IntLinkedListTester: list loaded with first 19 primes" );
         myIt = myList.getIteratorAt( 0 );
         System.out.print( "    Got iterator at zero; list contents follows...\n      " );
         while( myIt.hasNext() ) {
            System.out.print( myIt.getCurrentInt() + " " );
            myIt.next();
         }
         System.out.println( myIt.getCurrentInt() );

         System.out.println( "\n\n  Testing 'insertAt()' method, inserting 1001 at index 11" );
         myList.insertAt( 11, 1001 );
         myIt = myList.getIteratorAt( 0 );
         System.out.print( "    Got iterator at zero; list contents follows...\n      " );
         while( myIt.hasNext() ) {
            System.out.print( myIt.getCurrentInt() + " " );
            myIt.next();
         }
         System.out.println( myIt.getCurrentInt() );

         System.out.println( "\n\n  Testing 'removeAt()' method, removing value at index 16" );
         int valueRemoved = myList.removeAt( 16 );
         myIt = myList.getIteratorAt( 0 );
         System.out.print( "    Got iterator at zero; list contents follows...\n      " );
         while( myIt.hasNext() ) {
            System.out.print( myIt.getCurrentInt() + " " );
            myIt.next();
         }
         System.out.println( myIt.getCurrentInt() );
         System.out.println( "   value pulled: " + valueRemoved );
      }
   }
