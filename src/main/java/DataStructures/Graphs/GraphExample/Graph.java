package DataStructures.Graphs.GraphExample;

import java.util.LinkedList;

/**
 * Created by timmanas on 2017-09-19.
 */
public class Graph {

    //region Members
    int numNodes;
    AdjacencyList array[];
    //endregion

    //region Constructor

    /**
     * We should have a Graph Object which contains an Array of Adjacency List with inputs
     * 0,1,2,3,4
     * Yes I know thats pretty shit =(
     * @param numNodes
     *
     */
    public Graph(int numNodes) {
        this.numNodes = numNodes;
        array = new AdjacencyList[numNodes];

        for (int i = 0; i < numNodes; i++) {
            array[i] = new AdjacencyList();
            array[i].head = null;
        }
    }
    //endregion


    //region Helpers
    public void addEdge(int source, int destination) {

        // Create a new Node while Setting the Source and Destination
        AdjacencyNode node = new AdjacencyNode(source, destination);

        // add this node to the source adj List
        node.next = array[source].head;
        array[source].head = node;
    }

    public void printGraph() {

        int vertex = this.numNodes;
        AdjacencyNode node;

        for (int i = 0; i < vertex; i++) {
            node = this.array[i].head;

            if(node!=null){

                System.out.println("\nNodes connected to Vertex " + node.source + " are :");

                while (node != null) {
                    System.out.print("  " + node.destination);
                    node = node.next;
                }
            }

        }
    }
    //endregion


    //region Inner Classes

    // Create adjacency node
    static class AdjacencyNode {

        int source;
        int destination;
        AdjacencyNode next;

        public AdjacencyNode(int source, int destination) {
            this.source = source;
            this.destination = destination;
            next = null;
        }
    }

    static class AdjacencyList {
        AdjacencyNode head;
    }

    //endregion

}
