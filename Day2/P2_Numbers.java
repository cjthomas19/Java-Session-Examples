package Day2;

import java.util.Scanner;

public class P2_Numbers {

    public static void main(String[] args) {

        //Initialize our scanner to handle user input
        Scanner scan = new Scanner(System.in);

        //Prompt the user to input a number
        System.out.print("Enter an integer: ");

        //Save the user's input as a integer
        int a = scan.nextInt();

        //Print the user's input back out at them
        System.out.println("You entered: " + a);
        System.out.println();

        //Prompt the user for another number
        System.out.print("Enter another integer: ");

        //Save the user's second input as an integer
        int b = scan.nextInt();

        //Print the user's input back
        System.out.println("You entered: " + b);
        System.out.println();
        
        //Multiply a and b
        int product = a * b;

        System.out.println("the product of your numbers is: " + product);

        //Check for equality
        System.out.println("Are your numbers the same? " + (a==b));
        
        scan.close();
    }

}