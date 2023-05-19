import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorSortImplementation {
    public static void main(String[] args) {
        List<Person> arrayPerson = new ArrayList<Person>();

        arrayPerson.add(new Person("Janet", 26));
        arrayPerson.add(new Person("Marie", 27));
        arrayPerson.add(new Person("Jonh", 21));
        arrayPerson.add(new Person("Scoot", 25));

        System.out.println("Results without sort");
        for (Person person: arrayPerson) {
            System.out.println(person.getName() + " " + person.getAge());
        }
        System.out.println("-----------------");
        System.out.println("Results with sort");
        //Collections.sort((List) arrayPerson);
        Collections.sort((List) new Person());
        for (Person person: arrayPerson) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}

