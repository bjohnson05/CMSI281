/*
 * filename: IntIntQueueTester.java
 * purpose: Tests the singly linked list Queue data structure
 */

   public class IntQueueTester {

      public static void main( String[] args ) {
         IntQueue theQueue = new IntQueue();
         theQueue.enQueue( 59 );
         theQueue.enQueue( 57 );
         theQueue.enQueue( 53 );
         theQueue.enQueue( 51 );
         theQueue.enQueue( 47 );
         theQueue.enQueue( 43 );
         theQueue.enQueue( 41 );
         theQueue.enQueue( 37 );
         theQueue.enQueue( 31 );
         theQueue.enQueue( 29 );
         theQueue.enQueue( 23 );
         theQueue.enQueue( 19 );
         theQueue.enQueue( 17 );
         theQueue.enQueue( 13 );
         theQueue.enQueue( 11 );
         theQueue.enQueue(  7 );
         theQueue.enQueue(  5 );
         theQueue.enQueue(  3 );
         theQueue.enQueue(  2 );
         IntLinkedList.Iterator myIt = theQueue.myQueue.getIteratorAt( 0 );
         while( myIt.hasNext() ) {
            System.out.println( "Current Node is: " + myIt.getCurrentInt() );
            myIt.next();
         }
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );
         int valueRemoved = theQueue.deQueue();
         myIt = theQueue.myQueue.getIteratorAt( 0 );
         while( myIt.hasNext() ) {
            System.out.println( "Current Node is: " + myIt.getCurrentInt() );
            myIt.next();
         }
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );
         System.out.println( "   value pulled: " + valueRemoved );
         valueRemoved = theQueue.deQueue();
         valueRemoved = theQueue.deQueue();
         valueRemoved = theQueue.deQueue();
         valueRemoved = theQueue.deQueue();
         valueRemoved = theQueue.deQueue();
         valueRemoved = theQueue.deQueue();
         myIt = theQueue.myQueue.getIteratorAt( 0 );
         while( myIt.hasNext() ) {
            System.out.println( "Current Node is: " + myIt.getCurrentInt() );
            myIt.next();
         }
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );
         System.out.println( "   value pulled: " + theQueue.deQueue() );
         System.out.println( "   value pulled: " + theQueue.deQueue() );
         System.out.println( "   value pulled: " + theQueue.deQueue() );
         System.out.println( "   value pulled: " + theQueue.deQueue() );
         System.out.println( "   value pulled: " + theQueue.deQueue() );
      }
   }
