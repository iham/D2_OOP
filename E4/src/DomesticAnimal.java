package E4.src;

public abstract class DomesticAnimal extends Animal {
    public String name = "";

    public DomesticAnimal(int age, String name) {
        super(age);
        this.name = name;
    }
}
