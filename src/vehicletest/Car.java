package vehicletest;

/**
 * Created by Cardoso on 16-Jan-16.
 */
public class Car extends Vehicle {
    // the Car subclass adds 1 field
    public static String brand;

    // the Car subclass has 1 constructor
    public Car() {
        this.type = "car";
    }

    public int getNumberOfWheels(){
        return 4;
    }

    public static String getBrand() {
        return brand;
    }
}

