package Misc.Abstract_Interfaces.Interface.NestedInterfaces;

/**
 * Created by timmanas on 2017-08-21.
 */
public class Base {

    //region Members
    public String name = "BaseClass";
    private String type = "BaseType";
    protected String info = "BaseInfo";
    final protected String finalCase = "BaseCase";
    //endregion

    //region Interfaces

    public interface InnerPublicInterface {
        public void showPublic();
        public void printPublic();
    }

    private interface InnerPrivateInterface {           // This will NEVER BE SHOWN since it is private
        public void showPrivate();
        public void printPrivate();
    }

    protected interface InnerProtectedInterface {
        public void showProtected();
        public void printProtected();
    }


    //endregion


}
