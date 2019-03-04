package DataStructures.Trees.SortedArrayToBST;

/**
 * Created by timmanas on 2019-03-03.
 */
public class SortedArrayToBSTExample {

    //region main
    public static void main (String args []) {

        int sortedArray [] = new int[] {1,2,3,4,5,6,7,8,9};

        Node node = createBST(sortedArray, 0, sortedArray.length - 1);


        System.out.println();
    }


    //endregion

    //region Functions
    private static Node createBST(int[] sortedArray, int startIndex, int endIndex) {

        if(startIndex > endIndex) {
            return null;
        }

        int middleIndex = (startIndex + endIndex) / 2;

        // Create Node
        Node node = new Node(sortedArray[middleIndex]);

        // Set the left Node to be a BST
        node.setLeftNode(createBST(sortedArray, startIndex, middleIndex - 1));

        // Set the right Node to be a BST
        node.setRightNode(createBST(sortedArray, middleIndex + 1, endIndex));


        return node;
    }
    //endregion

}
