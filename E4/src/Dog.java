package E4.src;

public class Dog extends DomesticAnimal implements ICanSay {

    public Dog(int age, String name) {
        super(age, name);
    }
    public String say() {
        return "Wuff";
    }
}
