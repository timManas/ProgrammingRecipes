package DataStructures.Trees.BinarySearchTree;

/**
 * Created by timmanas on 2017-07-30.
 */
public class BinSearchTreeMain {

    //region Members
    private static BinarySearchTree binarySearchTree;
    //endregion

    //region Main
    public static void main(String [] args) {

        // List - 15, 6, 19, 3, 7, 17, 20, 2, 4, 13, 9, 5, 99, 18
        int [] input = {15, 6, 19, 3, 7, 17, 20, 2, 4, 13, 9};

        // Create Binary Search Tree
        System.out.println("============= CreateBST =============");
        binarySearchTree = new BinarySearchTree();
        binarySearchTree.create(input);

        // Insert
        System.out.println("\n============= INSERT =============");
        binarySearchTree.add(5);
        binarySearchTree.add(99);
        binarySearchTree.add(18);

        // Search
        System.out.println("\n============= SEARCH =============");
        testSearch();

        // Find Predecessor
        System.out.println("\n============= SEARCH PREDECESSOR =============");
        binarySearchTree.findPredecessor(15).getValue();
        binarySearchTree.findPredecessor(5).getValue();
        binarySearchTree.findPredecessor(9).getValue();
        binarySearchTree.findPredecessor(4).getValue();
        binarySearchTree.findPredecessor(20).getValue();
        binarySearchTree.findPredecessor(13).getValue();
        binarySearchTree.findPredecessor(3).getValue();

        // Find Successor
        System.out.println("\n============= SEARCH SUCCESSOR =============");
        binarySearchTree.findSuccessor(5);
        binarySearchTree.findSuccessor(3);
        binarySearchTree.findSuccessor(15);
        binarySearchTree.findSuccessor(19);
        binarySearchTree.findSuccessor(3);
        binarySearchTree.findSuccessor(18);
        binarySearchTree.findSuccessor(99);

        // Find Min Value
        System.out.println("\n============= MIN VALUE =============");
        binarySearchTree.findMin();

        // Find Max Value
        System.out.println("\n============= MAX VALUE =============");
        binarySearchTree.findMax();

        // Remove
        System.out.println("\n============= REMOVE =============");
        binarySearchTree.remove(5);    // Upto here is good
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(3);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(99);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(8);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(2);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(7);            // Removing Root Node when there are no left elements Left
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(9);
        binarySearchTree.preOrderTraversal(true, null);

////
//        // Pre Order Traversal
//        System.out.println("\nPrinting PreOrder Traversal");
//        binarySearchTree.preOrderTraversal(true, null);
//
//        // In Order Traversal
//        System.out.println("\nPrinting InOrder Traversal");
//        binarySearchTree.inOrderTraversal(true, null);
//
//        // Post Order Traversal
//        System.out.println("\nPrinting PostOrder Traversal");
//        binarySearchTree.postOrderTraversal(true, null);


    }

    private static void testSearch() {

        int target = 3;
        System.out.println("Search Result for Target: " + target + "    = " + (binarySearchTree.search(target, "Iterative", binarySearchTree.getRootNode()) != null));

        target = 6;
        System.out.println("Search Result for Target: " + target + "    = " + (binarySearchTree.search(target, "Iterative", binarySearchTree.getRootNode()) != null));

        target = 57;
        System.out.println("Search Result for Target: " + target + "    = " + (binarySearchTree.search(target, "Iterative", binarySearchTree.getRootNode()) != null));

        target = 12434;
        System.out.println("Search Result for Target: " + target + "    = " + (binarySearchTree.search(target, "Iterative", binarySearchTree.getRootNode()) != null));

        target = 10;
        System.out.println("Search Result for Target: " + target + "    = " + (binarySearchTree.search(target, "Iterative", binarySearchTree.getRootNode()) != null));

        target = 23;
        System.out.println("Search Result for Target: " + target + "    = " + (binarySearchTree.search(target, "Iterative", binarySearchTree.getRootNode()) != null));

        target = 5;
        System.out.println("Search Result for Target: " + target + "    = " + (binarySearchTree.search(target, "Iterative", binarySearchTree.getRootNode()) != null));

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
 1. Visit Left Subtree
 2. Visit Node
 3. Visit Right Subtree

 PostOrder Traversal
 1. Visit Left Subtree
 2. Visit Right Subtree
 3. Visit Node


 Notes
 - Search, Insert, Delete - O(LogN)
 - To solve the issue of an unbalanced Tree, its better to use an AVL Tree or Red-Black tree

 Dilema

 1. Should Binary Search Tree's be represented as an Array or LinkedList ?
    - Use a LinkedList instead, since the Array can have missing elements if the tree is unbalanced.


 Lessons learned

 1. You should NOT use BI-DIRECTIONAL Nodes
    - the references may not be updated .. AND FUCKS UP ALOT OF SHIT =/. Alot of work to constantly update it

 2. Consider
    - Remove from Root, Node or Leaf
    - Do Element on Left and Right Node



 */