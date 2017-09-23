package DataStructures.Trees.BinarySearchTree;

/**
 * Created by timmanas on 2017-07-30.
 */
public class Node {

    //region Members
    public static final String LEFTCHILD = "LEFT_CHILD";
    public static final String RIGHTCHILD = "RIGHT_CHILD";

    private int value;
    private int parentValue;
    private Node leftChildNode;
    private Node rightChildNode;
    //endregion

    //region Constructor

    public Node() {
    }

    public Node(int value, int parentValue, Node leftChildNode, Node rightChildNode) {
        this.value = value;
        this.parentValue = parentValue;
        this.leftChildNode = leftChildNode;
        this.rightChildNode = rightChildNode;
    }

    //endregion

    //region Getter
    public int getValue() {
        return value;
    }

    public int getParentValue() {
        return parentValue;
    }

    public Node getLeftChildNode() {
        return leftChildNode;
    }

    public Node getRightChildNode() {
        return rightChildNode;
    }
    //endregion

    //region Setters

    public void setValue(int value) {
        this.value = value;
    }

    public void setParentValue(int value) {
        this.parentValue = value;
    }

    public void setLeftChildNode(Node leftChildNode) {
        this.leftChildNode = leftChildNode;
    }

    public void setRightChildNode(Node rightChildNode) {
        this.rightChildNode = rightChildNode;
    }

    private boolean hasChildNode(String type) {
        if(type == LEFTCHILD)
            return getLeftChildNode() == null ? false : true;

        return getRightChildNode() == null ? false : true;
    }

    //endregion

    //region Verifiers
    public int hasChildren() {

        if(this.getLeftChildNode() == null && this.getRightChildNode() == null)
            return 0;

        if(this.getLeftChildNode() != null && this.rightChildNode != null)
            return 2;

        return 1;
    }

    public boolean isLeaf() {
        return (leftChildNode == null && rightChildNode == null);
    }

    //endregion

    //region Helper


    //endregion


}
