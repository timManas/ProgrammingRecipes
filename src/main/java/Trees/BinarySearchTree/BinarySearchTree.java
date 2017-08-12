package Trees.BinarySearchTree;

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

        System.out.println("Finished Creating Binary Search Tree .... \n");
    }

    public boolean search(int target, Node node) {

        boolean result = false;

        // Start from the Root Node
        Node currentNode = node;

        // Compare Value from the Tree
        do {

            // If you reach a null node, then the Element does Not Exist in the Binary Treee
            if(currentNode == null)
                return false;

            if(currentNode.getValue() == target) {
//                System.out.println("Found Target: " + target);
                return true;
            } else if (currentNode.getValue() > target) {           // Traverse Left Node
//                System.out.println("Searching Left Subtree - " + target);
                result = search(target, currentNode.getLeftChildNode());
                break;
            } else if (currentNode.getValue() < target) {           // Traverse Right Node
//                System.out.println("Searching Right Subtree - " + target);
                result = search(target, currentNode.getRightChildNode());
                break;
            }
        } while (currentNode != null);

        return result;
    }



    public void remove(int key) {

        // Search for Element

        // Case # 1 - Node is a Leaf

        // Case # 2 - Node has one child leaf

        // Case # 3 - Node is an intermeditary Node


    }

    public void findPredecessor(int i) {
    }

    public void findSuccessor(int i) {
    }

    public void findMin() {
    }

    public void findMax() {
    }

    public void inOrderTraversal() {
    }

    public void preOrderTraversal() {
    }

    public void postOrderTraversal() {
    }

    //endregion


}
