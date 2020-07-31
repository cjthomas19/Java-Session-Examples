package Day5.Animals;

public class MainTest {

    public static void main(String[] args) {
        Dog d = new Dog("rufus","golden",5,4);
        Cat c = new Cat("garfield","orange", 32, 4);

        d.makeNoise();
        c.makeNoise();
    }
    
}