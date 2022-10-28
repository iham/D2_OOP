package E4.src;

public abstract class Animal {
    public int age = 0;
    public String says = "";
    public static int countInstances;

    public Animal(int age) {
        this.age = age;
        countInstances++;
    }

    public String toString() {
        return "age: " + age;
    }
}
