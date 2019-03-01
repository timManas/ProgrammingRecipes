package DataStructures.ReversingALinkedList;

/**
 * Created by timmanas on 2019-02-28.
 */
public class Node {

    //region Members
    private String value;
    private Node nextNode;
    //endregion

    //region Constructor
    public Node(String value) {
        this.value = value;
    }
    //endregions


    //region Getter
    public String getValue() {
        return value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    //endregion

    //region Setter

    public void setValue(String value) {
        this.value = value;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    //endregion
}
