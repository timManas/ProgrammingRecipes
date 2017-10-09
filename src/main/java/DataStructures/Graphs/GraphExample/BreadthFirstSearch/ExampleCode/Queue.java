package DataStructures.Graphs.GraphExample.BreadthFirstSearch.ExampleCode;

/**
 * Created by timmanas on 2017-10-07.
 */
public class Queue {

    //region Members
    private GraphNode first;
    private GraphNode last;
    //endregion

    //region Getters
    public GraphNode getFirst() {return first;}

    public GraphNode getLast() {return last;}
    //endregion


    //region Utility
    public void enqueue(GraphNode n){

        if(first == null){
            first = n;
            last = first;

        }else{
            last.setNext(n);
            last = n;
        }
    }

    public GraphNode dequeue(){

        if(first == null){
            return null;

        }else{
            GraphNode temp = new GraphNode(first.getVal(), first.getNeighbors());
            first = first.getNext();                                                    // Gets rid of the first Element.
            return temp;
        }
    }
    //endregion
}
