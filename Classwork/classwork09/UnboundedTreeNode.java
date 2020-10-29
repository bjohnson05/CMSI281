/**
 *  filename: UnboundedTreeNode.java
 *  purpose: demonstrate unbounded tree
 *  @author: Dr. Johnson
 *  @date: 2020-10-27
 */
import java.util.ArrayList;

public class UnboundedTreeNode {

   private int data;
   private ArrayList<UnboundedTreeNode> children;

   UnboundedTreeNode( int d ) {
       data = d;
       children = new ArrayList<UnboundedTreeNode>();
   }

   public void add( int s ) {
       children.add( new UnboundedTreeNode( s ) );
   }

   public UnboundedTreeNode getChild( int index ) {
       return children.get( index );
   }

   public int getValue() {
       return data;
   }
}
