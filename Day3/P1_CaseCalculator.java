package Day3;

import java.util.Scanner;

public class P1_CaseCalculator {
    
    public static void main(String[] args) {

        //Initialize our scanner
        Scanner scan = new Scanner(System.in);

        //Prompt user for two integers, and store responses
        System.out.print("Enter an integer: ");
        int a = scan.nextInt();
        System.out.print("Enter another integer: ");
        int b = scan.nextInt();

        //Prompt user for an operation
        System.out.print("Enter ADD, SUBTRACT, MULTIPLY, or DIVIDE: ");
        String operation = scan.next();

        //Remove case sensitivity
        operation = operation.toLowerCase();
        
        //Switch based on operation
        switch(operation) {
            case "add": System.out.println(a + b); 
                break;
            case "subtract": System.out.println(a - b);
                break;
            case "multiply": System.out.println(a * b);
                break;
            case "divide": System.out.println(a / b);
                break;
            default: System.out.println("Invalid operation");
                break;
        }

        //Close scanner to prevent resource leaks
        scan.close();
    }

}