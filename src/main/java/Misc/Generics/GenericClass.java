package Misc.Generics;

/**
 * Created by timmanas on 2017-08-12.
 */
public class GenericClass <T> {

    //region Members
    private T element;
    //endregion

    //region Helpers
    public void add (T newValue){
        this.element = newValue;
    }

    public T getElement() {
        return element;
    }

    //endregion

}
