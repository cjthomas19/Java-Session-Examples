package Day3.classes;

public class HelloClasses {

    public static void main(String[] args) {

        Greeter g = new Greeter("this is my message!");

        g.greet();

        g.setMessage("this is my new message!");

        g.greet();

    }
    
}