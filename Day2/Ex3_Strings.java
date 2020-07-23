package Day2;

import java.util.Scanner;

public class Ex3_Strings {
    
    public static void main(String[] args) {

        //Initialize our scanner object
        Scanner inStream = new Scanner(System.in);

        //Prompt the user for a string, and store the input
        System.out.print("Enter a word, then press enter: ");
        String userInput = inStream.nextLine();

        //Display that back to the user
        System.out.println("You entered: " + userInput);

        //Add a line break
        System.out.println();

        //Display some information using string functions!

        int length = userInput.length();

        System.out.println("That word is " + length + " letters long.");

        System.out.println("It starts with the letter " + userInput.charAt(0));

        System.out.println("It ends with the letter " + userInput.charAt(length - 1));

        System.out.println();

        //Now, let's get a new word
        System.out.print("Enter another word, or the same one: ");
        String userInput2 = inStream.nextLine();

        //Display it back to the user
        System.out.println("You entered: " + userInput2);
        System.out.println();

        //Display whether you entered the same word (not case sensitive)
        System.out.println("Are the words the same? " + userInput.equalsIgnoreCase(userInput2));

        //Why doesn't this work?
        //System.out.println("Are the words the same? " + (userInput == userInput2));

        inStream.close();

    }
}