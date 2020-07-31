package Day5;

public class Ex1_Shadowing {

    public int field;

    public Ex1_Shadowing(int field) {
        this.field = field;
    }

    public static void main(String[] args) {

        Ex1_Shadowing p2 = new Ex1_Shadowing(4);

        System.out.println(p2.field);

    }

}