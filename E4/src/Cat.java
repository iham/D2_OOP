package E4.src;

public class Cat extends DomesticAnimal implements ICanSay{

    public Cat(int age, String name) {
        super(age, name);
    }

    public String say() {
        return "Miau";
    }

}
