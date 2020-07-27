package Day3;

public class Ex2_Logic {

    public static void main(String[] args) {

        //Declare two integers we will do comparisons on
        int a = 5;
        int b = 10;

        //Adding an exclamation point in front of a logical value negates it, and != means "doesn't equal"
        if(a != b) {
            System.out.println("a and b are different");
        }

        //Comparison operators in math class (>,<,>=,<=) are available
        if(a >= b) {
            System.out.println("a is greater than or equal to b");
        } else {
            System.out.println("a is less than b");
        }

        //Multiple conditions can be linked using && (and) and || (or)

        int c = 20;
        
        if((a < c) && (b != c)) {
            System.out.println("a is less than c, and b is not equal to c");
        }

        //It is important to note that AND takes precedence over OR
        if(a==c && true || false) {
            System.out.println("Will not run, because false && true evaluates to false first");
        }
    }
}