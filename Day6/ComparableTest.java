package Day6;

public class ComparableTest implements Comparable<ComparableTest> {

    private int value;

    public ComparableTest(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(ComparableTest other) {

        if(other.getValue() == this.getValue()) {
            return 0;
        } else if(other.getValue() < this.getValue()) {
            return 1;
        } else {
            return -1;
        }



    }


    public static void main(String[] args) {

        ComparableTest t1 = new ComparableTest(500);
        ComparableTest t2 = new ComparableTest(1);

        System.out.println(t1.compareTo(t2));

    }
    
}