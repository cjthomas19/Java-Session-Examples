package Day3;
import java.util.Scanner;

public class Ex1_Case {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1 or 2: ");
        int a = scan.nextInt();

        if(a == 1) {
            System.out.println("a is 1");
        } else if(a == 2) {
            System.out.println("a is 2");
        } else {
            System.out.println("a is something else");
        }


        switch(a) {
            case 1: System.out.println("a is 1");
                break;
            case 2: System.out.println("a is 2");
                break;
            default: System.out.println("a is something else");
                break;
        }

        scan.close();
    }
}