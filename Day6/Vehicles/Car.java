package Day6.Vehicles;

public class Car implements Vehicle {

    private String make;
    private String model;
    private int year;

    private int fuelPercent = 100;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    }

    public void move() {
        System.out.println(year + " " + make + " " + model + " is driving");
        fuelPercent -= 10;
    }

    public String checkStatus() {
        return "Fuel remaining: " + fuelPercent + "%";
    }


    //Test out our classes 
    public static void main(String[] args) {
        Vehicle v1 = new Car("Toyota", "Camry", 2016);
        Vehicle v2 = new Bike("Biker");

        v1.move();
        System.out.println(v1.checkStatus());

        v2.move();
        System.out.println(v2.checkStatus());

    }

}