/**
 *  File Name  :  Graph.java
 *  Purpose    :  Provide a Graph class for the depth first search demo
 *  Author     :  B.J. Johnson
 *  Date       :  26-Mar-2003
 *  Description:  This class is the graph class which is the companion
 *                   to the DepthFirstSearcher class.
 *
 *  This graph is represented simply as an adjacency matrix array.  The
 *    array is dimensioned as "n-by-n" where "n" is the number of nodes
 *    in the graph.  The graph is initialized by marking two nodes as
 *    connected in the adjacency matrix.
 *
 */

public class Graph   {
   private int   [][] adjaMatrix; // The adjacency matrix represents the graph
   private boolean [] visited;    // Element is true if node is visited

  // Constructor for the graph; this just declares the arrays, then
  //  simply initializes the adjacency matrix to all zeroes
   public Graph( int numNodes )   {
      adjaMatrix = new int[numNodes][numNodes];
      visited    = new boolean[numNodes];

     // Initialize all adjacency elements to zero (just insurance since ints
     //  are automatically initialized to zero), and initialize the visited
     //  array to all false
      for( int i = 0; i < adjaMatrix.length; i ++ )   {
         visited[i] = false;
         for( int j = 0; j < adjaMatrix[i].length; j ++ )   {
            adjaMatrix[i][j] = 0;
         }
      }
   }

  // Mark two nodes as connected.  This is done by putting a "1" in
  //  each of the cells in the adjacency matrix for the two connected nodes
   public void link( int nodeName1, int nodeName2 )   {
      adjaMatrix[nodeName1][nodeName2] = 1;
      adjaMatrix[nodeName2][nodeName1] = 1;
   }

  // Make a link between two nodes by calling the "link()" method with
  //  their converted indices; note that we have to FIND each node's index
   public void linkTwoNodes( char nodeOne, char nodeTwo )   {
      link( convertToIndex(nodeOne), convertToIndex(nodeTwo) );
   }

  // Check if this node has been visited already
   public boolean wasVisited( char node )   {
      int index = convertToIndex( node );   // Calculate the node index
      return( visited[index] );             // Return the array value
   }

  // Mark a node as having been visited
   public void markVisited( char node )   {
      visited[convertToIndex( node )] = true;
   }

  // Calculate a node's index based on its letter name (ASCII)
   public int convertToIndex( char nodeName ) {
      return( nodeName - 'A' );
   }

  // Check if two nodes are connected
   public boolean areTwoNodesConnected( char nodeOne, char nodeTwo )   {
      return( adjaMatrix[convertToIndex(nodeOne)]
                        [convertToIndex(nodeTwo)] == 1 );
   }
}

