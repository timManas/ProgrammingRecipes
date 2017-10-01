package DataStructures.Trees.BinarySearchTree;

/**
 * Created by timmanas on 2017-07-30.
 */
public class BinarySearchTree {

    //region Members
    public static String ITERATION_TYPE_ITERATIVE = "Iterative";
    public static String ITERATION_TYPE_RECURSIVE = "Recursive";
    private Node rootNode;
    //endregion

    //region Constructors

    public BinarySearchTree() {
        rootNode = new Node();
    }

    public BinarySearchTree(int value) {
        rootNode = new Node(value, 0, null,null);
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
            rootNode = new Node(value, 0, null,null);
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
                  Node newNode = new Node(value, currentNode.getValue(), null, null);
                  currentNode.setLeftChildNode(newNode);
                  break;
              }

              childNode = currentNode.getLeftChildNode();

          } else if (value > currentNode.getValue()) {                // Check if the target Value is smaller than currentNode Value

              // Check if there is a right Child Node
              if(currentNode.getRightChildNode() == null) {
                  Node newNode = new Node(value, currentNode.getValue(), null, null);
                  currentNode.setRightChildNode(newNode);
                  break;
              }

              childNode = currentNode.getRightChildNode();

          } else
              System.out.println("We'll tackle this Bull Shit Later");

        } while(currentNode.getLeftChildNode() != null || currentNode.getRightChildNode() != null);

        System.out.println("Finished Adding value Binary Search Tree: " + value );
    }

    public Node search(int target, String type, Node node) {

        // Start from the Latest Node
        Node currentNode;

        // Iterative Search
        if(type.equalsIgnoreCase(ITERATION_TYPE_ITERATIVE)) {
            currentNode = rootNode;

            // This assumes that the while loop will FIND the value ...we need a way to stop the Loop when node is null ..hence the != null
            while (currentNode != null && currentNode.getValue() != target) {

                // Traverse Left Node
                if(target < currentNode.getValue()) {
                    currentNode = currentNode.getLeftChildNode();

                    // Traverse Right Node
                } else if (target > currentNode.getValue()) {
                    currentNode = currentNode.getRightChildNode();

                } else {
                    System.out.println("Target Node Found - " + currentNode.getValue());
                }

            }

            // Current Node could be null
            return currentNode;
        }

        // Recursive Search
        currentNode = node;

        // Compare Value from the Tree
        do {
            // If you reach a null node, then the Element does Not Exist in the Binary Treee
            if(currentNode == null) {
                return null;
            }

            if(currentNode.getValue() == target) {
                return currentNode;

            } else if (currentNode.getValue() > target) {           // Traverse Left Node
                currentNode = search(target, type, currentNode);
                break;

            } else if (currentNode.getValue() < target) {           // Traverse Right Node
                currentNode = search(target, type, currentNode);
                break;

            }
        } while (currentNode != null);

        return currentNode;
    }


    /**
        If you want to destroy the object, destroy the references TO THAT OBject
        i.e ... Go to the ParentNode and the destroy the references to the Current Object
     */

    public void remove(int target) {
        System.out.println("\nRemoving Element: " + target);
        Node targetNode = search(target, BinarySearchTree.ITERATION_TYPE_ITERATIVE, rootNode);

        // Find Parent of TargetNode
        Node parentTargetNode = search(targetNode.getParentValue(), BinarySearchTree.ITERATION_TYPE_ITERATIVE, rootNode);


        // Find number of Children
        if(targetNode.hasChildren() == 0) {

            // Scenario #1 - Root Node (This scenario - only one node exists)
            if(parentTargetNode ==  null) {
                rootNode = null;
                return;
            }

            System.out.println("ParentNode: " + parentTargetNode.getValue());

            // Scenario #2 - Child Node
            if(parentTargetNode.getLeftChildNode() != null &&
                    parentTargetNode.getLeftChildNode().getValue() == targetNode.getValue()) {
                parentTargetNode.setLeftChildNode(null);

            } else if(parentTargetNode.getRightChildNode() != null &&
                    parentTargetNode.getRightChildNode().getValue() == targetNode.getValue()) {
                parentTargetNode.setRightChildNode(null);
            }

        } else if(targetNode.hasChildren() == 1) {

            // Scenario #1 - Root Node
            if(parentTargetNode == null) {

                // Find the Predecessor
                Node predecessorNode = findPredecessor(targetNode.getValue());
                System.out.println("Predecessor: " + predecessorNode.getValue());

                // Move the Root Node to the Second Value

                // Create tempNode Reference to delete the Root Node

                // Delete tempNode

                return;
            }

            System.out.println("ParentNode: " + parentTargetNode.getValue());

            // Scenario #2 - Child Node
            if(parentTargetNode.getLeftChildNode() != null &&
                    parentTargetNode.getLeftChildNode().getValue() == targetNode.getValue()) {

                if(targetNode.getLeftChildNode() != null) {
                    parentTargetNode.setLeftChildNode(targetNode.getLeftChildNode());
                    targetNode.getLeftChildNode().setParentValue(parentTargetNode.getValue());      // Set the Parent Node of the child of the Target Node to the Parent node

                } else {
                    parentTargetNode.setLeftChildNode(targetNode.getRightChildNode());
                    targetNode.getRightChildNode().setParentValue(parentTargetNode.getValue());      // Set the Parent Node of the child of the Target Node to the Parent node
                }

            } else if(parentTargetNode.getRightChildNode() != null &&
                    parentTargetNode.getRightChildNode().getValue() == targetNode.getValue()) {

                if(targetNode.getLeftChildNode() != null) {
                    parentTargetNode.setRightChildNode(targetNode.getLeftChildNode());
                    targetNode.getLeftChildNode().setParentValue(parentTargetNode.getValue());      // Set the Parent Node of the child of the Target Node to the Parent node

                } else {
                    parentTargetNode.setRightChildNode(targetNode.getRightChildNode());
                    targetNode.getRightChildNode().setParentValue(parentTargetNode.getValue());      // Set the Parent Node of the child of the Target Node to the Parent node
                }

            }


        } else if (targetNode.hasChildren() == 2 ) {

            // Find Successor of currentNode
            Node successorNode = findSuccessor(targetNode.getValue());
            int successorValue = successorNode.getValue();
            System.out.println("SuccessorNode: " + successorValue);


            // Scenario #1 - Root Node
            if(parentTargetNode == null) {

                // Delete the Successor Node
                remove(successorNode.getValue());

                // Set the value of the Root Node to the value of the Successor
                targetNode.setValue(successorValue);
                if(targetNode.getLeftChildNode() != null)
                        targetNode.getLeftChildNode().setParentValue(targetNode.getValue());

                if(targetNode.getRightChildNode() != null)
                    targetNode.getRightChildNode().setParentValue(targetNode.getValue());

                return;
            }

            System.out.println("ParentNode: " + parentTargetNode.getValue());

            // Scenario #2 - Child Node
            // Locate the parentSuccessor Node
            Node parentSuccessorNode = search(successorNode.getParentValue(), BinarySearchTree.ITERATION_TYPE_ITERATIVE, rootNode);

            //If successor Node has  zero child
            if(successorNode.hasChildren() == 0) {
                if(parentSuccessorNode.getLeftChildNode() != null &&
                        parentSuccessorNode.getLeftChildNode().getValue() == successorNode.getValue()) {
                    parentSuccessorNode.setLeftChildNode(null);

                }else if(parentSuccessorNode.getRightChildNode() != null &&
                        parentSuccessorNode.getRightChildNode().getValue() == successorNode.getValue()) {
                    parentSuccessorNode.setRightChildNode(null);
                }

                // Replace current Node with successor
                targetNode.setValue(successorValue);

            } else if(successorNode.hasChildren() == 1) {

                if(parentSuccessorNode.getLeftChildNode() != null &&
                        parentSuccessorNode.getLeftChildNode().getValue() == successorNode.getValue()) {

                    if(successorNode.getLeftChildNode() != null) {
                        parentSuccessorNode.setLeftChildNode(successorNode.getLeftChildNode());

                    } else if(successorNode.getRightChildNode() != null) {
                        parentSuccessorNode.setRightChildNode(successorNode.getRightChildNode());
                    }


                } else if(parentSuccessorNode.getRightChildNode() != null &&
                        parentSuccessorNode.getRightChildNode().getValue() == successorNode.getValue()) {

                    if(successorNode.getLeftChildNode() != null) {
                        parentSuccessorNode.setRightChildNode(successorNode.getLeftChildNode());

                    } else if(successorNode.getRightChildNode() != null) {
                        parentSuccessorNode.setRightChildNode(successorNode.getRightChildNode());

                    }
                }

                // Replace current Node with successor
                targetNode.setValue(successorValue);
                setParentOfChildrenOfTargetNode(successorValue);

            } else if (successorNode.hasChildren() == 2) {
                System.out.println("Wtf ???");
            }

        } else {
            System.out.println("Node has Some Weird ass number of Kids");
        }


        System.out.println("Removal complete");
    }



    public Node findPredecessor(int target) {

        Node currentNode = search(target, ITERATION_TYPE_ITERATIVE, rootNode);

        // If the Left subtree is NOT Null -> Find the Larges Node in the Left Subtree
        if(currentNode.getLeftChildNode() != null) {
            currentNode = findLargestNode(currentNode.getLeftChildNode());
            System.out.println("Target: " + target + "     Predecessor Node: " + currentNode.getValue());

            return currentNode;
        }

        while(currentNode != null && currentNode.getValue() >= target) {
            currentNode = search(currentNode.getParentValue(), ITERATION_TYPE_ITERATIVE, rootNode);
        }

        if(currentNode != null)
            System.out.println("Target: " + target + "      Predecessor Node: " + currentNode.getValue());
        else
            System.out.println("No Successor Found for value: " + target );

        return currentNode;
    }

    public Node findSuccessor(int target) {

        // Find the Node with the value of "target"
        Node currentNode = search(target, ITERATION_TYPE_ITERATIVE, rootNode);


        // If the right subtree is NOT null -> Find the smallest Node in the Right Subtree
        if(currentNode.getRightChildNode() != null) {
            currentNode = findSmallestNode(currentNode.getRightChildNode());
            System.out.println("Target: " + target + "      Successor Node: " + currentNode.getValue());

            return currentNode;
        }

        // If right Subtree is Null -> Return the current Node
        // Why ? Because the target being passed is the direct Parent Node


        // Check if the current Node is smaller than the target
        while (currentNode != null && currentNode.getValue() <= target) {
            currentNode = search(currentNode.getParentValue(), ITERATION_TYPE_ITERATIVE, rootNode);
        }

        if(currentNode != null)
            System.out.println("Target: " + target + "      Successor Node: " + currentNode.getValue());
        else
            System.out.println("No Successor Found for value: " + target );

        return currentNode;
    }


    public void findMin() {
        Node currentNode = rootNode;
        while(currentNode.getLeftChildNode() != null) {
            currentNode = currentNode.getLeftChildNode();
        }
        System.out.println("Minimum Value in BST: " + currentNode.getValue());
    }

    public void findMax() {
        Node currentNode = rootNode;
        while (currentNode.getRightChildNode() != null) {
            currentNode = currentNode.getRightChildNode();
        }
        System.out.println("Maximum Value in BST: " + currentNode.getValue());
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

    /**
     Dont forget to check if the Current Node is THE SMALLEST Node
     */
    public Node findSmallestNode(int target) {

        // Start from the current Node
        Node currentNode = search(target, ITERATION_TYPE_ITERATIVE, rootNode);

        // Determine which subtree we are in


        if(target < rootNode.getValue()) {      //Check Left Subtree

            while (currentNode.getRightChildNode() != null) {
                currentNode = currentNode.getRightChildNode();
            }
            System.out.println("Smallest Element In LEFT Subtree: " + currentNode.getValue());

        } else if(target > rootNode.getValue()) {  // Check Right Subtree

            while (currentNode.getLeftChildNode() != null) {
                currentNode = currentNode.getLeftChildNode();
            }

            System.out.println("Smallest Element In RIGHT Subtree: " + currentNode.getValue());
        }


        return currentNode;
    }

    public Node findSmallestNode(Node target) {

        Node currentNode = target;
        while(currentNode.getLeftChildNode() != null) {
            currentNode = currentNode.getLeftChildNode();
        }
        return currentNode;
    }


    public Node findLargestNode(Node target) {

        Node currentNode = target;
        while(currentNode.getRightChildNode() != null) {
            currentNode = currentNode.getRightChildNode();
        }
        return currentNode;
    }

    private void setParentOfChildrenOfTargetNode(int nodeValue) {

        // Search for Node
        Node parentNode = search(nodeValue, ITERATION_TYPE_ITERATIVE, rootNode);

        // Set the Left Child Node to Parent
        if(parentNode.getLeftChildNode() != null) {
            parentNode.getLeftChildNode().setParentValue(parentNode.getValue());
        }

        // Set the Right Child Node to the Parent
        if(parentNode.getRightChildNode() != null) {
            parentNode.getRightChildNode().setParentValue(parentNode.getValue());
        }

    }

    //endregion


}
