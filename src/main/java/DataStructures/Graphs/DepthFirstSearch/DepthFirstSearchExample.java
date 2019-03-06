package DataStructures.Graphs.DepthFirstSearch;

/**
 * Created by timmanas on 2019-03-05.
 */
public class DepthFirstSearchExample {

    //region Main
    public static void main(String args []) {

        // Create Graph
        Node node7 = new Node(7);

        Node node1 = new Node(1);
        Node node9 = new Node(9);

        Node node0 = new Node(0);
        Node node3 = new Node(3);
        Node node8 = new Node(8);
        Node node10 = new Node(10);

        Node node2 = new Node(2);
        Node node5 = new Node(5);

        Node node4 = new Node(4);
        Node node6 = new Node(6);


        // Set the connections
        node7.setLeftNode(node1);
        node7.setRightNode(node9);

        node1.setLeftNode(node0);
        node1.setRightNode(node3);

        node9.setLeftNode(node8);
        node9.setRightNode(node10);

        node3.setLeftNode(node2);
        node3.setRightNode(node5);

        node5.setLeftNode(node4);
        node5.setRightNode(node6);

        // PreOrder Traversal - [Root, Left Right] - Top Down
        System.out.println("PreOrder Traversal");
        preOrderTraversal(node7);

        // InOrder Traversal - [Left, Root, Right] - Left to Right ...In Order
        System.out.println("\nInOrder Traversal");
        inOrderTraversal(node7);

        // Post Order Traversal - [Left, Right, Root] - Down Up
        System.out.println("\nPostOrder Traversal");
        postOrderTraversal(node7);

    }
    //endregion


    //region Helper
    private static void preOrderTraversal(Node startNode) {

        if(startNode == null) {
            return;
        }


        System.out.print(startNode.getValue() + " --> ");
        preOrderTraversal(startNode.getLeftNode());
        preOrderTraversal(startNode.getRightNode());

    }

    private static void inOrderTraversal(Node startNode) {

        if(startNode == null) {
            return;
        }

        inOrderTraversal(startNode.getLeftNode());
        System.out.print(startNode.getValue() + " --> ");
        inOrderTraversal(startNode.getRightNode());
    }

    private static void postOrderTraversal(Node startNode) {

        if(startNode == null) {
            return;
        }

        postOrderTraversal(startNode.getLeftNode());
        postOrderTraversal(startNode.getRightNode());
        System.out.print(startNode.getValue() + " --> ");
    }

    //endregion



}
