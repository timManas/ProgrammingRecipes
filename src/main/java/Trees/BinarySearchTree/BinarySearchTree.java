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


          } else {
              System.out.println("We'll tackle this Bull Shit Later");
          }
        }   while(currentNode.getLeftChildNode() != null || currentNode.getRightChildNode() != null);

        System.out.println("Finished Creating Binary Search Tree .... \n");
    }

    public void search(int i) {
    }

    public void remove(int i) {
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
