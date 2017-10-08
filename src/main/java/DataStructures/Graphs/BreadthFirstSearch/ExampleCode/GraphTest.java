package DataStructures.Graphs.BreadthFirstSearch.ExampleCode;

/**
 * Created by timmanas on 2017-10-07.
 */
public class GraphTest {


    //region Main
    public static void main(String[] args) {

        // Create Nodes
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        GraphNode node5 = new GraphNode(5);
        GraphNode node6 = new GraphNode(6);
        GraphNode node7 = new GraphNode(7);
        GraphNode node8 = new GraphNode(8);
        GraphNode node9 = new GraphNode(9);

        //Set Neighbours
        node1.setNeighbors(new GraphNode[]{node2,node3,node5});
        node2.setNeighbors(new GraphNode[]{node1,node4, node6});
        node3.setNeighbors(new GraphNode[]{node1,node4,node5});
        node4.setNeighbors(new GraphNode[]{node2,node3,node5, node7});
        node5.setNeighbors(new GraphNode[]{node1,node3,node4});
        node6.setNeighbors(new GraphNode[]{node2});
        node7.setNeighbors(new GraphNode[]{node4, node8});
        node8.setNeighbors(new GraphNode[]{node7, node9});
        node9.setNeighbors(new GraphNode[]{node8});

        breathFirstSearch(node3, 9);
    }
    //endregion

    //region Helper
    public static void breathFirstSearch(GraphNode root, int target){

        System.out.println("=========== BreathFirst Search ===========");
        System.out.println("Target: " + target);

        if(root.getVal() == target)
            System.out.println("Found in Root Node");

        // Create a Queue
        Queue queue = new Queue();
        root.setVisited(true);
        queue.enqueue(root);                           // Add Node to Root


        while(queue.getFirst() != null){

            GraphNode currentNode = queue.dequeue();          // Remove the Element in the Queue
            System.out.println("\n-- Current Node: " + currentNode.getVal());

            for(GraphNode node: currentNode.getNeighbors()){

                // If Node has Not been Visited ->  Search the neighbours of this Node
                if(!node.isVisited()){

                    System.out.println("Node: " + node.getVal());
                    node.setVisited(true);
                    if(node.getVal() == target)  {
                        System.out.println("Found "+ node.getVal());             // Found Value
                    }
                    queue.enqueue(node);                            // What does this do ??

                }else {
                    System.out.println("Node Already Visited: " + node.getVal());
                }

            }
        }
    }
    //endregion

}

/**

 Questions

 1. Why do we use a Queue ??
 - We need to check the Neighbours first
 - Hence, we use a Queue to keep track of which neighbour was visited first

 2. The Queue only keeps track of First & Last ? Why ?
 - The first is the only one you need to know
    - It has pointer to the next node
 - The last only keeps track of the last integer


 */