package Day2;

import java.util.Scanner;

public class P4_IfElse {

    public static void main(String[] args) {

        //Initialize our input stream scanner
        Scanner inStream = new Scanner(System.in);

        //Prompt the user for a number
        System.out.println("Enter a number: ");

        //Save that number
        int a = inStream.nextInt();

        //Prompt the user for another number
        System.out.println("Enter another number: ");

        //Save that number, too
        int b = inStream.nextInt();

        //Prompt the user for an operation
        System.out.println("Please enter ADD or SUBTRACT");

        //Save their command
        String operation = inStream.next();

        //Use an if statement to print out results based on that command
        if(operation.equalsIgnoreCase("ADD")) {

            System.out.println(a + " + " + b + " = " + (a+b));

        } else if(operation.equalsIgnoreCase("SUBTRACT")) {
            
            System.out.println(a + " - " + b + " = " + (a-b));

        } else {
            System.out.println("Invalid operation");
        }

        inStream.close();
    }

}