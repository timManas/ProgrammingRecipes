package DataStructures.Graphs.GraphExample.AdjacencyListExample;

/**
 * Created by timmanas on 2017-09-19.
 */
public class GraphExample {


    public static void main(String args[]) {

        Graph graph = new Graph();

        // Populate Graph
        graph.addToGraph("Toronto", "Vancouver", 100);
        graph.addToGraph("Toronto", "Dubai", 100);
        graph.addToGraph("Toronto", "Montreal", 100);

        graph.addToGraph("Vancouver", "Edmonton", 100);
        graph.addToGraph("Edmonton", "Vancouver", 100);
        graph.addToGraph("Dubai", "Vancouver", 100);

        graph.addToGraph("New YorK", "Dubai", 100);
        graph.addToGraph("Edmonton", "Toronto", 100);
        graph.addToGraph("Dubai", "Paris", 100);

        // Duplicates here
        graph.addToGraph("Paris", "Toronto", 100);
        graph.addToGraph("Paris", "Toronto", 100);


        // Print Adjacency List
        graph.printGraph();
    }

}
