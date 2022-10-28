package E3.src;
public class E3 {
    public static void main(String[] args) {
        Person markus = new Person("Markus", "Hilbert", 999);
        System.out.println(markus);
        Person robert = new Person("Robert", 16);
        System.out.println(robert);
        System.out.println(Person.countInstances);
    }
}
