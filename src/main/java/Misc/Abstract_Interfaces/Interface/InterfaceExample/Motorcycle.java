package Misc.Abstract_Interfaces.Interface.InterfaceExample;

/**
 * Created by timmanas on 2017-08-17.
 */
public class Motorcycle implements Vehicle {

    //region Variables
    private int speed;
    private int gear;
    private String licensePlate;
    //endregion

    //region Constructor
    public Motorcycle () {
        this.speed = 0;
        this.gear = 1;
        licensePlate = Vehicle.licensePlate;
    }
    //endregion

    //region Getters

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    //endregion

    //region Setters
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    //endregion

    //region Helpers
    @Override
    public void changeGear() {
        gear++;
    }

    @Override
    public void speedUp() {
        speed += 20;
    }

    @Override
    public void applyBrakes() {
        if(speed > 0)
            speed -= 20;

        if(gear > 1)
            gear --;
    }
    //endregion


}
