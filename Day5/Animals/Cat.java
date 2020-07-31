package Day5.Animals;

public class Cat extends Animal {
    
    public Cat(String name, String furColor, int age, int numLegs) {
        super(name, furColor, age, numLegs);
    }

    public void meow() {
        System.out.println("Meow");
    }

    public void makeNoise() {
        meow();
    }
}