package Misc.ConstructorChaining;

/**
 * Created by timmanas on 2017-04-17.
 */
public class ContructorChainingDemo {

    public static void main(String [] args) {
        System.out.println();
        Temp temp = new Temp();
    }


    public static class Temp {


        public Temp() {
            this(5);
            System.out.println("Default Constructor");
        }

        public Temp(int x){
            this(5,6);
            System.out.println("Constructor 2");
        }

        public Temp(int y, int z) {
            System.out.println("Constructor 3");
        }
    }
}

/**

 Constructor Chanining

 What ?
 - Technique of calling constructors from the SAME class vs super which calls constructors from Parent classes

 Why ?
 - Need to perform multiple tasks in a single constructors
 

 */