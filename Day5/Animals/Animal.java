package Day5.Animals;

public abstract class Animal {

    private String name;
    private String furColor;
    private int age;
    private int numLegs;

    public Animal(String name, String furColor, int age, int numLegs) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
        this.numLegs = numLegs;
    }

    public abstract void makeNoise();

    public void walk() {
        System.out.println(name + "is walking");
    }

    public String getName() {
        return name;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }

    public int getNumLegs() {
        return numLegs;
    }

}