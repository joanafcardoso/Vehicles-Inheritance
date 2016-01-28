package vehicletest;

/**
 * Created by Cardoso on 21-Jan-16.
 */
public class TestVehicles {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Ferrari();
        Vehicle vehicle3 = new Bus();
        Vehicle vehicle4 = new Bicycle();

        System.out.println("This " + vehicle1.getVehicleType() + " has " + vehicle1.getNumberOfWheels() +
                " wheels and " + vehicle1.seats() + " seats.");
        System.out.println("This " + vehicle2.getVehicleType() + " is a " + Ferrari.getBrand() + " with " +
                Ferrari.getNumberOfDoors() + " doors and " + vehicle2.seats() + " seats.");
        System.out.println("\nThis " + vehicle3.getVehicleType() + " has " + vehicle3.getNumberOfWheels() +
                " wheels, " + Bus.getNumberOfDoors() + " doors and " + vehicle3.seats() + " seats.");
        System.out.println("\nA " + vehicle4.getVehicleType() + " has " + vehicle4.getNumberOfWheels() +
                " wheels and " + vehicle4.seats() + " seat.");

    }
}
