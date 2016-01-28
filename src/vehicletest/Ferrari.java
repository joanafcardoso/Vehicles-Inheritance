package vehicletest;

/**
 * Created by Cardoso on 27-Jan-16.
 */
public class Ferrari extends Car{
    public Ferrari() {
        brand = "Ferrari";
    }

    public static int getNumberOfDoors() {
        return 2;
    }

    public int getNumberOfWheels() {
        return 8;
    }

    public int seats() {
        return 2;
    }
}
