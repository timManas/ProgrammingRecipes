package Trees.BinarySearchTree;

/**
 * Created by timmanas on 2017-07-30.
 */
public class BinSearchTreeMain {

    //region Members
    private static BinarySearchTree binarySearchTree;
    //endregion

    //region Main
    public static void main(String [] args) {

        int [] input = {44, 38, 5, 47, 15, 36, 42, 57, 2, 46, 4, 60, 50, 48};

        // Create Binary Search Tree
        binarySearchTree = new BinarySearchTree();
        binarySearchTree.create(input);

        // Insert
        binarySearchTree.add(99);
        binarySearchTree.add(1);

        // Search
        testSearch();

        // Remove
        binarySearchTree.remove(47);

        // Find Predecessor
        binarySearchTree.findPredecessor(56);

        // Find Successor
        binarySearchTree.findSuccessor(23);

        // Find Min Value
        binarySearchTree.findMin();

        // Find Max Value
        binarySearchTree.findMax();

        // In Order Traversal
        binarySearchTree.inOrderTraversal();

        // Pre Order Traversal
        binarySearchTree.preOrderTraversal();

        // Post Order Traversal
        binarySearchTree.postOrderTraversal();

    }

    private static void testSearch() {

        int target = 3;
        System.out.println("Search Result for Target: " + target + "    = " + binarySearchTree.search(target, binarySearchTree.getRootNode()));

        target = 6;
        System.out.println("Search Result for Target: " + target + "    = " + binarySearchTree.search(target, binarySearchTree.getRootNode()));

        target = 97;
        System.out.println("Search Result for Target: " + target + "    = " + binarySearchTree.search(target, binarySearchTree.getRootNode()));

        target = 12434;
        System.out.println("Search Result for Target: " + target + "    = " + binarySearchTree.search(target, binarySearchTree.getRootNode()));

        target = 10;
        System.out.println("Search Result for Target: " + target + "    = " + binarySearchTree.search(target, binarySearchTree.getRootNode()));

        target = 23;
        System.out.println("Search Result for Target: " + target + "    = " + binarySearchTree.search(target, binarySearchTree.getRootNode()));

        target = 5;
        System.out.println("Search Result for Target: " + target + "    = " + binarySearchTree.search(target, binarySearchTree.getRootNode()));


    }
    //endregion


}


/**

 Binary Search Tree Data Structures

 What ?
 - Binary Tree which each node has at a maximum of two children
    - Left Child Node < Parent Node
    - Right Child Node > Parent Node

 Why ?

 Notes
 - Search, Insert, Delete - O(LogN)
 - To solve the issue of an unbalanced Tree, its better to use an AVL Tree or Red-Black tree

 Dilema

 1. Should Binary Search Tree's be represented as an Array or LinkedList ?
    - Use a LinkedList instead, since the Array can have missing elements if the tree is unbalanced.




 */