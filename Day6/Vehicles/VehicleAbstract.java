package Day6.Vehicles;

public abstract class VehicleAbstract {

    private int numWheels;

    //All vehicles should be able to move
    public abstract void move();

    //All vehicles have a status
    public abstract String checkStatus();

    public int getNumWheels() {
        return numWheels;
    }
    
}