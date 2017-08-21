package Misc.Abstract_Interfaces.Interface.NestedInterfaces;

/**
 * Created by timmanas on 2017-08-21.
 */
public interface ParentInterface {

    public void showParentInterface();
    public void printParentInterace();


    public interface SubInterface {
        public void showSubInterface();
        public void printSubInterface();
    }

    // The following does not work since NESTED Interfaces can only be Public
//    protected interface SubInterfaceProtected {
//        public void showSubInterface();
//        public void printSubInterface();
//    }
}
