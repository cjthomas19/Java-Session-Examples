package Day6.Vehicles;

public class Bike implements Vehicle {

    private String rider;
    private int riderEnergyPercent = 100;

    public Bike(String rider) {
        this.rider = rider;
    }

    public void move() {
        System.out.println(rider + " is pedaling");
        riderEnergyPercent -= 70;
    }

    public String checkStatus() {
        return (riderEnergyPercent<40)?((rider) + " is tired"):((rider) + " is doing well");
    }
    
    
}