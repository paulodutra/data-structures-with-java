import java.util.Comparator;

public class Person implements Comparator<Person>, Comparable<Person> {
    private String name;
    private int age;

    Person() {}
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    @Override
    public int compare(Person person1, Person person2) {
        return person1.age - person2.age;
    }

    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }
}
