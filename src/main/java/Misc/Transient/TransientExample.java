package Misc.Transient;

import java.io.*;

/**
 * Created by timmanas on 2018-01-10.
 */
public class TransientExample implements Serializable{

    //region Members
    private static final String path = "/Users/timmanas/ProgrammingProjects/ProgrammingRecipes/Resources/TestDocuments/SampleInput.txt";

    transient String age = "TransientAGE - 30";
    transient static String name = "TransientName - Tim";
    transient final String address = "1 Yonge St.";
    private transient String password = "TransientPassword-12345";

    private String username = "timanas";
    private String email = "HelloWorldEmail";

    //endregion


    //region Main
    public static void main(String [] args) {

        TransientExample input = new TransientExample();

        //Serialization
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(input);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Deserialization
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);


            TransientExample output = (TransientExample) ois.readObject();
            System.out.println("Username: " + output.username);
            System.out.println("Email: " + output.email);
            System.out.println("Name: " + output.name);
            System.out.println("Address: " + output.address);
            System.out.println("Age: " + output.age);
            System.out.println("Password: " + output.password);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
    //endregion

    //region Helpers

    //endregion

}


/**

 Transient Keyword

 What ?
 - Variable modifier used in Serialization

 Why ?
 - For security purposes
 - If we dont want to save the value of a particular variable, we use Transient (ex. Password)
 -

 How ?
 - When the JVM comes across a Transient keyword, it ignores the original value and saves default value


 Why does just "transient" make the value disappear ?
 - Just transient + private/public will hide the value

 Why does "transient static" make the value NOT disappear ?
 -Since static fields are not part of state of the object, there is no use/impact of using
 transient keyword with static variables.
 However there is no compilation error.

 Why does "transient final" make the value NOT disappear  ?
 - final variables are directly serialized by their values,
 so there is no use/impact of declaring final variable as transient.
 There is no compile-time error though.


 */