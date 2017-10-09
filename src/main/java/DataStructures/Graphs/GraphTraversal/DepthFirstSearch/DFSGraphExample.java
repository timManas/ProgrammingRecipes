package DataStructures.Graphs.GraphTraversal.DepthFirstSearch;

import java.util.Stack;

/**
 * Created by timmanas on 2017-10-09.
 */
public class DFSGraphExample {


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

        depthFirstSearch(node6, 8);
    }

    //endregion

    //region Helpers
    private static void depthFirstSearch(Node root, int target) {

        System.out.println("=========== DepthFirst Search ===========");
        System.out.println("Target: " + target);

        if(root.getValue() == target)
            System.out.println("Found in Root Node");

        // Create a Stack
        Stack<Node> stack = new Stack<>();
        root.setVisited(true);
        stack.push(root);

        while(!stack.isEmpty()) {

            Node currentNode = stack.pop();
            System.out.println("\n-- Current Node: " + currentNode.getValue());

            for(Node node : currentNode.getNeighbours()) {

                // If Node has NOT been visited -> Search the next Node
                if(!node.isVisited()) {

                    System.out.println("Node: " + node.getValue());
                    node.setVisited(true);
                    if(node.getValue() == target)
                        System.out.println("Found: " + node.getValue());

                    stack.push(node);
                } else {
                    System.out.println("Node Already Visited: " + node.getValue());
                }


            }

        }

    }
    //endregion


}
