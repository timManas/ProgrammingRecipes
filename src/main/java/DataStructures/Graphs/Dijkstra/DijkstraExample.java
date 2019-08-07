package DataStructures.Graphs.Dijkstra;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by timmanas on 2017-10-14.
 */
public class DijkstraExample {

    //region Members

    //endregion

    //region Main
    public static void main(String [] args) {

        // Create Nodes
        Node nodeA = new Node("a");
        Node nodeB = new Node("b");
        Node nodeC = new Node("c");
        Node nodeD = new Node("d");
        Node nodeE = new Node("e");

        // Construct Graph
        nodeA.addNode("b", 7);
        nodeA.addNode("c", 3);

        nodeB.addNode("a", 7);
        nodeB.addNode("c", 1);
        nodeB.addNode("d", 2);
        nodeB.addNode("e", 6);

        nodeC.addNode("a", 3);
        nodeC.addNode("b",1);
        nodeC.addNode("d", 2);

        nodeD.addNode("c", 2);
        nodeD.addNode("b", 2);
        nodeD.addNode("e", 4);

        nodeE.addNode("b", 6);
        nodeE.addNode("d", 4);

        LinkedHashMap<String, Node> nodeMap = new LinkedHashMap<>();
        nodeMap.put("a", nodeA);
        nodeMap.put("b", nodeB);
        nodeMap.put("c", nodeC);
        nodeMap.put("d", nodeD);
        nodeMap.put("e", nodeE);

        calculateShortestPath("a", nodeMap); //Change this around
    }


    //endregion

    //region Helpers
    private static void calculateShortestPath(String startNode, LinkedHashMap<String, Node> nodeMap) {

//        To Construct this we need:
//        - 2 x HashSets
//        - Dictionary of Dictionary
        HashSet<String> visitedSet = new HashSet<>();
        HashSet<String> unvisitedSet = new HashSet<>(nodeMap.keySet());
        LinkedHashMap<String, LinkedHashMap<String, String>> nodeTracker = new LinkedHashMap<>();

        // Construct the nodeTracker
        for(Map.Entry<String, Node> node : nodeMap.entrySet()) {
            String id = node.getValue().getId();

            // Set all the weights to infinity
            // Set previous nodes to be null
            String weight = "999999";
            String parentNode = null;

            LinkedHashMap<String, String> childMap = new LinkedHashMap<>();
            childMap.put("weight", weight);
            childMap.put("parentNode", parentNode);

            nodeTracker.put(id, childMap);
        }


        // Traverse through the number of times there are Node =)
        int index = 0;
        while(index < nodeMap.size()) {

            if (index == 0) {
                // Start with the StartNode First
                nodeTracker.put(startNode, modifyNode(nodeTracker, startNode, "0", null));

                // Calculcate the adjacent Node weights
                adjectAdjNodeWeights(nodeTracker, nodeMap, startNode, visitedSet);

                // Modify Visited/Unvisited Set
                visitedSet.add(startNode);
                unvisitedSet.remove(startNode);
            } else {

                // Find the Node with smallest weight
                String smallestWeightNode = fetchSmallestWeightNode(nodeTracker, visitedSet);

                // Calculcate the adjacent Node weights
                adjectAdjNodeWeights(nodeTracker, nodeMap, smallestWeightNode, visitedSet);

                // Modify Visited/Unvisited Set
                visitedSet.add(smallestWeightNode);
                unvisitedSet.remove(smallestWeightNode);


            }

            index++;
        }


        System.out.println("Node Tracker Finished");

    }



    private static void adjectAdjNodeWeights(LinkedHashMap<String, LinkedHashMap<String, String>> nodeTracker,
                                             LinkedHashMap<String, Node> nodeMap,
                                             String currentNodeId,
                                             HashSet<String> visitedSet) {


        // Get list of Adjancy Nodes
        Node currentNode = nodeMap.get(currentNodeId);
        HashMap<String, Integer> currentNodeAdjMap = currentNode.getAdjacentNode();

        for(Map.Entry<String, Integer> nodeMapEntry :  currentNodeAdjMap.entrySet()){

            // Fetch Weights
            String nodeNeighbourId = nodeMapEntry.getKey();
            int value = nodeMapEntry.getValue();

            // If Already visited we by pass it
            if (visitedSet.contains(nodeNeighbourId)) {
                continue;
            }


            // Calculate Total Weight
            int cumlativeWeight = Integer.parseInt(nodeTracker.get(currentNodeId).get("weight"));
            int totalWeight = cumlativeWeight + value;

            // Compare with nodeTracker
            if (totalWeight < Integer.valueOf(nodeTracker.get(nodeNeighbourId).get("weight"))) {
                nodeTracker.get(nodeNeighbourId).put("weight", String.valueOf(totalWeight));
                nodeTracker.get(nodeNeighbourId).put("parentNode", currentNodeId);
            }

            System.out.print("");

        }

        System.out.println("Finished with Current Node: " + currentNodeId);

        // Modify nodeTracker if needed

    }



    private static LinkedHashMap<String,String> modifyNode(LinkedHashMap<String, LinkedHashMap<String, String>> nodeTracker,
                                                           String currentNode,
                                                           String value,
                                                           String parentNode) {
        LinkedHashMap<String, String> node = nodeTracker.get(currentNode);
        node.put("weight", value);
        node.put("parentNode", parentNode);
        return node;
    }


    private static String fetchSmallestWeightNode(LinkedHashMap<String, LinkedHashMap<String, String>> nodeTracker,
                                                  HashSet<String> visitedSet) {
        String unVisitedNodeWithSmallestWeigt = null;
        int counter = 9999999;

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
            }
        }


        return unVisitedNodeWithSmallestWeigt;
    }

    //endregion


}


/**

 Dijstra Algorithm
          2
       c -- d
    3/ | \  |
 A    1|  2 | 4
    7\ |   \|
       b -- e
          6

 what ?
 - Finds the shortest path between a node and all the nodes on a graph
 - Algorithm until every node has been visited

 How ?
 - For this algorithm we use
 2 x Sets
 1 x Dictionart which contains info about

 Source:
 https://medium.com/basecs/finding-the-shortest-path-with-a-little-help-from-dijkstra-613149fbdc8e

 Node | Weight | Parent Node
 a    | 0      | -
 b    | 4      | c
 c    | 3      | a
 d    | 5      | c
 e    | 9      | d


 Note:
 - This is different from Prim since Prim creates a minimum spanning tree (MST)

 Ex:)

        a--b--c     A,B,C is MST(Prim) but A,C is Shortest Path.. Just finds the short path between two points
         \---/
 */


