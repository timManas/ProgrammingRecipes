package Misc.Abstract_Interfaces.AbstractClasses;

/**
 * Created by timmanas on 2017-08-18.
 */
public abstract class Base {


    //region Members
    public String name = "BaseClass";
    private String type = "BaseType";
    protected String info = "BaseInfo";
    final protected String finalCase = "BaseCase";
    //endregion

    //region Constructors
    public Base() {
        System.out.println("Base Constructor has been called");
    }
    //endregion

    //region Abstract Methods
    public abstract void abstractMethod1();
    public abstract void abstractMethod2();
    //endregion

    //region Methods
    public void baseHelperMethod() {
        System.out.println("Base Helper Method was called");
    }

    public final void finalBaseMethod() {
        System.out.println("Base Final Helper Method is called");
    }

    public static void staticMethod() { System.out.println("Base Static Helper Method is called");}


    //endregion

}
