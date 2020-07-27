package Day3;
import java.util.Scanner;

public class P2_Loops {
    
    public static void main(String[] args) {
        
        //Initialize our scanner to accept user input
        Scanner scan = new Scanner(System.in);

        //Ask the user to input a number
        System.out.print("How many times do you want me to say hello? ");
        int response = scan.nextInt();

        //Repeats hello that number of times
        
        
        /* int counter = 0;

        while(counter < response) {
            counter++;
            System.out.println("Hello #" + counter);
        } */

        //--------------------------------------------------------

        /* for(int counter = 0; counter < response; counter++) {
            System.out.println("Hello #" + counter);
        } */

        int counter = 0;

        do {
            counter++;
            System.out.println("Hello #" + counter);
        } while(counter < response);
        
        //Close scanner to prevent resource leaks
        scan.close();
    }

}