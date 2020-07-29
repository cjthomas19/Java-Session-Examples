package Day4;

import java.util.Scanner;

public class P1_ArrayFor {
    
    public static void main(String[] args) {
        //Initialize our scanner
        Scanner scan = new Scanner(System.in);

        //Declare an array
        int[] values;

        //Ask the user how long we want the array
        System.out.print("How many values: ");
        int len = scan.nextInt();

        //Initialize Array
        values = new int[len];

        //Ask user for that many values
        for(int valNum = 0; valNum < len; valNum++) {

            //Ask the user for a value
            System.out.print("Enter integer #" + (valNum+1) + ": ");
            values[valNum] = scan.nextInt();

        }

        //Let's sum up the values
        int sum = 0;

        //Add everything to the sum
        for(int entry : values) {
            sum+=entry;
        }

        //Print out the sum
        System.out.println(sum);


        //Close the scanner to prevent resource leaks
        scan.close();
    }

}