package DataStructures.Graphs.Prim;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by timmanas on 2019-08-20.
 */
public class PrimsExample {

    //region Members

    //endregion


    //region Main
    public static void main(String [] args) {

        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");

        // Construct Graph
        nodeA.addNode("D", 3);
        nodeA.addNode("B", 2);
        nodeA.addNode("C", 3);

        nodeB.addNode("A", 2);
        nodeB.addNode("C", 4);
        nodeB.addNode("E", 3);

        nodeC.addNode("A", 3);
        nodeC.addNode("B", 4);
        nodeC.addNode("D", 5);
        nodeC.addNode("E", 1);
        nodeC.addNode("F", 6);

        nodeD.addNode("A", 3);
        nodeD.addNode("C", 5);
        nodeD.addNode("F", 7);

        nodeE.addNode("B", 3);
        nodeE.addNode("C", 1);
        nodeE.addNode("F", 8);

        nodeF.addNode("G", 9);

        LinkedHashMap<String, Node> nodeMap = new LinkedHashMap<>();
        nodeMap.put("A", nodeA);
        nodeMap.put("B", nodeB);
        nodeMap.put("C", nodeC);
        nodeMap.put("D", nodeD);
        nodeMap.put("E", nodeE);
        nodeMap.put("F", nodeF);
        nodeMap.put("G", nodeG);

        calculateMinimumSpanningTree("A", nodeMap);

    }

    private static void calculateMinimumSpanningTree(String startNode, LinkedHashMap<String, Node> nodeMap) {

        // To contruct with need
        // 1 x HashSet
        // 1 x Dictionary of Dictionary

        HashSet<String> visitedSet = new HashSet<>();
        LinkedHashMap<String, LinkedHashMap<String, String>> nodeTracker = new LinkedHashMap<>();

        // Initialize and Construct the nodeTracker
        initializeNodeTracker(nodeTracker, nodeMap);

        // Traverse through all Nodes
        int index = 0;
        while (index < nodeMap.size()) {

            String smallestWeightNode;
            if (index == 0 ) {
                // Start with the Start Node
                LinkedHashMap<String, String> node = nodeTracker.get(startNode);
                node.put("weight", "0");
                node.put("parentNode", null);

                nodeTracker.put(startNode, node);
                System.out.println();
                smallestWeightNode = startNode;

            } else {
                // Find the Node with smallest weight
                smallestWeightNode = fetchSmallestWeightNode(nodeTracker, visitedSet);
            }

            // Add node to visited Set
            visitedSet.add(smallestWeightNode);

            // Modify table with Node neighbours
            calcAdjNodeWeights(nodeTracker, nodeMap, smallestWeightNode, visitedSet);




            index++;
        }



        System.out.println("Finished");
    }

    private static String fetchSmallestWeightNode(LinkedHashMap<String, LinkedHashMap<String, String>> nodeTracker,
                                                  HashSet<String> visitedSet) {
        String unVisitedNodeWithSmallestWeigt = null;
        int counter = 9999999;

        // Traverse throught entire Array
        for(Map.Entry<String, LinkedHashMap<String, String>> nodeMapEntry : nodeTracker.entrySet()) {
            String nodeId = nodeMapEntry.getKey();
            LinkedHashMap<String, String> nodeProperties = nodeMapEntry.getValue();
            int nodeWeight = Integer.parseInt(nodeProperties.get("weight"));

            if (visitedSet.contains(nodeId)) {
                continue;
            }

            if (nodeWeight < counter) {
                counter = nodeWeight;
                unVisitedNodeWithSmallestWeigt = nodeId;
                System.out.println("Weight modified for Node: " + nodeId);
            }
        }


        return unVisitedNodeWithSmallestWeigt;
    }
    //endregion


    private static void initializeNodeTracker(LinkedHashMap<String, LinkedHashMap<String, String>> nodeTracker,
                                              LinkedHashMap<String, Node> nodeMapTemp) {

        for(Map.Entry<String, Node> node : nodeMapTemp.entrySet()) {
            String id = node.getValue().getId();

            // Set all the weights to infinity
            // Set previous nodes to be null
            String weight = "9999999";
            String parentNode = null;

            LinkedHashMap<String, String> childMap = new LinkedHashMap<>();
            childMap.put("weight", weight);
            childMap.put("parentNode", parentNode);

            nodeTracker.put(id, childMap);
        }
    }

    private static void calcAdjNodeWeights(LinkedHashMap<String, LinkedHashMap<String, String>> nodeTracker,
                                           LinkedHashMap<String, Node> nodeMap,
                                           String currentNodeId,
                                           HashSet<String> visitedSet) {

        // Get list of Adjancy Nodes
        Node currentNode = nodeMap.get(currentNodeId);
        HashMap<String, Integer> currentNodeAdjMap = currentNode.getAdjacentNode();

        // Traverse Current Node Neighbours and modify the table
        for(Map.Entry<String, Integer> nodeMapEntry :  currentNodeAdjMap.entrySet()){

            // Fetch Weights and Value
            String nodeNeighbourId = nodeMapEntry.getKey();
            int value = nodeMapEntry.getValue();

            // If Already visited we by pass it
            if (visitedSet.contains(nodeNeighbourId)) {
                continue;
            }

            /**
             *
             *  Note !!!!!
                The difference between Prims and Dijkstra is
                 int cumlativeWeight = Integer.parseInt(nodeTracker.get(currentNodeId).get("weight"));
                 int totalWeight = cumlativeWeight + value;

                For Prim - We just compare the existing weight on the Graph but Dijsktra compared the cumalative weight
             */

            int totalWeight = value;

            // We compare the dictionary Node Value with the Existing Node Weight
            if (totalWeight < Integer.valueOf(nodeTracker.get(nodeNeighbourId).get("weight"))) {
                nodeTracker.get(nodeNeighbourId).put("weight", String.valueOf(value));
                nodeTracker.get(nodeNeighbourId).put("parentNode", currentNodeId);
            }
        }
    }
}

/**

 Prims Algorithm

 What ?
 - Greedy algorithm
 - Creates minimum spanning tree (Shortest distance between all the nodes, therefore creating a tree)

 How ?
 - Functions very similarly to Dijsktra

 Steps
 - Pick Random Node to start
    - If not the first, Pick smallest Node
 - Add Node to visited Set
 - Modify the nodeTracker Table with the neighbour nodes (if needed)
    - If original Weight on the graph  is smaller than the NodeTracker Weight
        -> Set the nodeTracker to the original weight (Weight drawn on the graph)
 - Repeat


 Note: Funcitons very similary to Dijkstra algorithm

 */
