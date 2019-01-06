package Misc.Abstract_Interfaces.Interface.NestedInterfaces;

/**
 * Created by timmanas on 2017-08-21.
 */
public class SubClass extends Base implements Base.InnerPublicInterface,
                                 Base.InnerProtectedInterface,
                                 ParentInterface.SubInterface,
                                 ParentInterface {        // Cannot Reference Private or Protected


    //region InnerPublicInterface Methods
    @Override
    public void showPublic() {
        System.out.println("Showing from SubClass -  InnerPublicInterface ");
    }

    @Override
    public void printPublic() {
        System.out.println("Printing from Public Subclass - InnerPublicInterface");
    }
    //endregion


    //region InnerProtectedInterface
    @Override
    public void showProtected() {
        System.out.println("Showing from SubClass -  InnerProtectedInterface ");
    }

    @Override
    public void printProtected() {
        System.out.println("Printing from Public Subclass - InnerProtectedInterface");
    }

    //endregion


    //region SubInterface
    @Override
    public void showSubInterface() {
        System.out.println("Showing from SubClass -  SubInterface ");
    }

    @Override
    public void printSubInterface() {
        System.out.println("Printing from Public Subclass - SubInterface");
    }
    //endregion


    //region ParentInterface
    @Override
    public void showParentInterface() {

    }

    @Override
    public void printParentInterace() {

    }
    //endregion

    //region Abstract Methods
    @Override
    public String getAbstractName() {
        return null;
    }

}
