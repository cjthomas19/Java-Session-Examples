package Day4.classes;

public class HelloMain {

    public static void main(String[] args) {

        //Declare, instantiate, and initialize 3 instances of the Greeter class
        Greeter greet = new Greeter("this is another test");
        Greeter greet2 = new Greeter("this is a different message");
        Greeter greet3 = new Greeter("this is a final message");
        
        //Print all the messages
        greet.printMessage();
        greet2.printMessage();
        greet3.printMessage();

        //Check how many instances we made
        System.out.println(Greeter.getNumInstances());

    }
    

}