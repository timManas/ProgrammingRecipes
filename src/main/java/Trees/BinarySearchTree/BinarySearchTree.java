package Trees.BinarySearchTree;

import static sun.misc.Version.println;

/**
 * Created by timmanas on 2017-07-30.
 */
public class BinarySearchTree {

    //region Members
    private Node rootNode;
    //endregion

    //region Constructors

    public BinarySearchTree() {
        rootNode = new Node();
    }

    public BinarySearchTree(int value) {
        rootNode = new Node(value, null, null,null);
    }

    //endregion

    //region Getters

    public Node getRootNode() {
        return rootNode;
    }

    //endregion

    //region Helpers
    public void create(int [] input) {
        for(int value : input) {
            add(value);
        }
    }

    public void add(int value) {

        if(rootNode.getValue() == 0) {
            rootNode = null;
            rootNode = new Node(value, null, null,null);
            return;
        }

        Node currentNode = rootNode;
        Node childNode = null;

        // Traverse BST until Leaf's are reached
        do {


          currentNode = childNode != null ? childNode : currentNode;

          if(value < currentNode.getValue()) {                        // Check if the target Value is smaller than currentNode Value

              // Check if the there is a Left Child Node∂
              if(currentNode.getLeftChildNode() == null) {
                  Node newNode = new Node(value, currentNode, null, null);
                  currentNode.setLeftChildNode(newNode);
                  break;
              }

              childNode = currentNode.getLeftChildNode();

          } else if (value > currentNode.getValue()) {                // Check if the target Value is smaller than currentNode Value

              // Check if there is a right Child Node
              if(currentNode.getRightChildNode() == null) {
                  Node newNode = new Node(value, currentNode, null, null);
                  currentNode.setRightChildNode(newNode);
                  break;
              }

              childNode = currentNode.getRightChildNode();

          } else
              System.out.println("We'll tackle this Bull Shit Later");

        } while(currentNode.getLeftChildNode() != null || currentNode.getRightChildNode() != null);

        System.out.println("Finished Adding value Binary Search Tree: " + value );
    }

    public Node search(int target, Node node) {

        // Start from the Root Node
        Node currentNode = node;

        // Compare Value from the Tree
        do {
            // If you reach a null node, then the Element does Not Exist in the Binary Treee
            if(currentNode == null) {
//                System.out.println("Current Node is Null ... Exiting");
                return null;
            }


            if(currentNode.getValue() == target) {
//                System.out.println("Found Target: " + target);
                return currentNode;

            } else if (currentNode.getValue() > target) {           // Traverse Left Node
//                System.out.println("Searching Left Subtree for value - " + target);
                currentNode = search(target, currentNode.getLeftChildNode());
                break;

            } else if (currentNode.getValue() < target) {           // Traverse Right Node
//                System.out.println("Searching Right Subtree for value- " + target);
                currentNode = search(target, currentNode.getRightChildNode());
                break;

            }
        } while (currentNode != null);

        return currentNode;
    }



    public void remove(int key, Node node) {

        Node currentNode = search(key, node);

        // Search for Element
        if(currentNode == null) {
            System.out.println("Remove Functionality - Element is Not found");
            return;
        }

        System.out.println("Element is found in Binary Tree - " + key);

        // Case # 1 - Node is a Leaf
        if(currentNode.getLeftChildNode() == null && currentNode.getRightChildNode() == null) {
            System.out.println("Removing Leaf Node of Value: " + key);
            currentNode.destroy();
        }

        // Case # 2 - Node has one child leaf

        // Case # 3 - Node is an two Node children



    }

    public void findPredecessor(int i) {
    }

    public void findSuccessor(int i) {
    }

    public void findMin() {
    }

    public void findMax() {
    }

    public void preOrderTraversal(boolean isRoot, Node node) {

        Node currentNode = node;

        if(isRoot)
            currentNode = rootNode;

        if(currentNode == null)
            return;

        System.out.println("Element: " + currentNode.getValue());
        preOrderTraversal(false, currentNode.getLeftChildNode());
        preOrderTraversal(false, currentNode.getRightChildNode());
    }

    public void inOrderTraversal(boolean isRoot, Node node) {

        Node currentNode = node;

        if(isRoot)
            currentNode = rootNode;

        if(currentNode == null)
            return;

        inOrderTraversal(false, currentNode.getLeftChildNode());
        System.out.println("Element: " + currentNode.getValue());
        inOrderTraversal(false, currentNode.getRightChildNode());
    }

    public void postOrderTraversal(boolean isRoot, Node node) {

        Node currentNode = node;

        if(isRoot)
            currentNode = rootNode;

        if(currentNode == null)
            return;

        postOrderTraversal(false, currentNode.getLeftChildNode());
        postOrderTraversal(false, currentNode.getRightChildNode());
        System.out.println("Element: " + currentNode.getValue());
    }

    //endregion


}
