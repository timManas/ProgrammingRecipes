package DataStructures.Graphs.BellmanFord;

import java.util.LinkedHashMap;
import java.util.Map;

public class BellmanFordExample {

    //region Members

    //region main
    public static void main(String args []) {

//        // Example #1
//
//        // Create Nodes
//        Node nodeA = new Node("a");
//        Node nodeB = new Node("b");
//        Node nodeC = new Node("c");
//        Node nodeD = new Node("d");
//        Node nodeE = new Node("e");
//
//        // Construct Graph
//        nodeA.addNode("b", 7);
//        nodeA.addNode("c", 3);
//
//        nodeB.addNode("a", 7);
//        nodeB.addNode("c", 1);
//        nodeB.addNode("d", 2);
//        nodeB.addNode("e", 6);
//
//        nodeC.addNode("a", 3);
//        nodeC.addNode("b",1);
//        nodeC.addNode("d", 2);
//
//        nodeD.addNode("c", 2);
//        nodeD.addNode("b", 2);
//        nodeD.addNode("e", 4);
//
//        nodeE.addNode("b", 6);
//        nodeE.addNode("d", 4);
//
//
//        LinkedHashMap<String, Node> nodeMap = new LinkedHashMap<>();
//        nodeMap.put("a", nodeA);
//        nodeMap.put("b", nodeB);
//        nodeMap.put("c", nodeC);
//        nodeMap.put("d", nodeD);
//        nodeMap.put("e", nodeE);
//
//        calculateBellManShortestPath("a", nodeMap);


        System.out.println("\n\n\nExample#2 ");

        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        Node node4 = new Node("4");
        Node node5 = new Node("5");


        // Construct graph
        node1.addNode("2", 6);
        node1.addNode("3", 5);

        node2.addNode("4", -1);

        node3.addNode("2", -2);
        node3.addNode("4", 4);
        node3.addNode("5", 3);

        node4.addNode("5", 3);



        LinkedHashMap<String, Node> nodeMap2 = new LinkedHashMap<>();
        nodeMap2.put("1", node1);
        nodeMap2.put("2", node2);
        nodeMap2.put("3", node3);
        nodeMap2.put("4", node4);
        nodeMap2.put("5", node5);


        calculateBellManShortestPath("1", nodeMap2);

    }

    private static void calculateBellManShortestPath(String startNode, LinkedHashMap<String, Node> nodeMap) {

        // To Construct we need:
        // Dictionary of Dictionary
        LinkedHashMap<String, LinkedHashMap<String, String>> nodeTracker = new LinkedHashMap<>();

        // Step1: Initialize and Construct the nodeTracker
        initializeNodeTracker(nodeTracker, nodeMap);
        System.out.println("Finished Initialization \n");

        // Step2: Relax the Nodes
        // Traverse # of Nodes
        for(int i=0; i < nodeMap.size(); i++) {

            System.out.println("\nIteration #: " + (i+1));

            // Traverse each Node
            for(Map.Entry<String, LinkedHashMap<String, String>> nodeTrackerMapEntry : nodeTracker.entrySet()) {
                String id = nodeTrackerMapEntry.getKey();
                LinkedHashMap<String, String> nodeProperties = nodeTrackerMapEntry.getValue();

                System.out.println("id: " + id);

                if(id.equalsIgnoreCase(startNode)){
                    nodeProperties.put("weight", "0");
                    nodeProperties.put("parentNode", null);
                }

                // Skip if Infinite weight found
                if (nodeProperties.get("weight").equalsIgnoreCase("99999")) {
                    System.out.println("Infinite Weight found: " + id);
                    continue;
                }

                // Get the current weight
                int currentNodeWeight = Integer.parseInt(nodeProperties.get("weight"));

                // Fetch the neighbouring node
                Node node = nodeMap.get(id);
                for(Map.Entry<String, Integer> neighrNode: node.getAdjacentNode().entrySet()) {
                    String neighNodeId = neighrNode.getKey();
                    int neighNodeWeight = neighrNode.getValue();

                    int totalWeight = currentNodeWeight + neighNodeWeight;


                    // Update the node Properties
                    if(totalWeight < Integer.parseInt(nodeTracker.get(neighNodeId).get("weight"))) {
                        nodeTracker.get(neighNodeId).put("weight", String.valueOf(totalWeight));
                        nodeTracker.get(neighNodeId).put("parentNode", id);
                    }
                }
            }

            System.out.println("End of Iteration #: " + (i+1));
        }

        // Step3: Search for Negative Cycles
        for(Map.Entry<String, LinkedHashMap<String, String>> nodeTrackerMapEntry : nodeTracker.entrySet()) {

            String id = nodeTrackerMapEntry.getKey();
            LinkedHashMap<String, String> nodeProperties = nodeTrackerMapEntry.getValue();

            // Get the current weight
            int currentNodeWeight = Integer.parseInt(nodeProperties.get("weight"));

            // Fetch the neighbouring node
            Node node = nodeMap.get(id);
            for(Map.Entry<String, Integer> neighrNode: node.getAdjacentNode().entrySet()) {
                String neighNodeId = neighrNode.getKey();
                int neighNodeWeight = neighrNode.getValue();
                int totalWeight = currentNodeWeight + neighNodeWeight;

                // Update the node Properties
                if(totalWeight < Integer.parseInt(nodeTracker.get(neighNodeId).get("weight"))) {
                    System.out.println("Negative Weight Cycle found: " + id);
                }
            }

        }

        System.out.println("Completed Bellman Ford Algorithm:" + "\n" + nodeTracker);
    }

    private static void initializeNodeTracker(LinkedHashMap<String, LinkedHashMap<String, String>> nodeTracker,
                                              LinkedHashMap<String, Node> nodeMap) {

        for(Map.Entry<String, Node> node : nodeMap.entrySet()) {
            String id = node.getKey();

            // Set all weights to infinity
            // Set all parent nodes to be null
            String weight = "99999";
            String parentNode = null;

            LinkedHashMap<String, String> childMap = new LinkedHashMap<>();
            childMap.put("weight", weight);
            childMap.put("parentNode", parentNode);
            nodeTracker.put(id, childMap);
        }
    }

}


/**

 Bell man word

 What ?
 - Another Shortest path algorithm like Dijsktra
 - Shortest path from one node to all other nodes in the graph
 - Can handle negative weights
 - CANNOT Handle negative cycles





 */