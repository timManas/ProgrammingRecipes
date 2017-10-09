package DataStructures.Graphs.GraphTraversal.BreadthFirstSearch.ExampleCode;

/**
 * Created by timmanas on 2017-10-07.
 */
public class GraphNode {

    //region Members
    private int val;
    private GraphNode next;
    private GraphNode[] neighbors;
    private boolean visited;
    //endregion

    //region Constructors
    public GraphNode(int x) {
        val = x;
    }

    public GraphNode(int x, GraphNode[] n){
        val = x;
        neighbors = n;
    }
    //endregion

    //region Getters
    public int getVal() { return val; }

    public GraphNode getNext() {return next;}

    public GraphNode[] getNeighbors() { return neighbors;}

    public boolean isVisited() { return visited;}
    //endregion

    //region Setters

    public void setVal(int val) {this.val = val;}

    public void setNext(GraphNode next) {this.next = next;}

    public void setNeighbors(GraphNode[] neighbors) {this.neighbors = neighbors;}

    public void setVisited(boolean visited) {this.visited = visited;}

    //endregion

    //region Helper
    //endregion
}
