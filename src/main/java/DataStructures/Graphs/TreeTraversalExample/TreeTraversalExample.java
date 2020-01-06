package DataStructures.Graphs.TreeTraversalExample;


import sun.misc.Queue;

import java.util.HashSet;
import java.util.Stack;

/**
 * Created by timmanas on 2019-03-05.
 */
public class TreeTraversalExample {

    //region Main
    public static void main(String args []) throws InterruptedException {

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

        // Depth First Traversal by Stack
        System.out.println("\nDepth First Traveral using Stack using Recursion");
        depthFirstTraversal_ByStack(node7);

        // Depth First Traversal by Stack using Iteration
        System.out.println("\nDepth First Traversal using Stack with ITERATION");
        depthFirstTraversal_Iteratively(node7);

        // Breath First Traversal by Queue
        System.out.println("\nBreath First Traversal using Queue");
        breathFirstTraversal_ByQueue(node7);


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

    private static void depthFirstTraversal_ByStack(Node startNode) {

        Stack<Node> stack = new Stack<>();
        HashSet<Integer> visitedNodes = new HashSet<>();

        // Push the Head Node
        System.out.print(startNode.getValue() + " --> ");
        stack.push(startNode);
        visitedNodes.add(startNode.getValue());


        traverseNode(startNode, stack, visitedNodes);

    }

    private static void traverseNode(Node node, Stack<Node> stack, HashSet<Integer> visitedNodes) {

        if(node == null) {
            node = stack.pop();
            return;
        }


        visitedNodes.add(node.getValue());

        if(node.getLeftNode() != null && !visitedNodes.contains(node.getLeftNode().getValue())) {
            System.out.print(node.getLeftNode().getValue() + " --> ");
            traverseNode(node.getLeftNode(), stack, visitedNodes);
        }

        if(node.getRightNode() != null && !visitedNodes.contains(node.getRightNode().getValue())) {
            System.out.print(node.getRightNode().getValue() + " --> ");
            traverseNode(node.getRightNode(), stack, visitedNodes);
        }

    }


    private static void breathFirstTraversal_ByQueue(Node startNode) throws InterruptedException {

        Queue<Node> queue = new Queue<>();

        // Enter the starting Node
        System.out.print(startNode.getValue() + " -->");
        queue.enqueue(startNode);

        while(!queue.isEmpty()) {

            // Print the child Element
            Node node = queue.dequeue();

            if(node.getLeftNode() != null) {
                System.out.print(node.getLeftNode().getValue() + " --> ");
                queue.enqueue(node.getLeftNode());
            }

            if(node.getRightNode()!= null) {
                System.out.print(node.getRightNode().getValue() + " --> ");
                queue.enqueue(node.getRightNode());

            }
        }

    }

    public static void depthFirstTraversal_Iteratively(Node startNode) {

            Boolean isSubTree = false;

            Stack<Node> nodeStack = new Stack<Node>();

            // Pushing Head Node
            nodeStack.push(startNode);
            
            // Traverse Tree Iteratively instead of Recursively
            while (nodeStack.isEmpty() == false) {


                Node currentNode = nodeStack.pop();
                System.out.print(currentNode.getValue() + " --> ");

                if (currentNode.getRightNode() != null) {
                    nodeStack.push(currentNode.getRightNode());
                }

                if (currentNode.getLeftNode() != null) {
                    nodeStack.push(currentNode.getLeftNode());
                }

            }

    }

    //endregion





}


/**

 PreOrder
 - Top to Bottom
 - Very definition of DFS
 - Good for finding every possible route starting from the top

 Inorder
 - From Left to Right
 - Flattens an tree to an Array

 PostOrder
 - Bottom to Top
 - Good for deleting elements
 - I still dont know when to use this ?


 Depth First Search Using Stack
 - Same as PreOrder Traversal
 - Can work with multiple neighbours and not just trees

 Breath First Search
 - Level Order
 - Find Nodes with same Parent


 Shortcut
 DS-BQ

 */
