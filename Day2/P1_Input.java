package Day2;

import java.util.Scanner;

public class P1_Input {

    public static void main(String args[]) {

        //Initialize a variable, 'scan', as our scanner object
        Scanner inputStream = new Scanner(System.in);

        //Prompt the user for input
        System.out.print("Write something: ");

        //Store the value of the scanner's input line as a string
        String inString = inputStream.nextLine();

        //Print the user's input back to them
        System.out.println("You wrote: " + inString);

        //Close scanner to prevent resource leaks
        inputStream.close();

    }

}