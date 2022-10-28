package E3.src;
public class Person {
    public String firstName = "";
    public String lastName = "";
    public int age = 0;
    static int countInstances = 0;


    public Person() {
        this("John", "Dow", 999);
        this.countInstances++;

    }

    public Person(String firstName) {
        this(firstName, "UNKNOWN", 999);
        this.countInstances++;
    }
    public Person(String firstName, String lastName) {
        this(firstName, lastName, 999);
        this.countInstances++;
    }
    public Person(String firstName, int age) {
        this(firstName, "UNKNOWN", age);
        this.countInstances++;
    }
    public Person(String firstName, String lastName, int age) {
        this.countInstances++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }

    @Override
    public String toString() {
        String name = "";
        if(this.firstName.length() > 0)
            name = this.firstName;
        if(this.lastName.length() > 0)
            name += " " + this.lastName;
        name += ", " + this.age;
        if(this.isAdult()) 
            name += " | ERWACHSEN";
        return name;
    }
}
