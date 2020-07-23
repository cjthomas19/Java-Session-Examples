package Day2;

import java.util.Scanner;

public class P1_Input {

    public static void main(String[] args) {

        //Initalize our scanner object
        Scanner scan = new Scanner(System.in);

        //Prompt the user to enter some text
        System.out.print("Enter a word: ");

        //Store input in a variable
        String str = scan.nextLine();

        //Print what the user typed
        System.out.println("You typed: " + str);

        //-------------------------NEW CODE-----------------------------//

        //Have the user enter a second value
        System.out.print("Enter another word: ");
        
        //Store second input in a variable
        String str2 = scan.nextLine();

        //Print it back at the user
        System.out.println("You typed: " + str2);

        System.out.println();

        //Check length
        System.out.println("Length of word 1: " + str.length());
        System.out.println("Length of word 2: " + str2.length());
        System.out.println();

        //Check Equality
        System.out.println("Are the strings equal");
        System.out.println(str.equalsIgnoreCase(str2));

        scan.close();
    }

}