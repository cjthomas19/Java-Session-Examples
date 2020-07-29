package Day4.classes;

public class Greeter {

    //Instance variable for message
    private String message;
    private static int numInstances = 0;
    
    //Define a constructor
    public Greeter() {
        this.message = "default";
        numInstances++;
    }

    //Define an alternate constructor
    public Greeter(String str) {
        this();
        this.message = str;
    }

    //Our method to actually print message
    public void printMessage() {
        System.out.println(this.message);
    }

    //Define a setter method
    public void setMessage(String str) {
        this.message = str;
    }

    //Define a getter method
    public String getMessage() {
        return this.message;
    }

    //Define a getter method for instances
    public static int getNumInstances() {
        return numInstances;
    }
}