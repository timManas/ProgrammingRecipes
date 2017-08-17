package Misc.Abstract_Interfaces.Interface;

/**
 * Created by timmanas on 2017-08-17.
 */
public interface Vehicle {

    //region Variables
    public String licensePlate = "123456";
    public String model = "XRT19";
    //endregion

    //region Default Implemtations
    default void displayDefaultLicenseplate() {
        System.out.println("License Plate: " + licensePlate);
    }
    //endregion

    //region Static methods
    public static String displayStaticModel(){
        return "Model: " + model;
    }
    //endregion

    //region Methods
    public void changeGear();
    public void speedUp();
    public void applyBrakes();
    //endregion


}
