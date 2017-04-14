package DesignPatterns.Behavioural.Iterator;

/**
 * Created by timmanas on 2017-04-14.
 */
public class IteratorDesignPattern {

    public static void main(String[] args) {
        System.out.println("::: Iterator Design Pattern :::");

        NameRepository nameRepository = new NameRepository();

        for(Iterator iter = nameRepository.getIterator(); iter.hasNext();){
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }

    }
}

/**

 Iterator Design Pattern

 What ?
 - Behavioural
 - Iterator is used to traverse a container and acces their elements

 Why ?
 - Allows polymorphic traversal
 - To access elements in a collection object sequentially without knowing it's underlying representation

 When ?
 - When we do not know the underlying representation of a Collection
 - Need to traverse it

 Notes
 - Notice that in the Iterator we have methods "hasNext()" & "next()" which returns an Object.
   The object represents a general object (i.e String, int, Object, Arraylist, etc).
 - Also notice that we cast the object to the appropriate type we are looking for


 */