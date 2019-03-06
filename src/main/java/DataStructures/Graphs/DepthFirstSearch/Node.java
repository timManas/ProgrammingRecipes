package DataStructures.Graphs.DepthFirstSearch;

/**
 * Created by timmanas on 2019-03-05.
 */
public class Node {

    //region Member
    private int value;
    private Node leftNode;
    private Node rightNode;
    //endregion

    //region Constructor
    public Node(int value) {
        this.value = value;
    }
    //endregion

    //region Getters
    public int getValue() {
        return value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    //endregion


    //region Setters
    public void setValue(int value) {
        this.value = value;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    //endregion
}
