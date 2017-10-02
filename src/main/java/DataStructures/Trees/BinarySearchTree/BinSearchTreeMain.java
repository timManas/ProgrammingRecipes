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

        // List - 15, 6, 19, 3, 7, 17, 20, 2, 4, 13, 9, 16, 5, 99, 18
        // Remove 1 - 3, 6, 13, 9, 19, 15, 17, 18, 20, 99, 4, 7
        // Remove 2 - 15, 16, 17, 18, 19, 20, 99
        // Remove 3 - 6, 3, 7, 2, 4, 13, 5, 9
        int [] input = {15, 6, 19, 3, 7, 17, 20, 2, 4, 13, 9, 16};

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
        testPredecessor();

        // Find Successor
        System.out.println("\n============= SEARCH SUCCESSOR =============");
        testSucessor();

        // Find Min Value
        System.out.println("\n============= MIN VALUE =============");
        binarySearchTree.findMin();

        // Find Max Value
        System.out.println("\n============= MAX VALUE =============");
        binarySearchTree.findMax();

        // Pre Order Traversal
        System.out.println("\n============= PREORDER =============");
        binarySearchTree.preOrderTraversal(true, null);

        // In Order Traversal
        System.out.println("\n============= INORDER =============");
        binarySearchTree.inOrderTraversal(true, null);

        // Post Order Traversal
        System.out.println("\n============= POSTORDER =============");
        binarySearchTree.postOrderTraversal(true, null);

        // Remove
        System.out.println("\n============= REMOVE =============");
//        testRemove1();
//        testRemove2();
        testRemove3();

        System.out.println("=========== END ===========");
    }
    //endregion

    //region TestMethods
    private static void testPredecessor() {
        binarySearchTree.findPredecessor(15).getValue();
        binarySearchTree.findPredecessor(5).getValue();
        binarySearchTree.findPredecessor(9).getValue();
        binarySearchTree.findPredecessor(4).getValue();
        binarySearchTree.findPredecessor(20).getValue();
        binarySearchTree.findPredecessor(13).getValue();
        binarySearchTree.findPredecessor(3).getValue();
    }

    private static void testSucessor() {
        binarySearchTree.findSuccessor(5);
        binarySearchTree.findSuccessor(3);
        binarySearchTree.findSuccessor(15);
        binarySearchTree.findSuccessor(19);
        binarySearchTree.findSuccessor(3);
        binarySearchTree.findSuccessor(18);
        binarySearchTree.findSuccessor(99);
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

    private static void testRemove1() {
        binarySearchTree.remove(3);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(6);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(13);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(9);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(19);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(15);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(17);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(18);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(20);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(99);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(4);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(7);
        binarySearchTree.preOrderTraversal(true, null);
    }

    private static void testRemove2() {
        // Remove 2 - 15, 16, 17, 18, 19, 20, 99, 4, 6, 13, 9
        binarySearchTree.remove(15);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(16);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(17);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(18);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(19);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(20);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(99);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(4);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(6);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(13);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(9);
        binarySearchTree.preOrderTraversal(true, null);

    }

    private static void testRemove3() {
        // Remove 3 - 6, 3, 7, 2, 4, 13, 5, 9

        binarySearchTree.remove(6);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(3);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(7);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(2);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(4);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(13);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(5);
        binarySearchTree.preOrderTraversal(true, null);

        binarySearchTree.remove(9);
        binarySearchTree.preOrderTraversal(true, null);


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