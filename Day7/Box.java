package Day7;

import java.util.ArrayList;

public class Box<TYPE> {

    private TYPE value;

    public Box(TYPE value) {
        this.value = value;
    }

    public TYPE getValue() {
        return value;
    }

    public void setValue(TYPE value) {
        this.value = value;
    } 


    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<Integer>();

        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);

        for(int i = 0; i < arrList.size(); i++) {
            System.out.println( arrList.get(i) );
        }

        for( int a : arrList) {
            System.out.println(a);
        }

    }
    
}