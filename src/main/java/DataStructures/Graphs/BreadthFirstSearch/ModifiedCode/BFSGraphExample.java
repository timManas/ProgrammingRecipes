package DataStructures.Graphs.BreadthFirstSearch.ModifiedCode;

import java.util.ArrayDeque;

/**
 * Created by timmanas on 2017-10-09.
 */
public class BFSGraphExample {

    //region Main
    public static void main(String [] args) {

        // Create Nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        
        // Populate Neighbours
        node1.setNeighbours(new Node[]{node2,node3,node5});
        node2.setNeighbours(new Node[]{node1,node4, node6});
        node3.setNeighbours(new Node[]{node1,node4,node5});
        node4.setNeighbours(new Node[]{node2,node3,node5, node7});
        node5.setNeighbours(new Node[]{node1,node3,node4});
        node6.setNeighbours(new Node[]{node2});
        node7.setNeighbours(new Node[]{node4, node8});
        node8.setNeighbours(new Node[]{node7, node9});
        node9.setNeighbours(new Node[]{node8});
        
        // BreadthFirstSearch
        breathFirstSearch(node3, 9);
    }


    //endregion


    //region Helpers
    private static void breathFirstSearch(Node root, int target) {


        System.out.println("=========== BreathFirst Search ===========");
        System.out.println("Target: " + target);

        if(root.getValue() == target)
            System.out.println("Found in Root Node");
        

        // Create a Queue
        ArrayDeque<Node> queue = new ArrayDeque<>();
        root.setVisited(true);
        queue.add(root);                           // Add Node to Root


        while(!queue.isEmpty()){

            Node currentNode = queue.poll();          // Remove the Element in the Queue
            System.out.println("\n-- Current Node: " + currentNode.getValue());

            for(Node node: currentNode.getNeighbours()){

                // If Node has Not been Visited ->  Search the neighbours of this Node
                if(!node.isVisited()){

                    System.out.println("Node: " + node.getValue());
                    node.setVisited(true);
                    if(node.getValue() == target)  {
                        System.out.println("Found "+ node.getValue());             // Found Value
                    }
                    queue.add(node);                            // What does this do ??

                }else {
                    System.out.println("Node Already Visited: " + node.getValue());
                }

            }
        }




    }
    //endregion

}
