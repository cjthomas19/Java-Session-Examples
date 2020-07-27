package Day3;
import java.util.Scanner;

public class P3_AddLoop {

    public static void main(String[] args) {
        //Initialize user input scanner
        Scanner scan = new Scanner(System.in);

        //User modified total
        int total = 0;

        //Boolean; whether the while loop is running
        boolean running = true;

        //Our loop
        while(running) {
            //Display current total
            System.out.println("Current total: " + total);

            //Prompt for an operation
            System.out.print("ADD, SUBTRACT, END: ");
            String input = (scan.next()).toUpperCase();

            /* switch(input) {

                 case "ADD": {
                    System.out.print("How Much? ");
                    total += scan.nextInt();
                }
                    break;
                case "SUBTRACT":{
                    System.out.print("How Much? ");
                    total -= scan.nextInt();
                }
                    break;
                case "END": running = false;
                    break;
                default: System.out.println("Invalid Operation");
                    break;
            } */

            if(input.equals("ADD") || input.equals("SUBTRACT")) {
                System.out.print("How Much? ");
                int amount = scan.nextInt();

                if(input.equals("ADD")) 
                    total+=amount;
                else
                    total -= amount;

            } else if(input.equals("END")) {
                running = false;
            } else {
                System.out.println("Invalid Operation");
            }

        }

        System.out.println("Final total: " + total);

        scan.close();
    }

}