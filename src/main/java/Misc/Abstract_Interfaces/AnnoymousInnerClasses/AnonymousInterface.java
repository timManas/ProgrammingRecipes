package Misc.Abstract_Interfaces.AnnoymousInnerClasses;

/**
 * Created by timmanas on 2017-08-22.
 */
public interface AnonymousInterface {
    String type = "AnonymousInterface";
    String name = "AnonymousInterfaceName";

    public String interfaceID = "id-007";
//    protected String interfaceTag = "tag-007";    #Notice this does not work work
//    private String interfaceTag2 = "tag2-777";    #Notice this also does not work

    public void show();

    public abstract void abstractMethod();

//    protected void protectedMethod();           // Does not work ... cannot be protected or private
//    private void privateMethod();

    public void randomMethod();

}


/**
Interfaces

 - Must have public member names ..private or protected is NOT allowed
 - All members are declared "final public static" ...BY DEFAULT
 - You can store members with definitions on interfaces ...Similar to Abstract classes


 */