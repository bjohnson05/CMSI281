/**
 *  File Name  :  DepthFirstSearcher.java
 *  Purpose    :  Provide a class for a depth first search of a graph
 *  Author     :  B.J. Johnson
 *  Date       :  26-Mar-2003
 *  Description:  This class performs a recursive depth-first search on a
 *    graph that is constructed with a user-entered number of nodes.  The
 *    graph is expected to be of the associated "graph" class.
 *
 *    Operation is recursive; at each level, all the nodes in the graph are
 *    checked for connectivity with the current node.  The first node that
 *    is connected is used as the root of the next recursion.  Nodes are
 *    implemented as an adjacency matrix, in a pretty standard method.
 *    There is a boolean array to keep track of which nodes have been visited.
 *    A number of methods for performing the operation are also available.
 *    All of these items are part of the Graph.java class which is associated.
 *    This class actually creates and connects the graph to be searched.  It
 *    performs all the initializations, then does the search and lists the
 *    nodes as they become the root at each level of the recursion.  It's
 *    pretty basic, but it shows the idea.
 *
 */

public class DepthFirstSearcher   {

   private static final boolean DEBUG_ON = true;

  // Do a depth first search on theGraph from a specified node.  The node that
  //  is passed as an argument is used as the root in the recursive search.
   public static void dfs( Graph theGraph, char currentNode ) {
     // Mark the current node ("me") as visited and print its name
      theGraph.markVisited( currentNode );
      System.out.println( "  ** Visited " + currentNode + " **" );

     // Try all the nodes in the graph in the following way:
     //  if there is a node connected to me, if that node hasn't been visited
     //  already, then mark it visited and do a [recursive] depth first search
     //  on the sub-graph with that node as the root
      for( char nextNode = 'A'; nextNode <= 'I'; nextNode ++ ) {
         if( DEBUG_ON ) System.out.print( "  Checking " + nextNode + " >> " );
         if( theGraph.areTwoNodesConnected( currentNode, nextNode ) ) {
            if( DEBUG_ON ) System.out.println( "  Nodes " + currentNode + " and " + nextNode + " ARE connected." );
            if( !theGraph.wasVisited( nextNode ) ) {
               if( DEBUG_ON ) System.out.println( "Searching with " + nextNode + " as root of tree." );
               dfs( theGraph, nextNode );   // <-- HERE'S THE RECURSION!!
            } else {
               if( DEBUG_ON ) System.out.println( "    But node " + nextNode + " was already visited." );
            }
         } else {
            if( DEBUG_ON ) System.out.println( "  Nodes " + currentNode + " and " + nextNode + " are NOT connected." );
         }
      }
   }

  /**
   *  MAIN
   *   The main method declares a graph of 9 nodes, initializes them and their
   *   connections, then performs a DFS on the graph just listing out the nodes
   *   as they are visited.  It also shows the checks
   */
   public static void main( String [] args )
   {
     // Create a new graph wih 8 nodes, which will be named 'A' through 'I'
      Graph theGraph = new Graph( 9 );

     // Create links between the nodes.
      theGraph.linkTwoNodes( 'A', 'B' );
      theGraph.linkTwoNodes( 'A', 'C' );
      theGraph.linkTwoNodes( 'A', 'D' );
      theGraph.linkTwoNodes( 'A', 'E' );
      theGraph.linkTwoNodes( 'B', 'F' );
      theGraph.linkTwoNodes( 'F', 'H' );
      theGraph.linkTwoNodes( 'D', 'G' );
      theGraph.linkTwoNodes( 'G', 'I' );

     // Do a depth first search on theGraph starting from 'E'
      dfs( theGraph, 'A' );
   }
}

