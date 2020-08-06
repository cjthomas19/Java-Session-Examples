package Day5.Animals;

public class Dog extends Animal {

    public Dog(String name, String furColor, int age, int numLegs) {
        super(name, furColor, age, numLegs);
    }

    public void bark() {
        System.out.println(getName() + " says Woof");
    }

    public void makeNoise() {
        //bark();
    }


}