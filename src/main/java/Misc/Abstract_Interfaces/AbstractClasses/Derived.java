package Misc.Abstract_Interfaces.AbstractClasses;

/**
 * Created by timmanas on 2017-08-18.
 */
public class Derived extends Base {

    //region Members
    public String name;
    private String type;
    protected String info;
    protected final String derivedCase;
    public String id;
    //endregion

    //region Constructors
    public Derived () {
        // Note: By default there is a super() which calls the Parent constructor first, then this constructor
        System.out.println("Derived Constructor has been called");
        name = super.name;

//        type = super.type;            // This does not work since super.type is Private
//        type =  Base.type               // Does not work since Abstract variables are not Static ...unlike interfaces

        //        info = Base.info;           // Does not work since Abstract variables are not Static
        info = super.info;
        derivedCase = super.finalCase;
        id = "DerivedID";

    }
    //endregion

    //region Overridden Methods
    @Override
    public void abstractMethod1() {
        System.out.println("Derived Method1 was called");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("Derived Method2 was called");
    }

    // NOTICE YOU DO NOT OVERRIDE This method, despite it being in the abstract class !! Why ?
    // Because it was NOT declared abstract, hence you dont need to formally overrite it
    public void finalBaseHelperMethod () {
    }

    public static void staticMethod() {System.out.println("Derived Static Method is called");}

    public String getId() {
        return id;
    }



    //endregion

    //region Helpers

    //endregion


}
