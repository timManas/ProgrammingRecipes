package DataStructures.Graphs.GraphExample;

import java.util.LinkedList;

/**
 * Created by timmanas on 2017-09-19.
 */
public class GraphExample {


    public static void main(String args[]) {
        Graph graph = new Graph(5);  // Inputs are (0,1,2,3,4)
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 5);
        graph.printGraph();
    }

}
