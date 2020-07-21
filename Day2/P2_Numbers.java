package Day2;

import java.util.Scanner;

public class P2_Numbers {
    
    public static void main(String[] args) {

        //Initialize Scanner utility
        Scanner inStream = new Scanner(System.in);

        //Prompt the user and save each value for two different integers
        System.out.print("Enter integer a: ");
        int a = inStream.nextInt();
        
        System.out.print("Enter integer b: ");
        int b = inStream.nextInt();

        System.out.println();

        //We can also declare variables without assigning a value
        int c;

        //Try changing the '*' (times) to another operator (+, -, or /) and see what happens:
        System.out.println(a + " times " + b + " equals " + (a * b));
        System.out.println();

        //Test if they are the same number
        System.out.println("Are these numbers the same? " + (a==b));
        System.out.println();

        //Here, we declare and assign the value of c based on the values of a and b
        c = a + b;

        //Now, the value of c is equal to the value of a + b
        System.out.println("c is a+b, which equals " + c);

        //Close the input stream to prevent resource leaks
        inStream.close();
    }
}