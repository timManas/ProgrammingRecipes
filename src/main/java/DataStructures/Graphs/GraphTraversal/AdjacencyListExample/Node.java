package DataStructures.Graphs.GraphTraversal.AdjacencyListExample;

/**
 * Created by timmanas on 2017-09-20.
 */
public class Node {

    //region Members
    private String value;
    private int weight;
    //endregion

    //region Constructor
    public Node(String value, int weight) {
        this.value = value;
        this.weight = weight;
    }
    //endregion

    //region Getters
    public String getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return (value + "(" + weight + ")");
    }
    //endregion

}
