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

        // List - 44, 38, 5, 47, 15, 36, 42, 57, 2, 46, 4, 60, 50, 48, 99, 1
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
        binarySearchTree.remove(4, binarySearchTree.getRootNode());

        // Find Predecessor
        binarySearchTree.findPredecessor(56);

        // Find Successor
        binarySearchTree.findSuccessor(23);

        // Find Min Value
        binarySearchTree.findMin();

        // Find Max Value
        binarySearchTree.findMax();

        // Pre Order Traversal
        System.out.println("\nPrinting PreOrder Traversal");
        binarySearchTree.preOrderTraversal(true, null);

        // In Order Traversal
        System.out.println("\nPrinting InOrder Traversal");
        binarySearchTree.inOrderTraversal(true, null);

        // Post Order Traversal
        System.out.println("\nPrinting PostOrder Traversal");
        binarySearchTree.postOrderTraversal(true, null);


    }

    private static void testSearch() {

        int target = 3;
        System.out.println("Search Result for Target: " + target + "    = " + (binarySearchTree.search(target, binarySearchTree.getRootNode()) != null));

        target = 6;
        System.out.println("Search Result for Target: " + target + "    = " + (binarySearchTree.search(target, binarySearchTree.getRootNode()) != null));

        target = 57;
        System.out.println("Search Result for Target: " + target + "    = " + (binarySearchTree.search(target, binarySearchTree.getRootNode()) != null));

        target = 12434;
        System.out.println("Search Result for Target: " + target + "    = " + (binarySearchTree.search(target, binarySearchTree.getRootNode()) != null));

        target = 10;
        System.out.println("Search Result for Target: " + target + "    = " + (binarySearchTree.search(target, binarySearchTree.getRootNode()) != null));

        target = 23;
        System.out.println("Search Result for Target: " + target + "    = " + (binarySearchTree.search(target, binarySearchTree.getRootNode()) != null));

        target = 5;
        System.out.println("Search Result for Target: " + target + "    = " + (binarySearchTree.search(target, binarySearchTree.getRootNode()) != null));


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

 PreOrderTraversal
 1. Visit Node
 2. Visit Left Subtree
 3. Visit Right Subtree


 InOrder Traversal

 PostOrder Traversal


 Notes
 - Search, Insert, Delete - O(LogN)
 - To solve the issue of an unbalanced Tree, its better to use an AVL Tree or Red-Black tree

 Dilema

 1. Should Binary Search Tree's be represented as an Array or LinkedList ?
    - Use a LinkedList instead, since the Array can have missing elements if the tree is unbalanced.




 */