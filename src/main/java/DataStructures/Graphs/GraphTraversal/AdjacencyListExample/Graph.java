package DataStructures.Graphs.GraphTraversal.AdjacencyListExample;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by timmanas on 2017-09-19.
 */
public class Graph {

    //region Members
    private LinkedHashMap<String, ArrayList<Node>> adjacencyList;
    //endregion

    //region Constructor
    public Graph() {
        adjacencyList = new LinkedHashMap<>();
    }
    //endregion


    //region Helpers
    public void addToGraph(String source, String destination, int weight) {

        // Create a Node
        Node newNode = new Node(destination, weight);

        // Check if source Already exists in the MAP
        ArrayList<Node> neighbourList = adjacencyList.get(source);
        if(neighbourList == null) {

            // Create a ArrayList if Source does not Exist in the Map
           neighbourList = new ArrayList<>();
        }

        // Add notes which have not yet appeared in the Map
        if(!neighbourList.contains(newNode))       // Note: contains here checks for both the "VALUE and the Weight". So if the one of those is different it adds it to the list
            neighbourList.add(newNode);

        adjacencyList.put(source, neighbourList);
    }

    public void printGraph() {

        if(adjacencyList == null)
            return;

        // Get KeySet
        for(String source : adjacencyList.keySet()) {
            System.out.println("Source:  " + source + "     Neighbours: " + adjacencyList.get(source));
        }

    }
    //endregion




}
