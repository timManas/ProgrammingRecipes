package DataStructures.ReversingALinkedList;

/**
 * Created by timmanas on 2019-02-28.
 */
public class ReversingLinkedListExample {


    public static void main (String [] args) {

        // Create Nodes
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");

        // Connext Nodes to each other
        nodeA.setNextNode(nodeB);
        nodeB.setNextNode(nodeC);
        nodeC.setNextNode(nodeD);
        nodeD.setNextNode(null);

        // Reverse the Linked List
        reverseLinkedList(nodeA);

    }

    //region Functions
    private static void reverseLinkedList(Node node) {

        Node currentNode = node;
        Node head = null;
        Node temp = null;

        System.out.println("Start of LinkedList");
        printLinkedList(currentNode);

        while (currentNode != null) {

           temp = currentNode.getNextNode();
           currentNode.setNextNode(head);
           head = currentNode;
           currentNode = temp;
        }

        System.out.println("\nReversed LinkedList");
        printLinkedList(head);



    }
    //endregion



    //region Helpers
    private static void printLinkedList(Node startNode) {
        while(startNode != null) {
            System.out.print(startNode.getValue() + "-->");
            startNode = startNode.getNextNode();
        }
    }
    //endregion

}



/**

 Notes
 - You actually need 3 pointers
    1. Keep track of the "head" of the reversed linked list
    2. One to point to current. The heads resets to the current position
    3. One to point to the next so the current knows where to go next

 - Notice we didnt initialize current, head or temp. Thats
 - Because they are actually just pointers ...pointing to the Actual Node itself
 


 */