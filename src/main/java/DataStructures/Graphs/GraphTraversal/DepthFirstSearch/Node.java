package DataStructures.Graphs.GraphTraversal.DepthFirstSearch;

/**
 * Created by timmanas on 2017-10-09.
 */
public class Node {

    //region Members
    private int value;
    private boolean visited;
    private Node[] neighbours;
    //endregion

    //region Initializers
    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node[] neighbours) {
        this.value = value;
        this.neighbours = neighbours;
    }

    //endregion

    //region Getters
    public int getValue() {return value;}

    public boolean isVisited() {return visited;}

    public Node[] getNeighbours() {return neighbours;}

    //endregion

    //region Setters
    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setNeighbours(Node[] neighbours) {
        this.neighbours = neighbours;
    }

    //endregion
}
