package vehicletest;

/**
 * Created by Cardoso on 16-Jan-16.
 */
public abstract class Vehicle {
    //in abstract classes methods can either contain implementation or not
    public String type;

    public int seats() {
        if (this.type.equals("car")) {
            return 4;
        } else if (this.type.equals("bus")) {
            return 20;
        } else if (this.type.equals("bicycle")){
            return 1;
        }
        return 0;
    }

    public String getVehicleType(){
        return this.type;
    }

    public abstract int getNumberOfWheels();
}


