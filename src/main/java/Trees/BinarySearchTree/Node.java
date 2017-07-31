package Trees.BinarySearchTree;

/**
 * Created by timmanas on 2017-07-30.
 */
public class Node {

    //region Members
    public static final String LEFTCHILD = "LEFT_CHILD";
    public static final String RIGHTCHILD = "RIGHT_CHILD";

    private int value;
    private Node parentNode;
    private Node leftChildNode;
    private Node rightChildNode;
    //endregion

    //region Constructor

    public Node() {
    }

    public Node(int value, Node parentNode, Node leftChildNode, Node rightChildNode) {
        this.value = value;
        this.parentNode = parentNode;
        this.leftChildNode = leftChildNode;
        this.rightChildNode = rightChildNode;
    }

    //endregion

    //region Getter
    public int getValue() {
        return value;
    }

    public Node getParentNode() {
        return parentNode;
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

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
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


}
