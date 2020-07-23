package Day3.classes;

public class Greeter {

    //Declare (but do not assign) a single class field - a string called greeting
    private String greeting;

    //Default constructor, no arguments will set greeting to a default value
    public Greeter() {
        this.greeting = "Hello, World!";
    }
    
    //Constructor with argument will set Greeting to that value
    public Greeter(String message) {
        this.greeting = message;
    }

    //This is our method that performs the action, printing out the class's greeting
    public void greet() {
        System.out.println(this.greeting);
    }

    //Because greeting is private, if we want to change it, we must use a method
    public void setMessage(String message) {
        this.greeting = message;
    }

    //Because greeting is private, if we want to access it, we must use a method that returns it
    public String getMessage() {
        return this.greeting;
    }

}