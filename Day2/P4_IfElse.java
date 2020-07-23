package Day2;

import java.util.Scanner;

public class P4_IfElse {

    public static void main(String[] args) {
        //Initialize our scanner

        Scanner scan = new Scanner(System.in);

        //Accept input from the user
        System.out.print("Enter integer a: ");
        int a = scan.nextInt();

        System.out.print("Enter integer b: ");
        int b = scan.nextInt();

        System.out.println();

        //Ask the user what operation they want to do

        System.out.print("Enter ADD, SUBTRACT, MULTIPLY, or DIVIDE: ");

        String operation = scan.next();

        System.out.print("Your result is: ");

        //Use if statements to decide how to proceed

        if(operation.equalsIgnoreCase("ADD")) {
            System.out.println(a + b);
        } else if(operation.equalsIgnoreCase("SUBTRACT")) {
            System.out.println(a - b);
        } else if(operation.equalsIgnoreCase("MULTIPLY")) {
            System.out.println(a * b);
        } else if(operation.equalsIgnoreCase("DIVIDE")) {
            System.out.println(a / b);
        } else {
            System.out.println("Not a valid operation.");
        }

        scan.close();
    }
    
}