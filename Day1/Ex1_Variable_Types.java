package Day1;

public class Ex1_Variable_Types {

    public static void main(String[] args) {

        //Integers are representations of whole numbers (without a decimal place).
        int i_1 = 5;
        System.out.println(i_1);

        //Doubles and floats are used for numbers with decimal points.
        //Doubles are more precise and are mostly what we will use
        double d_1 = 5.66;
        double d_2 = 7.12;

        System.out.println(d_1 + d_2);

        //Characters represent individual letters and symbols
        char c_1 = 'a';

        System.out.println(c_1);

        //Booleans represent either logical true or false values
        boolean b_1 = true;
        
        System.out.println(b_1);

        //These are all primitive data types, as evidenced by the lowercase in the type delaration
        //Strings represent words or phrases. They are not primitives and are a class type.
        String s_1 = "Hello, World!";
        
        System.out.println(s_1);

    }
    
}