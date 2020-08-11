package Day6.Vehicles;

public interface Vehicle {

    //All vehicles should be able to move
    public void move();

    //All vehicles have a status
    public String checkStatus();

}