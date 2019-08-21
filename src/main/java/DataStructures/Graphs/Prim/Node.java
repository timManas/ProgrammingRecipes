package DataStructures.Graphs.Prim;

import java.util.HashMap;

/**
 * Created by timmanas on 2019-08-20.
 */
public class Node {
    //region Members
    private String id;
    private HashMap<String, Integer> adjNode;      //
    //endregion

    //region Initializer
    public Node(String id) {
        this.id = id;
        adjNode = new HashMap<>();
    }
    //endregion

    //region Getters
    public String getId() {
        return id;
    }

    public HashMap<String, Integer> getAdjacentNode() {
        return adjNode;
    }

    //endregion

    //region Setters
    public void addNode(String node, int weight) {
        adjNode.put(node, weight);
    }
    //endregion


}
