package DataStructures.Trees.BinaryTreeArray;

public class BinaryTreeArray {

    public static void main(String [] args) {
        int [] input = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        System.out.print("PreOrder: ");
        traversePreOrder(input, 0);

        System.out.print("\nInOrder: ");
        traverseInOrder(input, 0);

        System.out.print("\nPostOrder: ");
        traversePostOrder(input, 0);


    }


    private static void traversePreOrder(int[] inputArr, int index) {
        if (index >= inputArr.length)
            return;

        System.out.print(inputArr[index] + ",");
        traversePreOrder(inputArr, (2*index) + 1);
        traversePreOrder(inputArr, (2*index) + 2);
    }


    private static void traverseInOrder(int[] inputArr, int index) {
        if (index >= inputArr.length)
            return;


        traverseInOrder(inputArr, (2*index) + 1);
        System.out.print(inputArr[index] + ",");
        traverseInOrder(inputArr, (2*index) + 2);
    }


    private static void traversePostOrder(int[] inputArr, int index) {
        if (index >= inputArr.length)
            return;

        traversePostOrder(inputArr, (2*index) + 1);
        traversePostOrder(inputArr, (2*index) + 2);
        System.out.print(inputArr[index] + ",");
    }

}
