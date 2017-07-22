package DesignPatterns.Behavioural.Iterator;

/**
 * Created by timmanas on 2017-04-14.
 */
public class IteratorDesignPattern {

    public static void main(String[] args) {
        System.out.println("::: Iterator Design Pattern :::");

        NameRepository nameRepository = new NameRepository();   // Has a list of the names
        Iterator iter = nameRepository.getIterator();           // Creates the iterator

        while (iter.hasNext()) {
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }

    }
}

/**

 Iterator Design Pattern ... it literally is what it is "Iterator"

 What ?
 - Behavioural
 - Iterator is used to traverse a container(ex. List, Stack, Queues, etc) and access their elements

 Why ?
 - Allows traversal of any type of Object, even multi-object List =) ... Hell Yes
 - To access elements in a collection object sequentially without knowing it's underlying representation

 When ?
 - When we do not know the underlying representation of a Collection
 - Need to traverse it

 Notes
 - Notice that in the Iterator we have methods "hasNext()" & "next()" which returns an Object.
 - Also notice that we cast the object to the appropriate type we are looking for
 - The iterator is contained within the NameRepository... but in my opinion this is not neccessary
 - The iterator contains a reference to the List/Repository

 */