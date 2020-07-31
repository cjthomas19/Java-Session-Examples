package Day5;

import java.util.Scanner;

public class P1_Recursion {

    public static void main(String[] args) {

        //Initialize our inputstream scanner
        Scanner scan = new Scanner(System.in);

        //Ask the user starting and ending numbers
        System.out.print("Start at what number: ");
        int start = scan.nextInt();

        System.out.print("End at what number: ");
        int end = scan.nextInt();

        //Ask the user what direction
        System.out.print("Count forwards (Y/N): ");
        String ans = scan.next();

        //Change answer to lowercase and take first letter
        ans = ans.toLowerCase();
        ans = ans.substring(0,1);

        //Run count with user specified options
        count(start, end, ans.equals("y"));
        
        scan.close();
    }

    //This is our recursion method
    static void count(int current, int last, boolean forwards) {

        if(forwards) System.out.println(current);

        //Call method again if not done counting
        if(current < last) {
            count(current+1, last,forwards);
        }

        if(!forwards) System.out.println(current);

    }
    
}