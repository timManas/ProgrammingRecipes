package DataStructures.Graphs.GraphExample.BreadthFirstSearch.ModifiedCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by timmanas on 2017-10-09.
 */
public class BFSGraphExample {

    //region Main
    public static void main(String [] args) {

        // Create Nodes
        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        
        // Populate Neighbours
        node0.setNeighbours(new Node[]{node8});
        node1.setNeighbours(new Node[]{node2,node3,node5});
        node2.setNeighbours(new Node[]{node1,node4, node6});
        node3.setNeighbours(new Node[]{node1,node4,node5});
        node4.setNeighbours(new Node[]{node2,node3,node5, node7});
        node5.setNeighbours(new Node[]{node1,node3,node4});
        node6.setNeighbours(new Node[]{node2});
        node7.setNeighbours(new Node[]{node4, node8});
        node8.setNeighbours(new Node[]{node7, node0});

        
        // BreadthFirstSearch
        breathFirstSearch(node1, 8);
    }


    //endregion


    //region Helpers
    private static void breathFirstSearch(Node root, int target) {

        System.out.println("=========== BreathFirst Search ===========");
        System.out.println("Target: " + target);

        if(root.getValue() == target)
            System.out.println("Found in Root Node");


        // Create a Queue
        Queue<Node> queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);                           // Add Node to Root


        while(!queue.isEmpty()){

            Node currentNode = queue.remove();          // Remove the Element in the Queue
            System.out.println("\n-- Current Node: " + currentNode.getValue());

            for(Node node: currentNode.getNeighbours()){

                // If Node has Not been Visited ->  Search the neighbours of this Node
                if(!node.isVisited()){

                    System.out.println("Node: " + node.getValue());
                    node.setVisited(true);
                    if(node.getValue() == target)  {
                        System.out.println("Found "+ node.getValue());             // Found Value
                    }
                    queue.add(node);                            // Add to the Head
                }else {
                    System.out.println("Node Already Visited: " + node.getValue());
                }

            }
        }




    }
    //endregion

}
