package vehicletest;

/**
 * Created by Cardoso on 28-Jan-16.
 */
public class Bus extends Car{

    public Bus() {
        this.type = "bus";
    }

    public int getNumberOfWheels() {
        return 8;
    }
    public static int getNumberOfDoors() {
        return 3;
    }
}
