package Misc.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by timmanas on 2018-07-04.
 */
public class WilcardAndGenericExample {

    //region Members
    //endregion

    //region Main
    public static void main(String [] args) {





    }

    //endregion


    //region Functions
    // Generic
    public static <E> void funct1  (List<E> listVariable) {
    }

    // Wildcard
    public static void funct2(List<?> listVariable) {
    }


    public static <T> void funct3(List<T> listVariable, T tVariable) {
        listVariable.add(tVariable);
    }

//    public static void funct4(List<?> listVariable, ? somethingVariable) {          // Error ... Wildcard can only be used as REFERENCE PARAMETERS
//    }
//
//    public static void funct5(List<?> listVariable, Object objectVariable) {
//        listVariable.add(objectVariable);                                           // Error  ....
//    }


    //endregion




}
