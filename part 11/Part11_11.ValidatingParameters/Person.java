package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.equals("") || name.length() > 40 || !(0 <= age && age <= 120)) {
            throw new IllegalArgumentException("Invalid parameters");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
